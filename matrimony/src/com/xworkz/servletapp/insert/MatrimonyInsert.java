package com.xworkz.servletapp.insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MatrimonyInsert {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/matrimony";
        String userName = "root";
        String password = "yashu@123";

        try{
            Connection connection = DriverManager.getConnection(url,userName,password);
            System.out.println("Connection:"+connection);

            Statement statement=connection.createStatement();

            String sql="insert into matrimony values(5,'karthika@gmail.com','female','Bride','2004-08-16','Kannada','Hindu','Single',6)";
            int rowAffected=statement.executeUpdate(sql);
            System.out.println("RowAffected : "+rowAffected);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
