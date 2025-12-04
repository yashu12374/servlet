package com.xworkz.movieapp.DAO;

import com.xworkz.movieapp.DTO.MovieDTO;
import com.xworkz.movieapp.constants.DBConstants;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MovieDAOImpl implements MovieDAO{

    @Override
    public void save(MovieDTO movieDTO) {

        String insertQuery = "Insert Into movie_ticket(ticket_id, theatre_name, movie_name, showTime, number_of_ticket, price)VALUES(?,?,?,?,?,?)";


        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(DBConstants.URL.getPro(),DBConstants.USERNAME.getPro(),DBConstants.SECRET.getPro());

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
