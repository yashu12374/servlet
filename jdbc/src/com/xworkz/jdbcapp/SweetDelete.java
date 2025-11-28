package com.xworkz.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SweetDelete {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/task";
        String userName = "root";
        String password = "yashu@123";

        try {
            Connection connection = DriverManager.getConnection(url, userName, password);
            System.out.println("Connection: " + connection);

            Statement statement = connection.createStatement();
            //Delete a row by primary key
            String sql = "delete from sweet where sweet_id = 5";

            int rowsAffected = statement.executeUpdate(sql);
            System.out.println("Rows Deleted: " + rowsAffected);

            //Delete multiple rows where sweet_type = 'Milk Sweet'
            String sql1 = "delete from sweet where sweet_type = 'Milk Sweet'";

            int rowsAffected1 = statement.executeUpdate(sql1);
            System.out.println("Rows Deleted: " + rowsAffected1);


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
