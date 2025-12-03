package com.xworkz.servletapp.service;

import com.xworkz.servletapp.dao.MatrimonyDAO;
import com.xworkz.servletapp.dao.MatrimonyDAOImpl;
import com.xworkz.servletapp.dto.MatrimonyDTO;
import com.xworkz.servletapp.exception.DataInValidException;

public class MatrimonyServiceImpl implements MatrimonyService{

    private MatrimonyDAO matrimonyDAO=new MatrimonyDAOImpl();

    @Override
    public void validateAndSave(MatrimonyDTO matrimonyDTO) throws DataInValidException {
        boolean isInvalid = false;
        if (matrimonyDTO.getEmail() == null || matrimonyDTO.getEmail().isEmpty()) {
            System.err.println("invalid email");
            isInvalid = true;
        }
        if (matrimonyDTO.getGender() == null || matrimonyDTO.getGender().isEmpty()) {
            System.err.println("invalid gender");
            isInvalid = true;
        }
        if (matrimonyDTO.getDob() == null) {
            System.err.println("invalid dob");
            isInvalid = true;
        }
        if (matrimonyDTO.getMotherTongue() == null) {
            System.err.println("invalid motherTongue");
            isInvalid = true;
        }
        if (matrimonyDTO.getReligion() == null) {
            System.err.println("invalid religion");
            isInvalid = true;
        }
        if (matrimonyDTO.getStatus() == null) {
            System.err.println("invalid maritalStatus");
            isInvalid = true;
        }
        if (matrimonyDTO.getHeight() < 1 || matrimonyDTO.getHeight() > 7) {
            System.err.println("invalid height");
            isInvalid = true;
        }

        if (isInvalid) {
            throw new DataInValidException();
        } else {
            matrimonyDAO.save(matrimonyDTO);
        }

        }
}
