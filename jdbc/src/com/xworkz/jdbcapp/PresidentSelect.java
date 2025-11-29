package com.xworkz.jdbcapp;

import java.sql.*;

public class PresidentSelect {

    public static void main(String[] args) {

        try(Connection connection= DriverManager.getConnection(DBConstant.URL.getProp(), DBConstant.USERNAME.getProp(), DBConstant.Secret.getProp());) {

            Statement statement = connection.createStatement();

            //Select all rows
            String selectAll = "SELECT * FROM president";
            ResultSet rs1 = statement.executeQuery(selectAll);
            while (rs1.next()) {
                printPresident(rs1);
            }
            System.out.println("-------------------------------------------------");

            //Select one row
            String selectOne = "SELECT * FROM president WHERE p_id = 3";
            ResultSet rs2 = statement.executeQuery(selectOne);
            while (rs2.next()) {
                printPresident(rs2);
            }
            System.out.println("-------------------------------------------------");

            //Select one row one column
            String selectOneColumn = "SELECT first_name FROM president WHERE p_id = 5";
            ResultSet rs3 = statement.executeQuery(selectOneColumn);
            while (rs3.next()) {
                System.out.println("First Name: " + rs3.getString("first_name"));
            }
            System.out.println("-------------------------------------------------");

            //Select two rows
            String selectTwoRows = "SELECT * FROM president WHERE p_id = 1 OR p_id = 2";
            ResultSet rs4 = statement.executeQuery(selectTwoRows);
            while (rs4.next()) {
                System.out.println("P_ID: " + rs4.getInt("p_id") + ", Name: " + rs4.getString("first_name") + " " + rs4.getString("last_name"));
            }
            System.out.println("-------------------------------------------------");

            //Select three rows
            String selectThreeRows = "SELECT * FROM president WHERE p_id IN (2,4,6)";
            ResultSet rs5 = statement.executeQuery(selectThreeRows);
            while (rs5.next()) {
                printPresident(rs5);
            }
            System.out.println("-------------------------------------------------");

            //Select one column, all rows
            String selectColumnAll = "SELECT first_name FROM president";
            ResultSet rs6 = statement.executeQuery(selectColumnAll);
            while (rs6.next()) {
                System.out.println("First Name: " + rs6.getString("first_name"));
            }
            System.out.println("-------------------------------------------------");

            //Select distinct
            String selectDistinct = "SELECT DISTINCT political_party FROM president";
            ResultSet rs7 = statement.executeQuery(selectDistinct);
            while (rs7.next()) {
                System.out.println("Political Party: " + rs7.getString("political_party"));
            }
            System.out.println("-------------------------------------------------");

            //Count rows
            String countRows = "SELECT COUNT(*) FROM president";
            ResultSet rs8 = statement.executeQuery(countRows);
            while (rs8.next()) {
                System.out.println("Total Presidents: " + rs8.getInt(1));
            }
            System.out.println("-------------------------------------------------");

            //Latest row
            String latestRow = "SELECT * FROM president ORDER BY p_id DESC LIMIT 1";
            ResultSet rs9 = statement.executeQuery(latestRow);
            while (rs9.next()) {
                printPresident(rs9);
            }
            System.out.println("-------------------------------------------------");

            //Select 2 max rows
            String maxTwo = "SELECT * FROM president ORDER BY p_id DESC LIMIT 2";
            ResultSet rs10 = statement.executeQuery(maxTwo);
            while (rs10.next()) {
                printPresident(rs10);
            }
            System.out.println("-------------------------------------------------");

            //Select 5 min rows
            String minFive = "SELECT * FROM president ORDER BY p_id ASC LIMIT 5";
            ResultSet rs11 = statement.executeQuery(minFive);
            while (rs11.next()) {
                printPresident(rs11);
            }
            System.out.println("-------------------------------------------------");

            //Oldest row
            String oldest = "SELECT * FROM president ORDER BY p_id ASC LIMIT 1";
            ResultSet rs12 = statement.executeQuery(oldest);
            while (rs12.next()) {
                printPresident(rs12);
            }
            System.out.println("-------------------------------------------------");

            //All rows ordered by id desc
            String descRow = "SELECT * FROM president ORDER BY p_id DESC";
            ResultSet rs13 = statement.executeQuery(descRow);
            while (rs13.next()) {
                printPresident(rs13);
            }
            System.out.println("-------------------------------------------------");

            //Select with GROUP BY
            String groupBy = "SELECT political_party, COUNT(*) AS total_presidents FROM president GROUP BY political_party";
            ResultSet rs14 = statement.executeQuery(groupBy);
            while (rs14.next()) {
                System.out.println("Political Party: " + rs14.getString("political_party") + ", Total: " + rs14.getInt("total_presidents"));
            }
            System.out.println("-------------------------------------------------");

            //Select with GROUP BY and HAVING
            String groupByHaving = "SELECT political_party, COUNT(*) AS total_presidents FROM president GROUP BY political_party HAVING COUNT(*) > 1";
            ResultSet rs15 = statement.executeQuery(groupByHaving);
            while (rs15.next()) {
                System.out.println("Political Party: " + rs15.getString("political_party") + ", Total: " + rs15.getInt("total_presidents"));
            }
            System.out.println("-------------------------------------------------");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private static void printPresident(ResultSet rs) throws SQLException {
        System.out.println("P_ID: " + rs.getInt("p_id"));
        System.out.println("first_name: " + rs.getString("first_name"));
        System.out.println("last_name :" + rs.getString("last_name"));
        System.out.println("Age: " + rs.getInt("age"));
        System.out.println("Gender: " + rs.getString("gender"));
        System.out.println("Country: " + rs.getString("country"));
        System.out.println("State: " + rs.getString("state"));
        System.out.println("City: " + rs.getString("city"));
        System.out.println("Term Start: " + rs.getDate("term_start"));
        System.out.println("Term End: " + rs.getDate("term_end"));
        System.out.println("Political Party: " + rs.getString("political_party"));
        System.out.println("Education: " + rs.getString("education"));
        System.out.println("Experience Years: " + rs.getInt("experience_years"));
        System.out.println("Achievements: " + rs.getString("achievements"));
        System.out.println("Email: " + rs.getString("email"));
        System.out.println("Contact Number: " + rs.getLong("contact_number"));
        System.out.println("-------------------------------------------------");
    }
}
