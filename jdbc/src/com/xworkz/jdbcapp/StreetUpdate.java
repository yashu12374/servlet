package com.xworkz.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StreetUpdate {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/task";
        String userName = "root";
        String password = "yashu@123";

        try {
            Connection connection = DriverManager.getConnection(url, userName, password);
            System.out.println("Connection: " + connection);

            String sql1 = "update street set street_name='Updated Church Road' where street_id=2";
            String sql2 = "update street set city='Shivamogga' where street_id=5";
            String sql3 = "update street set state='Karnataka' where street_id=10";
            String sql4 = "update street set area='Updated Layout' where street_id=12";
            String sql5 = "update street set pincode=560001 where street_id=18";

            Statement statement = connection.createStatement();

            int r1 = statement.executeUpdate(sql1);
            System.out.println("rowsAffected: " + r1);
            int r2 = statement.executeUpdate(sql2);
            System.out.println("rowsAffected: " + r2);
            int r3 = statement.executeUpdate(sql3);
            System.out.println("rowsAffected: " + r3);
            int r4 = statement.executeUpdate(sql4);
            System.out.println("rowsAffected: " + r4);
            int r5 = statement.executeUpdate(sql5);
            System.out.println("rowsAffected: " + r5);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

