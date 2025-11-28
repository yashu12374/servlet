package com.xworkz.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StreetDelete {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/task";
        String userName = "root";
        String password = "yashu@123";

        try {
            Connection connection = DriverManager.getConnection(url, userName, password);
            System.out.println("connection:" + connection);

            Statement statement = connection.createStatement();

            //Delete  a row by primary Key
            String sql = "Delete from street where street_id=10";

            int rowAffected = statement.executeUpdate(sql);
            System.out.println("Rows Deleted: " + rowAffected);

            //Delete multiple rows where sweet_type = 'Milk Sweet'
            String sql1 = "delete from street where street_type = 'Market'";
            int rowsAffected1 = statement.executeUpdate(sql1);
            System.out.println("Rows Deleted: " + rowsAffected1);

        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
