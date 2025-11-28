package com.xworkz.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class HospitalRunner {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/task";
        String userName = "root";
        String password = "yashu@123";

        try {
            Connection connection = DriverManager.getConnection(url, userName, password);
            System.out.println("Connection :" + connection);

            String sql= "insert into hospital values(2,'Sri Devi Hospital','Vinoba Nagar','Shivamogga','Karnataka','India',120,'2001-02-15','Cardiology','hospital002@gmail.com')," +
                    "(3,'Nanjappa Hospital','BH Road','Shivamogga','Karnataka','India',180,'1999-07-20','Neurology','hospital003@gmail.com'),"+
            "(4,'City Care Clinic','Gopi Circle','Shivamogga','Karnataka','India',40,'2010-05-10','General','hospital004@gmail.com'),"+
            "(5,'LifeCare Hospital','Sagar Road','Shivamogga','Karnataka','India',220,'2005-09-08','Orthopedics','hospital005@gmail.com'),"+
            "(6,'Vivekananda Hospital','Vinayaka Nagar','Shivamogga','Karnataka','India',300,'1998-01-25','General Surgery','hospital006@gmail.com'),"+
            "(7,'Shiva Heart Centre','Savalanga Road','Shivamogga','Karnataka','India',90,'2012-08-14','Cardiology','hospital007@gmail.com'),"+
            "(8,'Sanjeevini Hospital','Mandli Road','Shivamogga','Karnataka','India',160,'2007-03-11','ENT','hospital008@gmail.com'),"+
            "(9,'Vijaya Hospital','Shanthi Nagar','Shivamogga','Karnataka','India',140,'2003-12-03','Dermatology','hospital009@gmail.com'),"+
            "(10,'Rainbow Hospital','Kote Road','Shivamogga','Karnataka','India',200,'2015-11-09','Pediatrics','hospital010@gmail.com'),"+
            "(11,'Global Hospital','Sulebhavi Road','Shivamogga','Karnataka','India',250,'2002-07-02','Nephrology','hospital011@gmail.com'),"+
            "(12,'Shree Sai Hospital','Gandhi Bazar','Shivamogga','Karnataka','India',130,'2011-04-20','Diabetology','hospital012@gmail.com'),"+
            "(13,'Janatha Clinic','BH Road','Shivamogga','Karnataka','India',30,'2017-06-06','General','hospital013@gmail.com'),"+
            "(14,'Prime Care Hospital','Gopala Road','Shivamogga','Karnataka','India',210,'2006-10-28','Gynecology','hospital014@gmail.com'),"+
            "(15,'Sparsha Hospital','Church Road','Shivamogga','Karnataka','India',170,'2018-09-14','Fertility','hospital015@gmail.com'),"+
            "(16,'Aarogya Hospital','Vinayaka Layout','Shivamogga','Karnataka','India',190,'2004-05-19','Pulmonology','hospital016@gmail.com'),"+
            "(17,'Nayana Eye Hospital','BH Road','Shivamogga','Karnataka','India',60,'2013-12-17','Ophthalmology','hospital017@gmail.com'),"+
            "(18,'Siri Multi-speciality','Rajendra Nagar','Shivamogga','Karnataka','India',230,'2009-11-21','Multi-speciality','hospital018@gmail.com'),"+
            "(19,'City Dental Care','Gopi Circle','Shivamogga','Karnataka','India',25,'2016-04-04','Dental','hospital019@gmail.com'),"+
            "(20,'Jeevan Hospital','Vinoba Nagar','Shivamogga','Karnataka','India',150,'2008-01-12','General Medicine','hospital020@gmail.com'),"+
            "(21,'Sunrise Hospital','Shivappa Nayaka Circle','Shivamogga','Karnataka','India',180,'2005-08-30','Orthopedics','hospital021@gmail.com'),"+
            "(22,'Sanjeev Clinic','New Mandli','Shivamogga','Karnataka','India',35,'2019-03-16','General','hospital022@gmail.com'),"+
            "(23,'Hope Hospital','Gandhi Nagar','Shivamogga','Karnataka','India',160,'2003-02-22','Cardiology','hospital023@gmail.com'),"+
            "(24,'Asha Maternity Home','Savalanga Road','Shivamogga','Karnataka','India',90,'2010-10-10','Maternity','hospital024@gmail.com'),"+
            "(25,'Navachethana Hospital','BH Road','Shivamogga','Karnataka','India',200,'1997-05-07','General Surgery','hospital025@gmail.com'),"+
            "(26,'Unity Care Hospital','Gandhi Nagar','Shivamogga','Karnataka','India',175,'2001-06-15','Neurology','hospital026@gmail.com'),"+
            "(27,'Sowmya Hospital','Vijayanagar','Shivamogga','Karnataka','India',155,'2006-03-05','Urology','hospital027@gmail.com'),"+
            "(28,'Vatsalya Hospital','Near Bus Stand','Shivamogga','Karnataka','India',130,'2014-12-22','Pediatrics','hospital028@gmail.com'),"+
            "(29,'Deepa Hospital','Gopi Circle','Shivamogga','Karnataka','India',145,'2011-08-10','Dermatology','hospital029@gmail.com'),"+
            "(30,'Raksha Hospital','Kote Road','Shivamogga','Karnataka','India',220,'2000-09-18','General','hospital030@gmail.com'),"+
                    "(31,'Victoria Hospital','KR Market','Bengaluru','Karnataka','India',500,'1985-07-15','General Medicine','hospital031@gmail.com'),"+
            "(32,'Manipal Hospital','Old Airport Road','Bengaluru','Karnataka','India',400,'1992-03-20','Multi-speciality','hospital032@gmail.com'),"+
            "(33,'Fortis Hospital','Bannerghatta Road','Bengaluru','Karnataka','India',350,'1998-01-25','Cardiology','hospital033@gmail.com'),"+
            "(34,'Apollo Hospital','Jayanagar','Bengaluru','Karnataka','India',420,'2001-11-11','Multi-speciality','hospital034@gmail.com'),"+
            "(35,'Columbia Asia','Hebbal','Bengaluru','Karnataka','India',280,'2004-08-03','Neurology','hospital035@gmail.com'),"+
            "(36,'Aster CMI Hospital','Hebbal','Bengaluru','Karnataka','India',300,'2010-09-12','Multi-speciality','hospital036@gmail.com'),"+
            "(37,'Jayadeva Hospital','Bannerghatta','Bengaluru','Karnataka','India',600,'1980-02-18','Cardiology','hospital037@gmail.com'),"+
            "(38,'Narayana Health','Bommasandra','Bengaluru','Karnataka','India',450,'2005-05-26','Cardiac Surgery','hospital038@gmail.com'),"+
            "(39,'Cloudnine Hospital','Jayanagar','Bengaluru','Karnataka','India',200,'2011-06-04','Maternity','hospital039@gmail.com'),"+
            "(40,'Motherhood Hospital','Indiranagar','Bengaluru','Karnataka','India',180,'2013-10-10','Gynecology','hospital040@gmail.com'),"+
            "(41,'Sagar Hospital','Banashankari','Bengaluru','Karnataka','India',250,'2007-07-14','Multi-speciality','hospital041@gmail.com'),"+
            "(42,'Ramaiah Hospital','Mathikere','Bengaluru','Karnataka','India',320,'1995-02-28','General Medicine','hospital042@gmail.com'),"+
            "(43,'St. Johns Hospital','Koramangala','Bengaluru','Karnataka','India',450,'1975-12-01','General','hospital043@gmail.com'),"+
            "(44,'BGS Global Hospital','Kengeri','Bengaluru','Karnataka','India',300,'2009-03-16','Multi-speciality','hospital044@gmail.com'),"+
            "(45,'Sparsh Hospital','Yeshwanthpur','Bengaluru','Karnataka','India',280,'2008-04-25','Orthopedics','hospital045@gmail.com'),"+
            "(46,'Aster Women & Children','Whitefield','Bengaluru','Karnataka','India',150,'2015-09-09','Pediatrics','hospital046@gmail.com'),"+
            "(47,'KIMS Hospital','VV Puram','Bengaluru','Karnataka','India',350,'2003-06-18','General','hospital047@gmail.com'),"+
            "(48,'ESI Hospital','Rajajinagar','Bengaluru','Karnataka','India',500,'1988-01-14','General','hospital048@gmail.com'),"+
            "(49,'Bowring Hospital','Shivajinagar','Bengaluru','Karnataka','India',420,'1979-08-22','General Medicine','hospital049@gmail.com'),"+
            "(50,'Kanva Hospital','Rajajinagar','Bengaluru','Karnataka','India',200,'2014-05-17','ENT','hospital050@gmail.com'),"+
            "(51,'Crescent Hospital','BTM Layout','Bengaluru','Karnataka','India',160,'2016-11-30','Dermatology','hospital051@gmail.com'),"+
            "(52,'Green City Hospital','Hosur Road','Bengaluru','Karnataka','India',190,'2012-04-02','General','hospital052@gmail.com'),"+
            "(53,'Akshaya Hospital','BTM Layout','Bengaluru','Karnataka','India',210,'2009-10-28','Orthopedics','hospital053@gmail.com'),"+
            "(54,'MedStar Hospital','JP Nagar','Bengaluru','Karnataka','India',170,'2017-02-18','Neurology','hospital054@gmail.com'),"+
            "(55,'City Orthopedic Centre','Hebbal','Bengaluru','Karnataka','India',130,'2013-08-08','Orthopedics','hospital055@gmail.com'),"+
            "(56,'Smile Dental Care','HSR Layout','Bengaluru','Karnataka','India',40,'2018-01-12','Dental','hospital056@gmail.com'),"+
            "(57,'Elite Eye Care','Jayanagar','Bengaluru','Karnataka','India',35,'2019-07-22','Ophthalmology','hospital057@gmail.com'),"+
            "(58,'Lotus Fertility Centre','Indiranagar','Bengaluru','Karnataka','India',150,'2011-05-05','Fertility','hospital058@gmail.com'),"+
            "(59,'Pulse Diagnostics','MG Road','Bengaluru','Karnataka','India',25,'2016-12-09','Diagnostics','hospital059@gmail.com'),"+
            "(60,'V-Care Hospital','Whitefield','Bengaluru','Karnataka','India',210,'2010-03-19','General Medicine','hospital060@gmail.com'),"+
            "(61,'Nova Hospital','BTM Layout','Bengaluru','Karnataka','India',190,'2008-11-11','General','hospital061@gmail.com'),"+
            "(62,'Harmony Hospital','Electronic City','Bengaluru','Karnataka','India',170,'2014-01-23','ENT','hospital062@gmail.com'),"+
            "(63,'South City Hospital','Banashankari','Bengaluru','Karnataka','India',260,'2006-06-06','General','hospital063@gmail.com'),"+
            "(64,'Vikram Hospital','Millers Road','Bengaluru','Karnataka','India',320,'2009-09-27','Multi-speciality','hospital064@gmail.com'),"+
            "(65,'Lakeview Hospital','Ulsoor','Bengaluru','Karnataka','India',240,'2013-04-15','General','hospital065@gmail.com'),"+
            "(66,'Silverline Hospital','Richmond Town','Bengaluru','Karnataka','India',180,'2016-10-10','Dermatology','hospital066@gmail.com'),"+
            "(67,'Revive Hospital','Jalahalli','Bengaluru','Karnataka','India',150,'2018-05-18','General','hospital067@gmail.com'),"+
            "(68,'Swasthya Clinic','KR Puram','Bengaluru','Karnataka','India',30,'2017-03-09','General','hospital068@gmail.com'),"+
            "(69,'Ayush Hospital','BTM Layout','Bengaluru','Karnataka','India',200,'2011-08-25','Ayurveda','hospital069@gmail.com'),"+
            "(70,'Pristine Hospital','HSR Layout','Bengaluru','Karnataka','India',230,'2005-12-14','General','hospital070@gmail.com'),"+
            "(71,'Royal Care Hospital','Banashankari','Bengaluru','Karnataka','India',190,'2010-07-19','Cardiology','hospital071@gmail.com'),"+
            "(72,'Bright Vision Hospital','Yelahanka','Bengaluru','Karnataka','India',175,'2014-11-29','Neurology','hospital072@gmail.com'),"+
            "(73,'Unity Hospital','Electronic City','Bengaluru','Karnataka','India',210,'2007-10-10','General','hospital073@gmail.com'),"+
            "(74,'MedLife Hospital','BTM Layout','Bengaluru','Karnataka','India',160,'2015-06-16','General','hospital074@gmail.com'),"+
            "(75,'Rainbow Children Care','Jayanagar','Bengaluru','Karnataka','India',200,'2018-09-04','Pediatrics','hospital075@gmail.com')";


            Statement statement = connection.createStatement();
            int rowAffected=statement.executeUpdate(sql);
            System.out.println("rowAffected:"+rowAffected);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


