package com.xworkz.voterapp.service;

import com.xworkz.voterapp.DAO.VoterDAO;
import com.xworkz.voterapp.DAO.VoterDAOImpl;
import com.xworkz.voterapp.DTO.SearchDTO;
import com.xworkz.voterapp.DTO.VoterDTO;
import com.xworkz.voterapp.exception.DataDuplicationException;
import com.xworkz.voterapp.exception.DataInValidException;

import java.util.Optional;

public class VoterServiceImpl implements VoterService {

    private VoterDAO voterDAO = new VoterDAOImpl();

    public VoterServiceImpl() {
        System.out.println("Voter service implemented...");
    }

    @Override
    public boolean validateAndSave(VoterDTO voterDTO) throws DataInValidException, DataDuplicationException {

        if (isInvalid(voterDTO)) {
            throw new DataInValidException("Provided voter data is invalid");
        }

        if (voterDAO.isDuplicate(voterDTO)) {
            throw new DataDuplicationException("Duplicate entry: voter ID already exists");
        }

        boolean saved = voterDAO.save(voterDTO);
        System.out.println("Voter saved: " + saved);
        return saved;
    }

    private boolean isInvalid(VoterDTO voterDTO) throws DataInValidException {
        boolean invalid = false;

        if (voterDTO.getVoterName() == null || voterDTO.getVoterName().isEmpty()) {
            System.err.println("Invalid voter name");
            invalid = true;
        }
        if (voterDTO.getFatherName() == null || voterDTO.getFatherName().isEmpty()) {
            System.err.println("Invalid father name");
            invalid = true;
        }
        if (voterDTO.getAge() < 18) {
            System.err.println("Invalid age: must be 18 or older");
            invalid = true;
        }
        if (voterDTO.getGender() == null || voterDTO.getGender().isEmpty()) {
            System.err.println("Invalid gender");
            invalid = true;
        }
        if (voterDTO.getAddress() == null || voterDTO.getAddress().isEmpty()) {
            System.err.println("Invalid voter ID");
            invalid = true;
        }
        if (invalid){
            throw new DataInValidException("Invalid data");
        }

        return invalid;

    }
    @Override
    public Optional<VoterDTO> findByVoterName(SearchDTO searchDTO) {

        String voterName = searchDTO.getVoterName();
        boolean invalid = false;

        if (voterName == null || voterName.isEmpty()) {
            System.err.println("Voter name is invalid");
            invalid = true;
        }

        if (!invalid) {
            System.out.println("Voter name is valid, will call DAO...");

            Optional<VoterDTO> optionalVoterDTO = this.voterDAO.findByVoterName(voterName);

            System.out.println("optionalVoterDTO : " + optionalVoterDTO.isPresent());

            return optionalVoterDTO;
        }

        return VoterService.super.findByVoterName(searchDTO);
    }


}
