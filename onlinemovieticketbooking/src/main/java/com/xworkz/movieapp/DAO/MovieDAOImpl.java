package com.xworkz.movieapp.DAO;

import com.xworkz.movieapp.DTO.MovieDTO;
import com.xworkz.movieapp.constants.DBConstants;
import lombok.var;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MovieDAOImpl implements MovieDAO{

    @Override
    public void save(MovieDTO movieDTO) {

        String checkQuery = "SELECT COUNT(*) FROM movie_ticket WHERE theatre_name = ?";

        String insertQuery = "Insert Into movie_ticket(ticket_id, theatre_name, movie_name, showTime, number_of_ticket, price)VALUES(?,?,?,?,?,?)";


        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(DBConstants.URL.getPro(),DBConstants.USERNAME.getPro(),DBConstants.SECRET.getPro());

            PreparedStatement checkStmt = connection.prepareStatement(checkQuery);
            checkStmt.setString(1, movieDTO.getTheatre_name());

            var rs = checkStmt.executeQuery();

            int count = 0;
            if (rs.next()) {
                count = rs.getInt(1);
            }
            if (count > 0) {
                System.out.println("Duplicate theatre_name found! Record NOT inserted.");
                return;
            }
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
            preparedStatement.setInt(1,movieDTO.getTicket_id());
            preparedStatement.setString(2,movieDTO.getTheatre_name());
            preparedStatement.setString(3, movieDTO.getMovie_name());
            preparedStatement.setString(4, movieDTO.getShowTime());
            preparedStatement.setInt(5,movieDTO.getNumber_of_ticket());
            preparedStatement.setDouble(6,movieDTO.getPrice());

            int row = preparedStatement.executeUpdate();
            System.out.println("Row update : "+row);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
