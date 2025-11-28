package com.xworkz.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class HospitalUpdate {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/task";
        String userName = "root";
        String password = "yashu@123";

        try {
            Connection connection = DriverManager.getConnection(url, userName, password);
            System.out.println("Connection: " + connection);

            Statement statement = connection.createStatement();

            String sql1 = "update hospital set city='Mysuru' where hospital_id=3";
            int rowsAffected1 = statement.executeUpdate(sql1);
            System.out.println("Rows Updated: " + rowsAffected1);

            String sql2 = "update hospital set num_beds=250 where hospital_id=5";
            int rowsAffected2 = statement.executeUpdate(sql2);
            System.out.println("Rows Updated: " + rowsAffected2);

            String sql3 = "update hospital set speciality='Cardiology' where hospital_id=7";
            int rowsAffected3 = statement.executeUpdate(sql3);
            System.out.println("Rows Updated: " + rowsAffected3);

            String sql4 = "update hospital set contact_email='updated_hospital010@gmail.com' where hospital_id=10";
            int rowsAffected4 = statement.executeUpdate(sql4);
            System.out.println("Rows Updated: " + rowsAffected4);

            String sql5 = "update hospital set name='Advanced Care Hospital' where hospital_id=15";
            int rowsAffected5 = statement.executeUpdate(sql5);
            System.out.println("Rows Updated: " + rowsAffected5);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

