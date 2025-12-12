package com.xworkz.voterapp.service;

import com.xworkz.voterapp.DAO.VoterDAO;
import com.xworkz.voterapp.DAO.VoterDAOImpl;
import com.xworkz.voterapp.DTO.SearchDTO;
import com.xworkz.voterapp.DTO.VoterDTO;
import com.xworkz.voterapp.exception.DataDuplicationException;
import com.xworkz.voterapp.exception.DataInValidException;

import java.util.Collections;
import java.util.List;
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

        if (voterDTO.getVoterName() == null || voterDTO.getVoterName().trim().isEmpty()) {
            System.err.println("Invalid voter name");
            invalid = true;
        }
        if (voterDTO.getFatherName() == null || voterDTO.getFatherName().trim().isEmpty()) {
            System.err.println("Invalid father name");
            invalid = true;
        }
        if (voterDTO.getAge() < 18) {
            System.err.println("Invalid age: must be 18 or older");
            invalid = true;
        }
        if (voterDTO.getGender() == null || voterDTO.getGender().trim().isEmpty()
                || "Select gender".equalsIgnoreCase(voterDTO.getGender().trim())) {
            System.err.println("Invalid gender");
            invalid = true;
        }
        if (voterDTO.getAddress() == null || voterDTO.getAddress().trim().isEmpty()) {
            System.err.println("Invalid address");
            invalid = true;
        }

        if (invalid) {
            throw new DataInValidException("Invalid data");
        }

        return invalid;
    }

    @Override
    public Optional<VoterDTO> findByVoterName(SearchDTO searchDTO) {

        String voterName = searchDTO.getVoterName();
        boolean invalid = false;

        if (voterName == null || voterName.trim().isEmpty()) {
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

    @Override
    public List<VoterDTO> findByAddress(SearchDTO searchDTO) {
        System.out.println("running findByAddress : " + searchDTO);
        String address = searchDTO.getAddress();
        if (address != null && address.length() >= 3) {
            System.out.println("address is valid");
            List<VoterDTO> voterDTOS = this.voterDAO.findByAddress(address);
            System.out.println("total card from dao" + voterDTOS.size());
            return voterDTOS;
        }
        System.err.println("address is invalid");
        return Collections.emptyList();
    }

    @Override
    public boolean validAndUpdate(VoterDTO voterDTO) throws DataInValidException {
        System.out.println("running validateAndUpdate in voterService :" + voterDTO);

        isInvalid(voterDTO);

        System.out.println("valid voterDto will update using DAO");
        this.voterDAO.update(voterDTO);

        return true;
    }
}
