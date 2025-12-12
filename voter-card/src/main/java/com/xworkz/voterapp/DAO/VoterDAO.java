package com.xworkz.voterapp.DAO;

import com.xworkz.voterapp.DTO.VoterDTO;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public interface VoterDAO {

    boolean save(VoterDTO voterDTO);

    boolean isDuplicate(VoterDTO voterDTO);

    default Optional<VoterDTO> findByVoterName(String voterName){
        return Optional.empty();
    }

    void update(VoterDTO voterDTO);

    default List<VoterDTO> findByAddress(String address){
        return Collections.emptyList();


    }
}
