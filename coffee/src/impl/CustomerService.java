package impl;

import DTO.CustomerDTO;

public interface CustomerService {

    void validateAndSave(CustomerDTO customerDTO);
}
