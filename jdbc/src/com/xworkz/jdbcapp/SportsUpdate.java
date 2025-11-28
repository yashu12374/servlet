package com.xworkz.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SportsUpdate {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/task";
        String userName = "root";
        String password = "yashu@123";

        try {
            Connection connection = DriverManager.getConnection(url, userName, password);
            System.out.println("Connection:" + connection);

            String sql1 = "update sports set sport_name='Modern Football' where sport_id=2";
            String sql2 = "update sports set indoor_outdoor='Indoor' where sport_id=8";
            String sql3 = "update sports set origin_country='Spain' where sport_id=21";
            String sql4 = "update sports set coach_name='Updated Coach' where sport_id=40";

            Statement statement = connection.createStatement();

            int rowAffected1 = statement.executeUpdate(sql1);
            System.out.println("rowsAffected: " + rowAffected1);
            int rowAffected2 = statement.executeUpdate(sql2);
            System.out.println("rowsAffected: " + rowAffected2);
            int rowAffected3 = statement.executeUpdate(sql3);
            System.out.println("rowsAffected: " + rowAffected3);
            int rowAffected4 = statement.executeUpdate(sql4);
            System.out.println("rowsAffected: " + rowAffected4);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

