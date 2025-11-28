package com.xworkz.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SportsRunner {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/task";
        String userName = "root";
        String password = "yashu@123";

        try{
            Connection connection = DriverManager.getConnection(url,userName,password);
            System.out.println("Connection :"+connection);
            String sql ="insert into sports values(2,'Football','Team',11,'Football, Goalpost','England','Outdoor',TRUE,2,'Pep Guardiola'),"+
            "(3,'Hockey','Team',11,'Stick, Ball','India','Outdoor',TRUE,5,'Harendra Singh')," +
                    "(4,'Kabaddi','Team',7,'No Equipment','India','Outdoor',TRUE,5,'Anup Kumar')," +
                    "(5,'Kho-Kho','Team',9,'No Equipment','India','Outdoor',FALSE,15,'Rakesh Kumar')," +
                    "(6,'Hockey','Team',11,'Hockey Stick, Ball','India','Outdoor',TRUE,3,'Harendra Singh')," +
                    "(7,'Football','Team',11,'Football','India','Outdoor',TRUE,4,'Igor Stimac')," +
                    "(8,'Badminton','Individual',1,'Racket, Shuttle','India','Indoor',TRUE,6,'Pullela Gopichand')," +
                    "(9,'Chess','Individual',2,'Chess Board','India','Indoor',TRUE,2,'Ramesh RB')," +
                    "(10,'Carrom','Individual',4,'Carrom Board','India','Indoor',FALSE,10,'Srinivasa Rao')," +
                    "(11,'Gilli-Danda','Team',2,'Gilli, Danda','India','Outdoor',FALSE,30,'Local Coach'),"+
                    "(12,'Boxing','Individual',2,'Gloves','USA','Indoor',TRUE,14,'Freddie Roach')," +
                    "(13,'Wrestling','Individual',2,'Mat','Greece','Indoor',TRUE,9,'Gable Steveson')," +
                    "(14,'Lagori','Team',7,'Ball, Stones','India','Outdoor',FALSE,20,'Village Coach')," +
                    "(15,'Atya Patya','Team',7,'No Equipment','India','Outdoor',FALSE,25,'Arjun Shetty')," +
                    "(16,'Kalaripayattu','Individual',1,'Sword, Stick','India','Indoor',FALSE,12,'Guru Bala')," +
                    "(17,'Mallakhamba','Individual',1,'Pole','India','Indoor',FALSE,18,'Uday Deshpande')," +
                    "(18,'Volleyball','Team',6,'Ball, Net','USA','Outdoor',TRUE,10,'Karch Kiraly')," +
                    "(19,'Basketball','Team',5,'Ball, Hoop','USA','Indoor',TRUE,3,'Steve Kerr')," +
                    "(20,'Table Tennis','Individual',2,'Table, Bat, Ball','England','Indoor',TRUE,15,'Liu Guoliang')," +
                    "(21,'Baseball','Team',9,'Bat, Ball, Glove','USA','Outdoor',TRUE,11,'Joe Maddon')," +
                    "(22,'Boxing','Individual',2,'Gloves','USA','Indoor',TRUE,14,'Freddie Roach')," +
                    "(23,'Swimming','Individual',1,'Swim Gear','Australia','Indoor',TRUE,4,'Bob Bowman'),"+
                    "(24,'Shooting','Individual',1,'Rifle, Pistol','Germany','Indoor',TRUE,18,'Sergey Martinov')," +
                    "(25,'Cycling','Individual',1,'Bicycle','France','Outdoor',TRUE,13,'Jonathan Vaughters')," +
                    "(26,'Karate','Individual',1,'Karate Gear','Japan','Indoor',TRUE,22,'Hiroshi Shirai')," +
                    "(27,'Gatka','Individual',1,'Sticks','India','Outdoor',FALSE,28,'Guru Singh')," +
                    "(28,'Pehlwani','Individual',1,'No Equipment','India','Outdoor',0,8,'Mahavir Singh')," +
                    "(29,'Yubi Lakpi','Team',7,'Coconut','India','Outdoor',0,35,'Manipur Coach')," +
                    "(30,'Thoda','Individual',1,'Bow, Arrow','India','Outdoor',0,45,'Himachal Coach')," +
                    "(31,'Rumal Jhapatta','Team',6,'Scarf','India','Outdoor',0,50,'UP Coach')," +
                    "(32,'Boat Race','Team',20,'Boat, Oars','India','Outdoor',0,14,'Kerala Coach')," +
                    "(33,'Snakes & Ladders','Individual',4,'Board','India','Indoor',0,38,'Board Expert')," +
                    "(34,'Pallanguzhi','Individual',2,'Board, Seeds','India','Indoor',0,42,'Tamil Coach'),"+
                    "(35,'Asta Chamma','Individual',4,'Board, Dice','India','Indoor',0,37,'AP Coach')," +
                    "(36,'Jallikattu','Individual',1,'Bull','India','Outdoor',0,26,'Tamil Trainer')," +
                    "(37,'Vallam Kali','Team',30,'Boat','India','Outdoor',0,19,'Boat Coach')," +
                    "(38,'Kite Fighting','Individual',1,'Kite, Thread','India','Outdoor',0,41,'Kite Expert')," +
                    "(39,'Kho-Kho (Girls)','Team',9,'No Equipment','India','Outdoor',0,23,'Priya Rao')," +
                    "(40,'Kabaddi (Girls)','Team',7,'No Equipment','India','Outdoor',1,16,'Mamatha Poojary')," +
                    "(41,'Archery','Individual',1,'Bow, Arrow','India','Outdoor',1,7,'Limba Ram')," +
                    "(42,'Table Tennis','Individual',2,'Table, Bat, Ball','India','Indoor',1,11,'Soumyadip Roy')," +
                    "(43,'Tennis','Individual',2,'Racket, Ball','India','Outdoor',1,9,'Bopanna Coach')," +
                    "(44,'Boxing','Individual',1,'Gloves','India','Indoor',1,13,'N. Singh')," +
                    "(45,'Wrestling','Individual',1,'No Equipment','India','Indoor',1,17,'Satpal Singh'),"+
                    "(46,'Running','Individual',1,'Shoes','India','Outdoor',1,21,'Track Coach')," +
                    "(47,'Long Jump','Individual',1,'Sand Pit','India','Outdoor',1,29,'Athletics Coach')," +
                    "(48,'High Jump','Individual',1,'Bar','India','Outdoor',1,31,'Coach Sandeep')," +
                    "(49,'Gymnastics','Individual',1,'Equipment','India','Indoor',1,32,'Dipa Coach')," +
                    "(50,'Cycling','Individual',1,'Cycle','India','Outdoor',1,34,'Cycle Trainer')," +
                    "(51,'Handball','Team',7,'Ball','India','Indoor',1,36,'Handball Coach')," +
                    "(52,'Volleyball','Team',6,'Volleyball','India','Outdoor',1,39,'Volley Coach')," +
                    "(53,'Basketball','Team',5,'Ball','India','Indoor',1,46,'BB Coach')," +
                    "(54,'Baseball','Team',9,'Bat, Ball','India','Outdoor',0,54,'Baseball Coach'),"+
                    "(55,'Rugby','Team',15,'Ball','India','Outdoor',1,47,'Rugby Coach')," +
                    "(56,'Polo','Team',4,'Horse, Stick','India','Outdoor',1,49,'Polo Trainer')," +
                    "(57,'Throwball','Team',7,'Ball','India','Outdoor',0,51,'Throwball Coach')," +
                    "(58,'Sepak Takraw','Team',3,'Rattan Ball','India','Indoor',1,52,'Takraw Coach')," +
                    "(59,'Soft Tennis','Individual',2,'Racket, Ball','India','Outdoor',0,53,'Soft Tennis Coach')," +
                    "(60,'Cricket Gully','Team',6,'Bat, Ball','India','Outdoor',0,44,'Local Coach')," +
                    "(61,'Street Football','Team',5,'Ball','India','Outdoor',0,48,'Street Coach')," +
                    "(62,'Lagori Junior','Team',7,'Stones, Ball','India','Outdoor',0,56,'Local Trainer')," +
                    "(63,'Archery Tribal','Individual',1,'Bow','India','Outdoor',0,58,'Tribal Coach')," +
                    "(64,'Mud Wrestling','Individual',1,'No Equipment','India','Outdoor',0,59,'Village Guru')," +
                    "(65,'Hockey Junior','Team',11,'Hockey Stick','India','Outdoor',1,55,'Coach Pramod')," +
                    "(66,'Dodgeball','Team',6,'Ball','India','Indoor',0,60,'Dodge Coach')," +
                    "(67,'Yoga Sports','Individual',1,'Mat','India','Indoor',0,57,'Yoga Guru')," +
                    "(68,'Skating','Individual',1,'Skates','India','Outdoor',1,62,'Skate Coach')," +
                    "(69,'Karate','Individual',1,'Uniform','India','Indoor',1,63,'Karate Master')," +
                    "(70,'Taekwondo','Individual',1,'Uniform','India','Indoor',1,64,'TKD Coach')," +
                    "(71,'Fencing','Individual',1,'Sword, Gear','India','Indoor',1,66,'Fencing Coach')," +
                    "(72,'Rowing Junior','Team',4,'Boat','India','Outdoor',1,67,'Junior Coach')," +
                    "(73,'Kayaking','Individual',1,'Kayak','India','Outdoor',1,68,'Kayak Master')," +
                    "(74,'Canoeing','Individual',1,'Canoe','India','Outdoor',1,69,'Canoe Coach')," +
                    "(75,'Mountain Biking','Individual',1,'Bike','India','Outdoor',1,70,'MTB Coach')";

            Statement statement = connection.createStatement();
            int rowAffected=statement.executeUpdate(sql);
            System.out.println("rowAffected:"+rowAffected);
        }catch (SQLException e){
            e.printStackTrace();
        }
        System.out.println("after catch block..");
    }
}
