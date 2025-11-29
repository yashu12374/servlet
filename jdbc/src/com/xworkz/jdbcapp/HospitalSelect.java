package com.xworkz.jdbcapp;

import java.sql.*;

public class HospitalSelect {

    public static void main(String[] args) {

        try (Connection connection = DriverManager.getConnection(DBConstant.URL.getProp(),DBConstant.USERNAME.getProp(),DBConstant.Secret.getProp())) {

            Statement statement = connection.createStatement();

            //Select all rows
            String selectAll = "SELECT * FROM hospital";
            ResultSet rs1 = statement.executeQuery(selectAll);
            while (rs1.next()) {
                printHospital(rs1);
            }
            System.out.println("--------------------------------------------");

            //Select one row by hospital_id
            String selectOne = "SELECT * FROM hospital WHERE hospital_id = 3";
            ResultSet rs2 = statement.executeQuery(selectOne);
            while (rs2.next()) {
                printHospital(rs2);
            }
            System.out.println("--------------------------------------------");

            //Select one row, one column
            String selectOneColumn = "SELECT name FROM hospital WHERE hospital_id = 2";
            ResultSet rs3 = statement.executeQuery(selectOneColumn);
            while (rs3.next()) {
                System.out.println("Hospital Name: " + rs3.getString("name"));
            }
            System.out.println("--------------------------------------------");

            //Select two rows
            String selectTwo = "SELECT * FROM hospital WHERE hospital_id = 1 OR hospital_id = 2";
            ResultSet rs4 = statement.executeQuery(selectTwo);
            while (rs4.next()) {
                System.out.println("ID: " + rs4.getInt("hospital_id") + ", Name: " + rs4.getString("name"));
            }
            System.out.println("--------------------------------------------");

            //Select rows using IN
            String selectIN = "SELECT * FROM hospital WHERE hospital_id IN (2,4,6)";
            ResultSet rs5 = statement.executeQuery(selectIN);
            while (rs5.next()) {
                printHospital(rs5);
            }
            System.out.println("--------------------------------------------");

            //Select one column, all rows
            String selectColumnAll = "SELECT name FROM hospital";
            ResultSet rs6 = statement.executeQuery(selectColumnAll);
            while (rs6.next()) {
                System.out.println("Hospital Name: " + rs6.getString("name"));
            }
            System.out.println("--------------------------------------------");

            //Select distinct cities
            String selectDistinct = "SELECT DISTINCT city FROM hospital";
            ResultSet rs7 = statement.executeQuery(selectDistinct);
            while (rs7.next()) {
                System.out.println("City: " + rs7.getString("city"));
            }
            System.out.println("--------------------------------------------");

            //Count rows
            String countRows = "SELECT COUNT(*) FROM hospital";
            ResultSet rs8 = statement.executeQuery(countRows);
            while (rs8.next()) {
                System.out.println("Total Hospitals: " + rs8.getInt(1));
            }
            System.out.println("--------------------------------------------");

            //Latest row
            String latest = "SELECT * FROM hospital ORDER BY hospital_id DESC LIMIT 1";
            ResultSet rs9 = statement.executeQuery(latest);
            while (rs9.next()) {
                printHospital(rs9);
            }
            System.out.println("--------------------------------------------");

            //Select 2 max rows
            String maxTwo = "SELECT * FROM hospital ORDER BY hospital_id DESC LIMIT 2";
            ResultSet rs10 = statement.executeQuery(maxTwo);
            while (rs10.next()) {
                printHospital(rs10);
            }
            System.out.println("--------------------------------------------");

            //Select 5 min rows
            String minFive = "SELECT * FROM hospital ORDER BY hospital_id ASC LIMIT 5";
            ResultSet rs11 = statement.executeQuery(minFive);
            while (rs11.next()) {
                printHospital(rs11);
            }
            System.out.println("--------------------------------------------");

            //Oldest row
            String oldest = "SELECT * FROM hospital ORDER BY hospital_id ASC LIMIT 1";
            ResultSet rs12 = statement.executeQuery(oldest);
            while (rs12.next()) {
                printHospital(rs12);
            }
            System.out.println("--------------------------------------------");

            //Select all rows desc
            String desc = "SELECT * FROM hospital ORDER BY hospital_id DESC";
            ResultSet rs13 = statement.executeQuery(desc);
            while (rs13.next()) {
                printHospital(rs13);
            }
            System.out.println("--------------------------------------------");

            //Group by city
            String groupBy = "SELECT city, COUNT(*) AS total FROM hospital GROUP BY city";
            ResultSet rs14 = statement.executeQuery(groupBy);
            while (rs14.next()) {
                System.out.println("City: " + rs14.getString("city") + ", Total Hospitals: " + rs14.getInt("total"));
            }
            System.out.println("--------------------------------------------");

            //Group by state having
            String groupByHaving = "SELECT state, COUNT(*) AS total FROM hospital GROUP BY state HAVING COUNT(*) > 1";
            ResultSet rs15 = statement.executeQuery(groupByHaving);
            while (rs15.next()) {
                System.out.println("State: " + rs15.getString("state") + ", Total: " + rs15.getInt("total"));
            }
            System.out.println("--------------------------------------------");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void printHospital(ResultSet rs) throws SQLException {
        System.out.println("Hospital ID : " + rs.getInt("hospital_id"));
        System.out.println("Name : " + rs.getString("name"));
        System.out.println("Location : " + rs.getString("location"));
        System.out.println("City : " + rs.getString("city"));
        System.out.println("State : " + rs.getString("state"));
        System.out.println("Country : " + rs.getString("country"));
        System.out.println("Beds : " + rs.getInt("num_beds"));
        System.out.println("Established : " + rs.getDate("established_year"));
        System.out.println("Speciality : " + rs.getString("speciality"));
        System.out.println("Email : " + rs.getString("contact_email"));
        System.out.println("--------------------------------------------");
    }

}

