package com.xworkz.jdbcapp;

import java.sql.*;

public class SportsSelect {

    public static void main(String[] args) {

        try (Connection connection= DriverManager.getConnection(DBConstant.URL.getProp(), DBConstant.USERNAME.getProp(), DBConstant.Secret.getProp());)  {

            Statement statement = connection.createStatement();

            //Select all rows
             String selectAll = "SELECT * FROM sports";
             ResultSet rs1 = statement.executeQuery(selectAll);

             while (rs1.next()) {
                 int sportId = rs1.getInt("sport_id");
                 String sportName = rs1.getString("sport_name");
                 String category = rs1.getString("category");
                 int players = rs1.getInt("players_required");
                 String equipment = rs1.getString("equipment");
                 String origin = rs1.getString("origin_country");
                 String indoorOutdoor = rs1.getString("indoor_outdoor");
                 boolean olympic = rs1.getBoolean("olympic_sport");
                 int popularity = rs1.getInt("popularity_rank");
                 String coach = rs1.getString("coach_name");

                 System.out.println("Sport ID: " + sportId);
                 System.out.println("Sport Name: " + sportName);
                 System.out.println("Category: " + category);
                 System.out.println("Players Required: " + players);
                 System.out.println("Equipment: " + equipment);
                 System.out.println("Origin Country: " + origin);
                 System.out.println("Indoor/Outdoor: " + indoorOutdoor);
                 System.out.println("Olympic Sport: " + olympic);
                 System.out.println("Popularity Rank: " + popularity);
                 System.out.println("Coach Name: " + coach);

                 }
            System.out.println("............................................................");


            // Select one row
                String selectOneRow = "SELECT * FROM sports WHERE sport_id = 1";
                ResultSet rs2 = statement.executeQuery(selectOneRow);

                while (rs2.next()) {
                    System.out.println("Sport Name: " + rs2.getString("sport_name") + " Category: " + rs2.getString("category"));
                }
            System.out.println("............................................................");


            // Select one column all rows
                String selectColumn = "SELECT sport_name FROM sports";
                ResultSet rs3 = statement.executeQuery(selectColumn);

                while (rs3.next()) {
                    System.out.println("Sport Name: " + rs3.getString("sport_name"));
                }
            System.out.println("............................................................");

            // Count rows
                String countRows = "SELECT COUNT(*) FROM sports";
                ResultSet rs4 = statement.executeQuery(countRows);

                while (rs4.next()) {
                    System.out.println("Total Sports: " + rs4.getInt(1));
                }
            System.out.println("............................................................");

            // Select latest row
                String latestRow = "SELECT * FROM sports ORDER BY sport_id DESC LIMIT 1";
                ResultSet rs5 = statement.executeQuery(latestRow);

                while (rs5.next()) {
                    System.out.println("Latest Sport: " + rs5.getString("sport_name"));
                }
            System.out.println("............................................................");


            // Group by
                String groupBy = "SELECT category, COUNT(*) AS total FROM sports GROUP BY category";
                ResultSet rs6 = statement.executeQuery(groupBy);

                while (rs6.next()) {
                    System.out.println("Category: " + rs6.getString("category") + " Total Sports: " + rs6.getInt("total"));
                }
            System.out.println("............................................................");

            //Select one row one column
                String sql="SELECT sport_name FROM sports WHERE sport_id = 5";
                ResultSet rs7 = statement.executeQuery(sql);

                while (rs7.next()){
                    System.out.println("sport_name:"+ rs7.getString("sport_name"));
                }
                System.out.println("............................................................");

                //Select two row
            String sql1 = "SELECT * FROM sports WHERE sport_id IN (1,2)";
            ResultSet rs8 = statement.executeQuery(sql1);

            while (rs8.next()){
                System.out.println("sport_id" + rs8.getInt("sport_id")+"sport_name" +rs8.getString("sport_name"));
            }
            System.out.println("............................................................");

            //select three rows
            String sql2 = "SELECT * FROM sports WHERE sport_id IN (1,2,3)";
            ResultSet rs9 = statement.executeQuery(sql2);

            while (rs9.next()){
                System.out.println("sport_id " + rs9.getInt("sport_id")+ " sport_name " + rs9.getString("sport_name")+ " category " + rs9.getString("category"));
            }
            System.out.println("............................................................");

            //select distinct
           String distinct="SELECT DISTINCT category FROM sports";
           ResultSet rs10 = statement.executeQuery(distinct);

           while (rs10.next()){
               System.out.println("category: " +rs10.getString("category"));
           }
           System.out.println("............................................................");

           //select max 2 row
            String max = "SELECT * FROM sports ORDER BY sport_id DESC LIMIT 2";
            ResultSet rs11 = statement.executeQuery(max);

            while (rs11.next()){
                int sportId = rs11.getInt("sport_id");
                String sportName = rs11.getString("sport_name");
                String category = rs11.getString("category");
                int players = rs11.getInt("players_required");
                String equipment = rs11.getString("equipment");
                String origin = rs11.getString("origin_country");
                String indoorOutdoor = rs11.getString("indoor_outdoor");
                boolean olympic = rs11.getBoolean("olympic_sport");
                int popularity = rs11.getInt("popularity_rank");
                String coach = rs11.getString("coach_name");

                System.out.println("Sport ID: " + sportId);
                System.out.println("Sport Name: " + sportName);
                System.out.println("Category: " + category);
                System.out.println("Players Required: " + players);
                System.out.println("Equipment: " + equipment);
                System.out.println("Origin Country: " + origin);
                System.out.println("Indoor/Outdoor: " + indoorOutdoor);
                System.out.println("Olympic Sport: " + olympic);
                System.out.println("Popularity Rank: " + popularity);
                System.out.println("Coach Name: " + coach);

            }
            System.out.println("............................................................");

            //Select min 5 rows
            String min = "SELECT * FROM sports ORDER BY sport_id ASC LIMIT 5";
            ResultSet rs12 = statement.executeQuery(min);

            while (rs12.next()){
                int sportId = rs12.getInt("sport_id");
                String sportName = rs12.getString("sport_name");
                String category = rs12.getString("category");
                int players = rs12.getInt("players_required");
                String equipment = rs12.getString("equipment");
                String origin = rs12.getString("origin_country");
                String indoorOutdoor = rs12.getString("indoor_outdoor");
                boolean olympic = rs12.getBoolean("olympic_sport");
                int popularity = rs12.getInt("popularity_rank");
                String coach = rs12.getString("coach_name");

                System.out.println("Sport ID: " + sportId);
                System.out.println("Sport Name: " + sportName);
                System.out.println("Category: " + category);
                System.out.println("Players Required: " + players);
                System.out.println("Equipment: " + equipment);
                System.out.println("Origin Country: " + origin);
                System.out.println("Indoor/Outdoor: " + indoorOutdoor);
                System.out.println("Olympic Sport: " + olympic);
                System.out.println("Popularity Rank: " + popularity);
                System.out.println("Coach Name: " + coach);

            }
            System.out.println("............................................................");

            //select oldest
            String old = "SELECT * FROM sports ORDER BY sport_id ASC LIMIT 1";
            ResultSet rs13 = statement.executeQuery(old);

            while (rs13.next()){
                int sportId = rs13.getInt("sport_id");
                String sportName = rs13.getString("sport_name");
                String category = rs13.getString("category");
                int players = rs13.getInt("players_required");
                String equipment = rs13.getString("equipment");
                String origin = rs13.getString("origin_country");
                String indoorOutdoor = rs13.getString("indoor_outdoor");
                boolean olympic = rs13.getBoolean("olympic_sport");
                int popularity = rs13.getInt("popularity_rank");
                String coach = rs13.getString("coach_name");

                System.out.println("Sport ID: " + sportId);
                System.out.println("Sport Name: " + sportName);
                System.out.println("Category: " + category);
                System.out.println("Players Required: " + players);
                System.out.println("Equipment: " + equipment);
                System.out.println("Origin Country: " + origin);
                System.out.println("Indoor/Outdoor: " + indoorOutdoor);
                System.out.println("Olympic Sport: " + olympic);
                System.out.println("Popularity Rank: " + popularity);
                System.out.println("Coach Name: " + coach);

            }
            System.out.println("............................................................");

            //select all rows desc
            String desc = "SELECT * FROM sports ORDER BY sport_id DESC";
            ResultSet rs14 = statement.executeQuery(desc);

            while (rs14.next()){
                int sportId = rs14.getInt("sport_id");
                String sportName = rs14.getString("sport_name");
                String category = rs14.getString("category");
                int players = rs14.getInt("players_required");
                String equipment = rs14.getString("equipment");
                String origin = rs14.getString("origin_country");
                String indoorOutdoor = rs14.getString("indoor_outdoor");
                boolean olympic = rs14.getBoolean("olympic_sport");
                int popularity = rs14.getInt("popularity_rank");
                String coach = rs14.getString("coach_name");

                System.out.println("Sport ID: " + sportId);
                System.out.println("Sport Name: " + sportName);
                System.out.println("Category: " + category);
                System.out.println("Players Required: " + players);
                System.out.println("Equipment: " + equipment);
                System.out.println("Origin Country: " + origin);
                System.out.println("Indoor/Outdoor: " + indoorOutdoor);
                System.out.println("Olympic Sport: " + olympic);
                System.out.println("Popularity Rank: " + popularity);
                System.out.println("Coach Name: " + coach);

            }
            System.out.println("............................................................");

            //select group by and having
            String having = "SELECT category, COUNT(*) AS total_sports FROM sports GROUP BY category HAVING COUNT(*) > 2";
            ResultSet rs15 = statement.executeQuery(having);

            while (rs15.next()){
                String category = rs15.getString("category");
                int count1 = rs15.getInt("total_sports");

                System.out.println("category: " + category + "  Total Sports: " + count1);
            }



        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
