package com.xworkz.movieapp.insert;

import com.xworkz.movieapp.constants.DBConstants;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MovieInsert {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/movie";
        String userName = "root";
        String password = "yashu@123";

        try{
            Connection connection = DriverManager.getConnection(url,userName,password);
            System.out.println("Connection:"+connection);

            Statement statement=connection.createStatement();

            String insertQuery = "Insert Into movie_ticket values(ticket_id, theatre_name, movie_name, showTime, number_of_ticket, price)," +
                    "(2,'Sathya','Madeva','9.45 PM',1,100)," +
                    "(3,'Manjuntha','Devil','7.30 PM',3,300)," +
                    "(4,'PVR Cinemas','Salaar','4.30 PM',3,450)," +
                    "(5,'INOX Mall','KGF 2','7.00 PM',4,600)," +
                    "(6,'Cinepolis','Leo','10.15 AM',1,250)," +
                    "(7,'Rajkumar Theatre','Kurukshetra','6.45 PM',5,500)," +
                    "(8,'VR Cinemas','Jawan','3.00 PM',2,400)," +
                    "(9,'Rockline Mall','Pushpa 2','9.30 PM',3,550)," +
                    "(10,'Sandhya Theatre','Vikram','12.00 PM',2,300)," +
                    "(11,'Lido Mall','Avatar 2','11.00 AM',4,800)," +
                    "(12,'Mantri Mall','Spider-Man','2.45 PM',1,350)";
            int rowAffected=statement.executeUpdate(insertQuery);
            System.out.println("RowAffected : "+rowAffected);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
