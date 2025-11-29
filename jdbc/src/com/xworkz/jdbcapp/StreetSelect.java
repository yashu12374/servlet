package com.xworkz.jdbcapp;

import java.sql.*;

public class StreetSelect {

    public static void main(String[] args) {

        try(Connection connection= DriverManager.getConnection(DBConstant.URL.getProp(), DBConstant.USERNAME.getProp(), DBConstant.Secret.getProp());) {

            Statement statement = connection.createStatement();

            //Select all rows
            String selectAll = "SELECT * FROM street";
            ResultSet rs1 = statement.executeQuery(selectAll);
            while (rs1.next()) {
                printStreet(rs1);
            }
            System.out.println("-------------------------------------------------");

            //Select one row
            String selectOne = "SELECT * FROM street WHERE street_id=4  ";
            ResultSet rs2 = statement.executeQuery(selectOne);
            while (rs2.next()) {
                printStreet(rs2);
            }
            System.out.println("-------------------------------------------------");

            //Select one row one column
            String selectOneColumn = "SELECT street_name FROM street WHERE street_id = 5";
            ResultSet rs3 = statement.executeQuery(selectOneColumn);
            while (rs3.next()) {
                System.out.println("Street Name: " + rs3.getString("street_name"));
            }
            System.out.println("-------------------------------------------------");

            //Select two rows
            String selectTwoRows = "SELECT * FROM street WHERE street_id = 1 OR street_id = 2";
            ResultSet rs4 = statement.executeQuery(selectTwoRows);
            while (rs4.next()) {
                System.out.println("Street ID: " + rs4.getInt("street_id") + ", Name: " + rs4.getString("street_name"));
            }
            System.out.println("-------------------------------------------------");

            //Select three rows
            String selectThreeRows = "SELECT * FROM street WHERE street_id IN (2,4,8)";
            ResultSet rs5 = statement.executeQuery(selectThreeRows);
            while (rs5.next()) {
                printStreet(rs5);
            }
            System.out.println("-------------------------------------------------");

            //Select one column all rows
            String selectColumnAll = "SELECT street_name FROM street";
            ResultSet rs6 = statement.executeQuery(selectColumnAll);
            while (rs6.next()) {
                System.out.println("Street Name: " + rs6.getString("street_name"));
            }
            System.out.println("-------------------------------------------------");

            //Select distinct
            String selectDistinct = "SELECT DISTINCT street_type FROM street";
            ResultSet rs7 = statement.executeQuery(selectDistinct);
            while (rs7.next()) {
                System.out.println("Street Type: " + rs7.getString("street_type"));
            }
            System.out.println("-------------------------------------------------");

            //Count rows
            String countRows = "SELECT COUNT(*) FROM street";
            ResultSet rs8 = statement.executeQuery(countRows);
            while (rs8.next()) {
                System.out.println("Total Streets: " + rs8.getInt(1));
            }
            System.out.println("-------------------------------------------------");

            //Latest row
            String latestRow = "SELECT * FROM street ORDER BY street_id DESC LIMIT 1";
            ResultSet rs9 = statement.executeQuery(latestRow);
            while (rs9.next()) {
                printStreet(rs9);
            }
            System.out.println("-------------------------------------------------");

            //Select 2 max rows
            String maxTwo = "SELECT * FROM street ORDER BY street_id DESC LIMIT 2";
            ResultSet rs10 = statement.executeQuery(maxTwo);
            while (rs10.next()) {
                printStreet(rs10);
            }
            System.out.println("-------------------------------------------------");

            //Select 5 min rows
            String minFive = "SELECT * FROM street ORDER BY street_id ASC LIMIT 5";
            ResultSet rs11 = statement.executeQuery(minFive);
            while (rs11.next()) {
                printStreet(rs11);
            }
            System.out.println("-------------------------------------------------");

            //Oldest row
            String oldest = "SELECT * FROM street ORDER BY street_id ASC LIMIT 1";
            ResultSet rs12 = statement.executeQuery(oldest);
            while (rs12.next()) {
                printStreet(rs12);
            }
            System.out.println("-------------------------------------------------");

            //Select all row desc
            String descRow = "SELECT * FROM street ORDER BY street_id DESC";
            ResultSet rs13 = statement.executeQuery(descRow);
            while (rs13.next()) {
                printStreet(rs13);
            }
            System.out.println("-------------------------------------------------");

            //Select with GROUP BY
            String groupBy = "SELECT street_type, COUNT(*) AS total_streets FROM street GROUP BY street_type";
            ResultSet rs14 = statement.executeQuery(groupBy);
            while (rs14.next()) {
                System.out.println("Street Type: " + rs14.getString("street_type") + ", Total: " + rs14.getInt("total_streets"));
            }
            System.out.println("-------------------------------------------------");

            //Select with GROUP BY and HAVING
            String groupByHaving = "SELECT street_type, COUNT(*) AS total_streets FROM street GROUP BY street_type HAVING COUNT(*)>21";
            ResultSet rs15 = statement.executeQuery(groupByHaving);
            while (rs15.next()) {
                System.out.println("Street Type: " + rs15.getString("street_type") + ", Total: " + rs15.getInt("total_streets"));
            }
            System.out.println("-------------------------------------------------");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private static void printStreet(ResultSet rs) throws SQLException {
        System.out.println("Street ID: " + rs.getInt("street_id"));
        System.out.println("Street Name: " + rs.getString("street_name"));
        System.out.println("Area: " + rs.getString("area"));
        System.out.println("City: " + rs.getString("city"));
        System.out.println("State: " + rs.getString("state"));
        System.out.println("Country: " + rs.getString("country"));
        System.out.println("Pincode: " + rs.getInt("pincode"));
        System.out.println("Street Type: " + rs.getString("street_type"));
        System.out.println("Landmark: " + rs.getString("landmark"));
        System.out.println("Number of Shops: " + rs.getInt("no_of_shops"));
        System.out.println("-------------------------------------------------");
    }
}
