package com.xworkz.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SweetRunner {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/task";
        String userName = "root";
        String password = "yashu@123";
        try {
            Connection connection = DriverManager.getConnection(url, userName, password);
            System.out.println("Connection:" +connection);
            String sql="insert into sweet values(2,'Rasgulla','Milk Sweet',140, '1 kg', 'Sweet Palace','Chhena, Sugar')," +
                    "(4,'Ladoo','Festival Sweet',150,'1 kg','Balaji Sweets','Besan, Ghee')," +
                    "(5,'Jalebi','Fried Sweet',100,'1 kg','Balaji Sweet','Maida,Sugar'),"+
                    "(6,'Mysore Pak','Ghee Sweet',200,'1 kg','Krishna Sweets','Gram Flour, Ghee')," +
                    "(7,'Barfi','Milk Sweet',180,'1 kg','Sri Sweet','Milk,Sugar')," +
                    "(8,'Peda','Milk Sweet',220,'1 kg','Peda House','Milk')," +
                    "(9,'Rabri','Milk Sweet',250,'1 kg','Sweet Palace','Milk,Sugar'),"+
                    "(10,'Soan Papdi','Flaky Sweet',90,'500 g','Haldiram','Gram Flour,Sugar')," +
                    "(11,'Cham Cham','Bengali Sweet',160,'1 kg','Bengal Sweets','Chhena,Sugar')," +
                    "(12,'Sandesh','Bengali Sweet',200,'1 kg','Bengal Sweets','Paneer, Sugar')," +
                    "(13,'Malpua','Fried Sweet',130,'1 kg','Sri Sweets','Flour, Sugar')," +
                    "(14,'Rava Ladoo','Festival Sweet',140,'1 kg','Krishna Sweets','Rava, Ghee')," +
                    "(15,'Kheer Kadam','Bengali Sweet',210,'1 kg','Bengal Sweets','Khoya, Sugar'),"+
                    "(16,'Motichoor Ladoo','Festival Sweet',170,'1 kg','Balaji Sweets','Boondi, Sugar')," +
                    "(17,'Dharwad Peda','Milk Sweet',300,'1 kg','Peda House','Milk, Sugar')," +
                    "(18,'Badam Halwa','Dry Fruit Sweet',350,'500 g','Krishna Sweets','Badam, Ghee')," +
                    "(19,'Gajar Halwa','Halwa',200,'1 kg','Sri Sweets','Carrot, Milk')," +
                    "(20,'Moong Dal Halwa', 'Halwa',250,'1 kg','Sweet Palace','Moong Dal, Ghee')," +
                    "(21,'Chikki','Dry Sweet',80,'500 g','Haldiram','Groundnut, Jaggery')," +
                    "(22,'Kheer','Milk Sweet',180,'1 kg','Sweet Palace','Milk, Rice')," +
                    "(23,'Pal Kova','Milk Sweet',260,'1 kg','Sri Sweets','Milk, Sugar')," +
                    "(24,'Obbattu','Traditional Sweet',100,'1 kg','Krishna Sweets','Dal, Jaggery')," +
                    "(25,'Ariselu','Traditional Sweet',160,'1 kg','Andhra Sweets','Rice, Jaggery'),"+
                    "(26,'Boondi','Sweet Snack',120,'1 kg','Balaji Sweets','Gram Flour, Sugar')," +
                    "(27,'Palkova','Milk Sweet',250,'1 kg','Sri Sweets','Milk')," +
                    "(28,'Kesari Bath','Ghee Sweet',100,'1 kg','Krishna Sweets','Rava, Sugar')," +
                    "(29,'Apple Barfi','Fruit Sweet',200,'1 kg','Sweet Palace','Apple, Sugar')," +
                    "(30,'Dry Fruit Ladoo','Dry Fruit Sweet',400,'1 kg','Haldiram','Mixed Dry Fruits')," +
                    "(31,'Chocolate Barfi','Fusion Sweet',220,'1 kg','Sri Sweets','Cocoa, Milk')," +
                    "(32,'Paneer Jalebi','Fried Sweet',180,'1 kg','Balaji Sweets','Paneer, Sugar')," +
                    "(33,'Anjeer Roll','Dry Fruit Sweet',480,'500 g','Haldiram','Figs, Nuts')," +
                    "(34,'Milk Cake','Milk Sweet',210,'1 kg','Krishna Sweets','Milk, Sugar')," +
                    "(35,'Til Ladoo','Traditional Sweet',90,'1 kg','Sri Sweets','Sesame, Jaggery'),"+
                    "(36,'Kalakand','Milk Sweet',200,'1 kg','Sweet Palace','Milk, Sugar'),"+
                    "(37,'Badusha','Fried Sweet',160,'1 kg','Balaji Sweets','Maida, Sugar')," +
                    "(38,'Pineapple Halwa','Halwa',140,'1 kg','Sri Sweets','Sri Sweets')," +
                    "(39,'Carrot Halwa','Halwa',220,'1 kg','Krishna Sweets','Carrot, Milk')," +
                    "(40,'Dates Roll','Dry Fruit Sweet',300,'500 g','Haldiram','Dates, Nuts'),"+
                    "(41,'Kova Puri','Traditional Sweet',140,'1 kg','Andhra Sweets','Kova, Sugar')," +
                    "(42,'Mango Barfi','Fruit Sweet',200,'1 kg','Sri Sweets','Mango, Milk')," +
                    "(43,'Rose Milk Cake','Milk Sweet',230,'1 kg','Sweet Palace','Milk,Rose Syrup'),"+
                    "(44,'Dry Fruit Barfi','Dry Fruit Sweet',420,'1 kg','Haldiram','Mixed Dry Fruits'),"+
                    "(45,'Orange Burfi','Fruit Sweet',180,'1 kg','Balaji Sweets','Orange, Milk')," +
                    "(46,'Rasgulla Roll','Bengali Sweet',210,'1 kg','Bengal Sweets','Chhena, Sugar')," +
                    "(47,'Milk Mysore Pak','Ghee Sweet',260,'1 kg','Krishna Sweets','Milk, Ghee')," +
                    "(48,'Caramel Barfi','Fusion Sweet',220,'1 kg','Sweet Palace','Caramel, Milk')," +
                    "(49,'Dry Coconut Ladoo','Traditional Sweet',150,'1 kg','Sri Sweets','Coconut, Sugar'),"+
                    "(50,'Chocolate Ladoo','Fusion Sweet',180,'1 kg','Balaji Sweets','Cocoa, Milk'),"+
                    "(51,'Jackfruit Halwa','Fruit Sweet',190,'1 kg','Krishna Sweets','Jackfruit, Sugar')," +
                    "(52,'Strawberry Barfi','Fruit Sweet', 220, '1 kg','Sweet Palace','Strawberry, Milk')," +
                    "(53,'Honey Ladoo','Healthy Sweet',240,'1 kg','Haldiram', 'Honey, Flour')," +
                    "(54,'Dry Gulab Jamun','Milk Sweet',150,'1 kg','Sri Sweets','Khoya, Sugar'),"+
                    "(55,'Dry Gulab Jamun','Milk Sweet',150,'1 kg','Sri Sweets','Khoya, Sugar')," +
                    "(56,'Jaggery Mysore Pak','Traditional Sweet',200,'1 kg','Krishna Sweets','Jaggery, Flour')," +
                    "(57,'Milk Peda', 'Milk Sweet', 180, '1 kg','Peda House','Milk, Cardamom')," +
                    "(58,'Dry Fruit Halwa','Dry Fruit Sweet',320,'1 kg','Sweet Palace','Dry Fruits, Ghee'),"+
                    "(59,'Khova Ladoo', 'Milk Sweet', 200, '1 kg', 'Balaji Sweets', 'Khova, Sugar')," +
                    "(60,'Coconut Barfi','Traditional Sweet',170,'1 kg','Sri Sweets','Coconut, Sugar')," +
                    "(61,'Banana Halwa','Fruit Sweet',150,'1 kg','Krishna Sweets','Banana, Sugar')," +
                    "(62,'Choco Chip Barfi','Fusion Sweet',240,'1 kg','Sweet Palace','Chocolate Chips, Milk')," +
                    "(63,'Milk Burfi','Milk Sweet',190,'1 kg','Sri Sweets','Milk, Sugar')," +
                    "(64,'Dry Rasgulla','Bengali Sweet',180,'1 kg','Bengal Sweets','Chhena, Sugar')," +
                    "(65,'Sugar-free Ladoo','Healthy Sweet',300,'1 kg','Haldiram','Dry Fruits')," +
                    "(66,'Pista Roll','Dry Fruit Sweet',450,'500 g','Sweet Palace','Pista, Sugar')," +
                    "(67,'Kaju Roll','Dry Fruit Sweet',470,'500 g','Sri Sweets','Cashew, Sugar'),"+
                    "(68,'Multigrain Ladoo', 'Healthy Sweet', 280, '1 kg','Haldiram','Mixed Grains, Jaggery')," +
                    "(69,'Rose Ladoo', 'Floral Sweet', 200, '1 kg','Balaji Sweets','Rose, Milk')," +
                    "(70,'Blueberry Barfi', 'Fusion Sweet', 250, '1 kg', 'Sweet Palace','Blueberry, Milk')," +
                    "(71,'Honey Barfi','Healthy Sweet',270,'1 kg','Sri Sweets','Honey, Milk')," +
                    "(72,'Saffron Milk Cake','Premium Sweet',300,'1 kg','Krishna Sweets','Milk, Saffron')," +
                    "(73,'Badam Peda','Dry Fruit Sweet',350,'1 kg','Peda House','Almond, Milk')," +
                    "(74,'Chocolate Mysore Pak','Fusion Sweet',260,'1 kg','Krishna Sweets','Cocoa, Ghee')," +
                    "(75,'Dharwad Peda','Milk Sweet',350,'1 kg','Peda House','Milk, Sugar');";
            Statement statement=connection.createStatement();
            int rowAffected=statement.executeUpdate(sql);
            System.out.println("rowsAffected :"+rowAffected);


            String sql1="insert into sweet values(3,'Kaju Katli','Dry Fruit Sweet',450,'500 g','Sri Sweets','Cashew, Sugar')";
            Statement statement1=connection.createStatement();
            int rowAffected1=statement1.executeUpdate(sql1);
            System.out.println("rowsAffected :"+rowAffected1);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("after catch block..");
    }
}

