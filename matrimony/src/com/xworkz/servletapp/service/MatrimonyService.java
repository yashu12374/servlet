package com.xworkz.servletapp.service;

import com.xworkz.servletapp.dto.MatrimonyDTO;
import com.xworkz.servletapp.exception.DataInValidException;

public interface MatrimonyService {
   void validateAndSave(MatrimonyDTO matrimonyDTO)throws DataInValidException;
}
