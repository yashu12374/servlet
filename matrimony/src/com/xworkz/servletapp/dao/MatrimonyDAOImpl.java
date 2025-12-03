package com.xworkz.servletapp.dao;

import com.xworkz.servletapp.DBConstants;
import com.xworkz.servletapp.dto.MatrimonyDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MatrimonyDAOImpl implements MatrimonyDAO {
    @Override
    public void save(MatrimonyDTO matrimonyDTO) {

        String insertQuery = "INSERT INTO matrimony(email, createProfileFor, gender, dateOfBirth, motherTongue, religion, maritalStatus, height) VALUES(?,?,?,?,?,?,?,?)";

        try (Connection connection = DriverManager.getConnection(DBConstants.URL.getProp(), DBConstants.USERNAME.getProp(), DBConstants.SECRET.getProp())) {

            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);

            preparedStatement.setString(1, matrimonyDTO.getEmail());
            preparedStatement.setString(2, matrimonyDTO.getForType());
            preparedStatement.setString(3, matrimonyDTO.getGender());
            preparedStatement.setDate(4, java.sql.Date.valueOf(matrimonyDTO.getDob()));
            preparedStatement.setString(5, matrimonyDTO.getMotherTongue());
            preparedStatement.setString(6, matrimonyDTO.getReligion());
            preparedStatement.setString(7, matrimonyDTO.getStatus());
            preparedStatement.setInt(8, matrimonyDTO.getHeight());

            int rows = preparedStatement.executeUpdate();
            System.out.println("Rows updated : " + rows);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



