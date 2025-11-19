package service;

import DTO.CoffeeDTO;
import impl.CoffeeService;

public class CoffeeServiceImpl implements CoffeeService {
    @Override
    public void validateAndSave(CoffeeDTO coffeeDTO) {
        System.out.println("Coffee info");
    }
}
