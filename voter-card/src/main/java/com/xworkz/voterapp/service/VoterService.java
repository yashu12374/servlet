package com.xworkz.voterapp.service;

import com.xworkz.voterapp.DTO.SearchDTO;
import com.xworkz.voterapp.DTO.VoterDTO;
import com.xworkz.voterapp.exception.DataDuplicationException;
import com.xworkz.voterapp.exception.DataInValidException;

import java.util.Optional;

public interface VoterService {

    boolean validateAndSave(VoterDTO voterDTO)throws DataInValidException, DataDuplicationException;

    default Optional<VoterDTO> findByVoterName(SearchDTO searchDTO){
        return Optional.empty();
    }
}
