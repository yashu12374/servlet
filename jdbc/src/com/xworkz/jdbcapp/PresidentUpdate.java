package com.xworkz.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PresidentUpdate {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/task";
        String userName = "root";
        String password = "yashu@123";

        try {
            Connection connection = DriverManager.getConnection(url, userName, password);
            System.out.println("Connection: " + connection);

            Statement statement = connection.createStatement();

            String sql1 = "update president set email='updated1@gmail.com' where p_id=5";
            int rowsAffected1 = statement.executeUpdate(sql1);
            System.out.println("Rows Updated: " + rowsAffected1);

            String sql2 = "update president set contact_number=999888777 where p_id=10";
            int rowsAffected2 = statement.executeUpdate(sql2);
            System.out.println("Rows Updated: " + rowsAffected2);

            String sql3 = "update president set city='Bengaluru' where p_id=15";
            int rowsAffected3 = statement.executeUpdate(sql3);
            System.out.println("Rows Updated: " + rowsAffected3);

            String sql4 = "update president set political_party='Party Z' where p_id=20";
            int rowsAffected4 = statement.executeUpdate(sql4);
            System.out.println("Rows Updated: " + rowsAffected4);

            String sql5 = "update president set achievements='Updated achievements info' where p_id=25";
            int rowsAffected5 = statement.executeUpdate(sql5);
            System.out.println("Rows Updated: " + rowsAffected5);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
