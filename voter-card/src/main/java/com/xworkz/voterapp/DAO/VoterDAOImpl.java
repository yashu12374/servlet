package com.xworkz.voterapp.DAO;

import com.xworkz.voterapp.Constants.DBConstants;
import com.xworkz.voterapp.DTO.VoterDTO;
import lombok.SneakyThrows;

import java.sql.*;
import java.util.Optional;

public class VoterDAOImpl implements VoterDAO{

    private static final String sql = "insert into voter_card(voterName,fatherName,age,gender,address)Values(?,?,?,?,?)";
    @Override
    public boolean save(VoterDTO voterDTO) {

        try(Connection connection = DriverManager.getConnection(DBConstants.URL.getPro(),DBConstants.USERNAME.getPro(),DBConstants.PASSWORD.getPro())){

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,voterDTO.getVoterName());
            preparedStatement.setString(2,voterDTO.getFatherName());
            preparedStatement.setInt(3,voterDTO.getAge());
            preparedStatement.setString(4,voterDTO.getGender());
            preparedStatement.setString(5,voterDTO.getAddress());

            int row = preparedStatement.executeUpdate();
            System.out.println("Row update: " +row);

            return row > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
        }
        @Override
        public boolean isDuplicate(VoterDTO voterDTO) {

        String checkQuery = "select count(*) from voter_card where voterName = ?";

        try (Connection connection = DriverManager.getConnection(
                DBConstants.URL.getPro(),
                DBConstants.USERNAME.getPro(),
                DBConstants.PASSWORD.getPro())) {

            PreparedStatement checkStmt = connection.prepareStatement(checkQuery);
            checkStmt.setString(1, voterDTO.getVoterName());

            ResultSet rs = checkStmt.executeQuery();

            int count = 0;
            if (rs.next()) {
                count = rs.getInt(1);
            }

            if (count > 0) {
                System.out.println("Duplicate voterName found! Record NOT inserted.");
                return true;  // duplicate exists
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    @Override
    @SneakyThrows
    public Optional<VoterDTO> findByVoterName(String voterName) {

        String searchQuery = "SELECT * FROM voter_card WHERE voterName = ?";
        System.out.println("searchQuery : " + searchQuery);

        try (Connection connection = DriverManager.getConnection(
                DBConstants.URL.getPro(),
                DBConstants.USERNAME.getPro(),
                DBConstants.PASSWORD.getPro());
             PreparedStatement statement = connection.prepareStatement(searchQuery)) {

            System.out.println("Executing statement started...");
            statement.setString(1, voterName);

            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                System.out.println("Result row found...");

                String name = rs.getString("voterName");
                String fatherName = rs.getString("fatherName");
                int age = rs.getInt("age");
                String gender = rs.getString("gender");
                String address = rs.getString("address");

                VoterDTO dto = new VoterDTO(name, fatherName, age, gender, address);
                System.out.println("VoterDTO from DB: " + dto);

                return Optional.of(dto);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println("No rows found...");
        return Optional.empty();
    }

    static {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
