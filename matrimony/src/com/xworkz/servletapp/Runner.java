package com.xworkz.servletapp;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Runner {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/matrimony";
        String userName = "root";
        String password = "yashaswini@12";

        try {
            DriverManager.getConnection(url, userName, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("after catch block..");
    }
}
