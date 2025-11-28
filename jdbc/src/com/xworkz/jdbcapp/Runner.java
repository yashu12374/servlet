package com.xworkz.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Runner {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/matrimony";
        String userName = "root";
        String password = "yashu@123";

        try {
            Connection connection = DriverManager.getConnection(url, userName, password);
            System.out.println("Connection:" +connection);
            String sql="insert into matrimony values(6,'sowmaya12@gmail.com','female','Bride','2004-07-17','Kannada','Hindu','Single',5);";
            Statement statement=connection.createStatement();
            int rowAffected=statement.executeUpdate(sql);
            System.out.println("rowsAffected :"+rowAffected);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("after catch block..");
    }
}

