package com.xworkz.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StreetRunner {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/task";
        String userName = "root";
        String password = "yashu@123";
        try {
            Connection connection = DriverManager.getConnection(url, userName, password);
            System.out.println("Connection:" + connection);
            String sql = "insert into street values(2,'Church Road','Shivappa Layout','Shivamogga','Karnataka','India',577201,'Residential','Near Park',20)," +
                    "(3,'Market Road','Basavanagudi','Bengaluru','Karnataka','India',560004,'Market','Temple Corner',75)," +
                    "(4,'Lake View Road','Vidyanagar','Chikkamagaluru','Karnataka','India',577101,'Residential','Lake Area',18)," +
                    "(5,'Gandhi Road','Jayanagar','Bengaluru','Karnataka','India',560041,'Commercial','Bus Stop',45)," +
                    "(6,'Temple Road','BH Road','Shivamogga','Karnataka','India',577204,'Market','Old Temple',60)," +
                    "(7,'Coffee Street','Indira Layout','Chikkamagaluru','Karnataka','India',577102,'Residential','Coffee Estate',25)," +
                    "(8,'Station Road','Majestic','Bengaluru','Karnataka','India',560009,'Commercial','Railway Station',80)," +
                    "(9,'Park Street','Gopala Gowda Ext','Shivamogga','Karnataka','India',577203,'Residential','City Park',22)," +
                    "(10,'Hill Road','Kadur Road','Chikkamagaluru','Karnataka','India',577103,'Market','Hill View',35)," +
                    "(11,'Rajaji Road','Vijayanagar','Bengaluru','Karnataka','India',560040,'Commercial','Near Mall',50)," +
                    "(12,'Mall Road','Sagara Road','Shivamogga','Karnataka','India',577201,'Market','Big Circle',90)," +
                    "(13,'Main Bazaar','Kuvempunagar','Chikkamagaluru','Karnataka','India',577102,'Market','Bazar Gate',70)," +
                    "(14,'Silver Street','Malleshwaram','Bengaluru','Karnataka','India',560003,'Residential','Play Ground',15)," +
                    "(15,'Flower Road','KR Puram','Bengaluru','Karnataka','India',560036,'Commercial','Flyover',65)," +
                    "(16,'Heritage Road','Vinoba Nagar','Shivamogga','Karnataka','India',577202,'Residential','Heritage Circle',30)," +
                    "(17,'Coffee Market','IG Road','Chikkamagaluru','Karnataka','India',577101,'Market','Coffee Museum',55)," +
                    "(18,'Sunset Road','BTM Layout','Bengaluru','Karnataka','India',560029,'Residential','Lake Bed',28)," +
                    "(19,'River Road','Gajanur Road','Shivamogga','Karnataka','India',577202,'Commercial','River Bridge',40)," +
                    "(20,'Forest Road','Ayyanakere Area','Chikkamagaluru','Karnataka','India',577101,'Residential','Forest Entry',10)," +
                    "(21,'Rose Street','Jeevan Bima Nagar','Bengaluru','Karnataka','India',560075,'Market','Flower Shop',72)," +
                    "(22,'College Road','Durgigudi','Shivamogga','Karnataka','India',577201,'Commercial','College Gate',48)," +
                    "(23,'Fort Road','MCC Road','Chikkamagaluru','Karnataka','India',577102,'Residential','Fort Area',13)," +
                    "(24,'Sunrise Road','HSR Layout','Bengaluru','Karnataka','India',560102,'Residential','Park Front',20)," +
                    "(25,'Nehru Road','Savalanga Road','Shivamogga','Karnataka','India',577201,'Market','Nehru Circle',95)," +
                    "(26,'Valley Road','Aldur Area','Chikkamagaluru','Karnataka','India',577101,'Residential','Valley View',18)," +
                    "(27,'Metro Road','Yeshwanthpur','Bengaluru','Karnataka','India',560022,'Commercial','Metro Station',85)," +
                    "(28,'Old Bus Road','Gandhi Bazar','Shivamogga','Karnataka','India',577203,'Commercial','Bus Stand',60)," +
                    "(29,'Coffee Circle','Rathnagiri Bore','Chikkamagaluru','Karnataka','India',577103,'Market','Coffee Circle',42)," +
                    "(30,'Garden Road','JP Nagar','Bengaluru','Karnataka','India',560078,'Residential','Garden Park',12),"+
                    "(31,'Hilltop Road','Basavanagudi','Bengaluru','Karnataka','India',560004,'Residential','Hill Point',16)," +
                    "(32,'Bus Station Road','Sagara Road','Shivamogga','Karnataka','India',577201,'Commercial','New Bus Stand',78)," +
                    "(33,'Estate Road','Kudremukh Road','Chikkamagaluru','Karnataka','India',577102,'Residential','Estate View',20)," +
                    "(34,'Tech Park Road','Whitefield','Bengaluru','Karnataka','India',560066,'Commercial','ITPL',90)," +
                    "(35,'Palace Road','BH Road','Shivamogga','Karnataka','India',577202,'Market','Palace Ground',66)," +
                    "(36,'Lake Park Road','Hiremagalur','Chikkamagaluru','Karnataka','India',577102,'Residential','Lake Front',15)," +
                    "(37,'City Tower Street','Majestic','Bengaluru','Karnataka','India',560009,'Commercial','City Tower',110)," +
                    "(38,'Dam Road','Gajanur','Shivamogga','Karnataka','India',577203,'Residential','Gajanur Dam',14)," +
                    "(39,'Green Park Street','Mullayanagiri Base','Chikkamagaluru','Karnataka','India',577102,'Residential','Green Point',11)," +
                    "(40,'Lotus Road','Kengeri','Bengaluru','Karnataka','India',560060,'Market','Lotus Circle',47)," +
                    "(41,'Royal Street','Indiranagar','Bengaluru','Karnataka','India',560038,'Commercial','Royal Arcade',52)," +
                    "(42,'Station Road','Doddapete','Shivamogga','Karnataka','India',577201,'Market','Train Station',88)," +
                    "(43,'Nellikai Road','Mallandur Road','Chikkamagaluru','Karnataka','India',577103,'Market','Fruit Market',63)," +
                    "(44,'Tech Hub Road','Electronic City','Bengaluru','Karnataka','India',560100,'Commercial','Tech Hub',120)," +
                    "(45,'Market Circle','Shivappa Circle','Shivamogga','Karnataka','India',577202,'Market','Circle Area',75)," +
                    "(46,'Coffee Lake Road','IG Road','Chikkamagaluru','Karnataka','India',577101,'Residential','Coffee Lake',22)," +
                    "(47,'Temple Street','RR Nagar','Bengaluru','Karnataka','India',560098,'Residential','Temple Arch',19)," +
                    "(48,'Garden Circle','Bapujinagar','Shivamogga','Karnataka','India',577204,'Residential','Garden Circle',12)," +
                    "(49,'Hill Base Road','Mullayanagiri Road','Chikkamagaluru','Karnataka','India',577101,'Market','Hill Base',40)," +
                    "(50,'Sunlight Road','Bannerghatta','Bengaluru','Karnataka','India',560083,'Commercial','Zoological Park',65)," +
                    "(51,'Victory Road','Koramangala','Bengaluru','Karnataka','India',560095,'Commercial','Forum Mall',95)," +
                    "(52,'Riverside Road','Thirthahalli Road','Shivamogga','Karnataka','India',577202,'Residential','River Edge',16)," +
                    "(53,'Nehru Circle Road','Chikkamagaluru Town','Chikkamagaluru','Karnataka','India',577101,'Market','Nehru Circle',70)," +
                    "(54,'Liberty Road','MG Layout','Bengaluru','Karnataka','India',560001,'Market','Mall Entry',82)," +
                    "(55,'Clock Tower Road','Shivamogga City','Shivamogga','Karnataka','India',577201,'Market','Clock Tower',91)," +
                    "(56,'Forest Camp Road','Kemmanagundi','Chikkamagaluru','Karnataka','India',577102,'Residential','Camp Area',25)," +
                    "(57,'Palace Arch Road','Hebbal','Bengaluru','Karnataka','India',560024,'Residential','Palace Arch',21)," +
                    "(58,'School Road','Sagar Road','Shivamogga','Karnataka','India',577204,'Commercial','School Gate',49)," +
                    "(59,'Garden View Road','Aldur','Chikkamagaluru','Karnataka','India',577101,'Residential','Garden View',18)," +
                    "(60,'Central Road','BTM 1st Stage','Bengaluru','Karnataka','India',560029,'Market','Central Circle',68)," +
                    "(61,'Unity Road','Ulsoor','Bengaluru','Karnataka','India',560042,'Residential','Lake View',22)," +
                    "(62,'Heritage Street','Thirthahalli','Shivamogga','Karnataka','India',577220,'Market','Heritage Home',55)," +
                    "(63,'Estate Main Road','Mudigere','Chikkamagaluru','Karnataka','India',577132,'Residential','Estate Plot',14)," +
                    "(64,'Airport Road','Yelahanka','Bengaluru','Karnataka','India',560064,'Commercial','Airport Link',130)," +
                    "(65,'Main Circle Road','Hosamane','Shivamogga','Karnataka','India',577201,'Commercial','Main Circle',72)," +
                    "(66,'Coffee Aroma Road','Koppa Road','Chikkamagaluru','Karnataka','India',577126,'Market','Coffee Aroma',33)," +
                    "(67,'Lotus Garden Street','Banashankari','Bengaluru','Karnataka','India',560070,'Residential','Lotus Garden',18)," +
                    "(68,'Vinayaka Road','Soraba Road','Shivamogga','Karnataka','India',577227,'Market','Vinayaka Temple',41)," +
                    "(69,'Green Hills Road','Sringeri Road','Chikkamagaluru','Karnataka','India',577139,'Residential','Hill Base',20)," +
                    "(70,'Tiger Road','Bannerghatta','Bengaluru','Karnataka','India',560083,'Commercial','Tiger Safari',96)," +
                    "(71,'Crystal Road','HSR Sector 2','Bengaluru','Karnataka','India',560102,'Residential','Crystal Homes',19)," +
                    "(72,'Victory Circle Street','BH Road','Shivamogga','Karnataka','India',577201,'Market','Victory Circle',77)," +
                    "(73,'Coffee Court Road','Ayyanakere','Chikkamagaluru','Karnataka','India',577102,'Market','Court Lake',52)," +
                    "(74,'Orchid Street','Jaynagar 5th Block','Bengaluru','Karnataka','India',560041,'Residential','Orchid Park',14)," +
                    "(75,'Heritage Market Road','Shivappa Nayaka Fort','Shivamogga','Karnataka','India',577201,'Market','Fort Entry',85)";
            Statement statement = connection.createStatement();
            int rowAffected=statement.executeUpdate(sql);
            System.out.println("rowAffected:"+rowAffected);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
