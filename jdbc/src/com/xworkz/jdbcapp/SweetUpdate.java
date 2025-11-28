package com.xworkz.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SweetUpdate {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/task";
        String userName = "root";
        String password = "yashu@123";
        try {
            Connection connection = DriverManager.getConnection(url, userName, password);
            System.out.println("Connection:" +connection);

            String sql1 ="update sweet set sweet_name='Coconut Barfi' where sweet_id=7";
            String sql2 ="update sweet set price=450 where sweet_id=36";
            String sql3 ="update sweet set shop_name='Yashu Sweet' where sweet_id=56";
            String sql4 ="update sweet set sweet_type='Festival Sweet' where sweet_id=1";

            Statement statement=connection.createStatement();
            int rowAffected=statement.executeUpdate(sql1);
            System.out.println("rowsAffected :"+rowAffected);
            int rowAffected1=statement.executeUpdate(sql2);
            System.out.println("rowsAffected :"+rowAffected1);
            int rowAffected2=statement.executeUpdate(sql3);
            System.out.println("rowsAffected :"+rowAffected2);
            int rowAffected3=statement.executeUpdate(sql4);
            System.out.println("rowsAffected :"+rowAffected3);
    } catch (SQLException e) {
            e.printStackTrace();
        }
}
}
