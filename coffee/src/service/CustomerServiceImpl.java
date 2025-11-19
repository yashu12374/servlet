package service;

import DTO.CustomerDTO;
import impl.CustomerService;

public class CustomerServiceImpl implements CustomerService {
    @Override
    public void validateAndSave(CustomerDTO customerDTO) {
        System.out.println("Customer info");
    }
}
