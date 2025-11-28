package com.xworkz.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PresidentRunner {

    public static void main(String[] args) {


        String url = "jdbc:mysql://localhost:3306/task";
        String userName = "root";
        String password = "yashu@123";

        try {
            Connection connection = DriverManager.getConnection(url, userName, password);
            System.out.println("Connection :" + connection);
            String sql = "insert into president values(2,'Meera','Nair',52,'Female','India','Kerala','Kochi','2015-05-12','2020-05-12','Party B','PhD Economics',22,'Healthcare reforms','meera2@gmail.com',987650002)," +
                    "(3,'Rohan','Shetty',60,'Male','India','Maharashtra','Mumbai','2010-01-10','2015-01-10','Party C','MA Political Science',30,'Infrastructure boost','rohan3@gmail.com',987650003)," +
                    "(4,'Divya','Sharma',50,'Female','India','Delhi','New Delhi','2012-03-01','2017-03-01','Party A','LLB',20,'Judicial reforms','divya4@gmail.com',987650004)," +
                    "(5,'Karan','Patil',58,'Male','India','Gujarat','Ahmedabad','2016-07-01','2021-07-01','Party B','MBA',28,'Trade agreements','karan5@gmail.com',987650005)," +
                    "(6,'Sanya','Rao',49,'Female','India','Tamil Nadu','Chennai','2018-09-01','2023-09-01','Party C','PhD Sociology',19,'Women empowerment','sanya6@gmail.com',987650006)," +
                    "(7,'Mahesh','Gowda',57,'Male','India','Karnataka','Mysuru','2011-05-05','2016-05-05','Party A','BA History',27,'Heritage conservation','mahesh7@gmail.com',987650007)," +
                    "(8,'Anjali','Singh',53,'Female','India','Uttar Pradesh','Lucknow','2013-02-01','2018-02-01','Party B','MA Economics',23,'Education reforms','anjali8@gmail.com',987650008)," +
                    "(9,'Vikram','Reddy',59,'Male','India','Telangana','Hyderabad','2017-04-01','2022-04-01','Party C','BSc Political Science',26,'Industrial growth','vikram9@gmail.com',987650009)," +
                    "(10,'Pooja','Desai',51,'Female','India','Maharashtra','Pune','2010-08-01','2015-08-01','Party A','MBA',21,'Healthcare modernization','pooja10@gmail.com',987650010)," +
                    "(11,'Ajay','Mehta',56,'Male','India','Rajasthan','Jaipur','2011-09-01','2016-09-01','Party B','PhD Economics',25,'Agriculture reforms','ajay11@gmail.com',987650011)," +
                    "(12,'Neha','Kumar',48,'Female','India','Karnataka','Bengaluru','2014-01-01','2019-01-01','Party C','MA Sociology',20,'Social welfare','neha12@gmail.com',987650012)," +
                    "(13,'Ravi','Sharma',62,'Male','India','Himachal Pradesh','Shimla','2009-05-01','2014-05-01','Party A','LLB',32,'Judicial improvements','ravi13@gmail.com',987650013)," +
                    "(14,'Sneha','Patel',50,'Female','India','Gujarat','Surat','2016-03-01','2021-03-01','Party B','MBA',22,'Trade reforms','sneha14@gmail.com',987650014)," +
                    "(15,'Manoj','Rao',54,'Male','India','Karnataka','Mangaluru','2012-06-01','2017-06-01','Party C','BA History',24,'Heritage preservation','manoj15@gmail.com',987650015)," +
                    "(16,'Shreya','Nair',49,'Female','India','Kerala','Thiruvananthapuram','2013-07-01','2018-07-01','Party A','MA Economics',19,'Healthcare development','shreya16@gmail.com',987650016)," +
                    "(17,'Suresh','Patil',57,'Male','India','Maharashtra','Nagpur','2015-09-01','2020-09-01','Party B','MBA',27,'Industrial growth','suresh17@gmail.com',987650017)," +
                    "(18,'Isha','Sharma',52,'Female','India','Delhi','New Delhi','2010-11-01','2015-11-01','Party C','LLB',21,'Judicial reforms','isha18@gmail.com',987650018)," +
                    "(19,'Kunal','Gowda',60,'Male','India','Karnataka','Bengaluru','2011-01-01','2016-01-01','Party A','BSc Political Science',30,'Economic development','kunal19@gmail.com',987650019)," +
                    "(20,'Anita','Singh',51,'Female','India','Uttar Pradesh','Varanasi','2014-05-01','2019-05-01','Party B','PhD Economics',22,'Education improvements','anita20@gmail.com',987650020)," +
                    "(21,'Raghav','Reddy',58,'Male','India','Telangana','Warangal','2012-06-01','2017-06-01','Party C','MBA',28,'Industrial reforms','raghav21@gmail.com',987650021)," +
                    "(22,'Pallavi','Desai',50,'Female','India','Maharashtra','Nagpur','2016-07-01','2021-07-01','Party A','MA Economics',23,'Healthcare','pallavi22@gmail.com',987650022)," +
                    "(23,'Amit','Mehta',55,'Male','India','Rajasthan','Udaipur','2010-08-01','2015-08-01','Party B','LLB',25,'Judicial reforms','amit23@gmail.com',987650023)," +
                    "(24,'Priya','Kumar',48,'Female','India','Karnataka','Mysuru','2013-09-01','2018-09-01','Party C','MBA',19,'Social welfare','priya24@gmail.com',987650024)," +
                    "(25,'Sanjay','Sharma',61,'Male','India','Himachal Pradesh','Dharamshala','2009-01-01','2014-01-01','Party A','MA Political Science',32,'Infrastructure boost','sanjay25@gmail.com',987650025)," +
                    "(26,'Neetu','Patel',50,'Female','India','Gujarat','Vadodara','2015-02-01','2020-02-01','Party B','MBA',22,'Trade reforms','neetu26@gmail.com',987650026)," +
                    "(27,'Vikram','Rao',56,'Male','India','Karnataka','Bengaluru','2012-03-01','2017-03-01','Party C','BA History',27,'Heritage preservation','vikram27@gmail.com',987650027)," +
                    "(28,'Sanya','Nair',49,'Female','India','Kerala','Kochi','2014-04-01','2019-04-01','Party A','PhD Sociology',19,'Women empowerment','sanya28@gmail.com',987650028)," +
                    "(29,'Mahesh','Patil',57,'Male','India','Maharashtra','Mumbai','2016-05-01','2021-05-01','Party B','MBA',28,'Industrial reforms','mahesh29@gmail.com',987650029)," +
                    "(30,'Divya','Sharma',52,'Female','India','Delhi','New Delhi','2010-06-01','2015-06-01','Party C','LLB',23,'Judicial reforms','divya30@gmail.com',987650030)," +
                    "(31,'Rohan','Gowda',60,'Male','India','Karnataka','Mysuru','2011-07-01','2016-07-01','Party A','BSc Political Science',30,'Economic development','rohan31@gmail.com',987650031)," +
                    "(32,'Anjali','Singh',51,'Female','India','Uttar Pradesh','Agra','2014-08-01','2019-08-01','Party B','MA Economics',22,'Education reforms','anjali32@gmail.com',987650032)," +
                    "(33,'Kunal','Reddy',58,'Male','India','Telangana','Hyderabad','2012-09-01','2017-09-01','Party C','MBA',28,'Industrial growth','kunal33@gmail.com',987650033)," +
                    "(34,'Pooja','Desai',50,'Female','India','Maharashtra','Pune','2016-10-01','2021-10-01','Party A','MBA',23,'Healthcare modernization','pooja34@gmail.com',987650034)," +
                    "(35,'Ajay','Mehta',56,'Male','India','Rajasthan','Jaipur','2010-11-01','2015-11-01','Party B','PhD Economics',25,'Agriculture reforms','ajay35@gmail.com',987650035)," +
                    "(36,'Neha','Kumar',48,'Female','India','Karnataka','Bengaluru','2013-12-01','2018-12-01','Party C','MA Sociology',20,'Social welfare','neha36@gmail.com',987650036)," +
                    "(37,'Ravi','Sharma',62,'Male','India','Himachal Pradesh','Shimla','2009-01-01','2014-01-01','Party A','LLB',32,'Judicial improvements','ravi37@gmail.com',987650037)," +
                    "(38,'Sneha','Patel',50,'Female','India','Gujarat','Surat','2015-02-01','2020-02-01','Party B','MBA',22,'Trade reforms','sneha38@gmail.com',987650038)," +
                    "(39,'Manoj','Rao',54,'Male','India','Karnataka','Mangaluru','2012-03-01','2017-03-01','Party C','BA History',24,'Heritage preservation','manoj39@gmail.com',987650039)," +
                    "(40,'Shreya','Nair',49,'Female','India','Kerala','Thiruvananthapuram','2013-04-01','2018-04-01','Party A','MA Economics',19,'Healthcare development','shreya40@gmail.com',987650040)," +
                    "(41,'Suresh','Patil',57,'Male','India','Maharashtra','Nagpur','2015-05-01','2020-05-01','Party B','MBA',27,'Industrial growth','suresh41@gmail.com',987650041)," +
                    "(42,'Isha','Sharma',52,'Female','India','Delhi','New Delhi','2010-06-01','2015-06-01','Party C','LLB',21,'Judicial reforms','isha42@gmail.com',987650042)," +
                    "(43,'Kunal','Gowda',60,'Male','India','Karnataka','Bengaluru','2011-07-01','2016-07-01','Party A','BSc Political Science',30,'Economic development','kunal43@gmail.com',987650043)," +
                    "(44,'Anita','Singh',51,'Female','India','Uttar Pradesh','Varanasi','2014-08-01','2019-08-01','Party B','PhD Economics',22,'Education improvements','anita44@gmail.com',987650044)," +
                    "(45,'Raghav','Reddy',58,'Male','India','Telangana','Warangal','2012-09-01','2017-09-01','Party C','MBA',28,'Industrial reforms','raghav45@gmail.com',987650045)," +
                    "(46,'Pallavi','Desai',50,'Female','India','Maharashtra','Nagpur','2016-10-01','2021-10-01','Party A','MA Economics',23,'Healthcare','pallavi46@gmail.com',987650046)," +
                    "(47,'Amit','Mehta',55,'Male','India','Rajasthan','Udaipur','2010-11-01','2015-11-01','Party B','LLB',25,'Judicial reforms','amit47@gmail.com',987650047)," +
                    "(48,'Priya','Kumar',48,'Female','India','Karnataka','Mysuru','2013-12-01','2018-12-01','Party C','MBA',19,'Social welfare','priya48@gmail.com',987650048)," +
                    "(49,'Sanjay','Sharma',61,'Male','India','Himachal Pradesh','Dharamshala','2009-01-01','2014-01-01','Party A','MA Political Science',32,'Infrastructure boost','sanjay49@gmail.com',987650049)," +
                    "(50,'Neetu','Patel',50,'Female','India','Gujarat','Vadodara','2015-02-01','2020-02-01','Party B','MBA',22,'Trade reforms','neetu50@gmail.com',987650050)," +
                    "(51,'Vikram','Rao',56,'Male','India','Karnataka','Bengaluru','2012-03-01','2017-03-01','Party C','BA History',27,'Heritage preservation','vikram51@gmail.com',987650051)," +
                    "(52,'Sanya','Nair',49,'Female','India','Kerala','Kochi','2014-04-01','2019-04-01','Party A','PhD Sociology',19,'Women empowerment','sanya52@gmail.com',987650052)," +
                    "(53,'Mahesh','Patil',57,'Male','India','Maharashtra','Mumbai','2016-05-01','2021-05-01','Party B','MBA',28,'Industrial reforms','mahesh53@gmail.com',987650053)," +
                    "(54,'Divya','Sharma',52,'Female','India','Delhi','New Delhi','2010-06-01','2015-06-01','Party C','LLB',23,'Judicial reforms','divya54@gmail.com',987650054)," +
                    "(55,'Rohan','Gowda',60,'Male','India','Karnataka','Mysuru','2011-07-01','2016-07-01','Party A','BSc Political Science',30,'Economic development','rohan55@gmail.com',987650055)," +
                    "(56,'Anjali','Singh',51,'Female','India','Uttar Pradesh','Agra','2014-08-01','2019-08-01','Party B','MA Economics',22,'Education reforms','anjali56@gmail.com',987650056)," +
                    "(57,'Kunal','Reddy',58,'Male','India','Telangana','Hyderabad','2012-09-01','2017-09-01','Party C','MBA',28,'Industrial growth','kunal57@gmail.com',987650057)," +
                    "(58,'Pooja','Desai',50,'Female','India','Maharashtra','Pune','2016-10-01','2021-10-01','Party A','MBA',23,'Healthcare modernization','pooja58@gmail.com',987650058)," +
                    "(59,'Ajay','Mehta',56,'Male','India','Rajasthan','Jaipur','2010-11-01','2015-11-01','Party B','PhD Economics',25,'Agriculture reforms','ajay59@gmail.com',987650059)," +
                    "(60,'Neha','Kumar',48,'Female','India','Karnataka','Bengaluru','2013-12-01','2018-12-01','Party C','MA Sociology',20,'Social welfare','neha60@gmail.com',987650060)," +
                    "(61,'Ravi','Sharma',62,'Male','India','Himachal Pradesh','Shimla','2009-01-01','2014-01-01','Party A','LLB',32,'Judicial improvements','ravi61@gmail.com',987650061)," +
                    "(62,'Sneha','Patel',50,'Female','India','Gujarat','Surat','2015-02-01','2020-02-01','Party B','MBA',22,'Trade reforms','sneha62@gmail.com',987650062)," +
                    "(63,'Manoj','Rao',54,'Male','India','Karnataka','Mangaluru','2012-03-01','2017-03-01','Party C','BA History',24,'Heritage preservation','manoj63@gmail.com',987650063)," +
                    "(64,'Shreya','Nair',49,'Female','India','Kerala','Thiruvananthapuram','2013-04-01','2018-04-01','Party A','MA Economics',19,'Healthcare development','shreya64@gmail.com',987650064)," +
                    "(65,'Suresh','Patil',57,'Male','India','Maharashtra','Nagpur','2015-05-01','2020-05-01','Party B','MBA',27,'Industrial growth','suresh65@gmail.com',987650065)," +
                    "(66,'Isha','Sharma',52,'Female','India','Delhi','New Delhi','2010-06-01','2015-06-01','Party C','LLB',21,'Judicial reforms','isha66@gmail.com',987650066)," +
                    "(67,'Kunal','Gowda',60,'Male','India','Karnataka','Bengaluru','2011-07-01','2016-07-01','Party A','BSc Political Science',30,'Economic development','kunal67@gmail.com',987650067)," +
                    "(68,'Anita','Singh',51,'Female','India','Uttar Pradesh','Varanasi','2014-08-01','2019-08-01','Party B','PhD Economics',22,'Education improvements','anita@gmail.com',7075986321)," +
                    "(69,'Raghav','Reddy',58,'Male','India','Telangana','Warangal','2012-09-01','2017-09-01','Party C','MBA',28,'Industrial reforms','raghav69@gmail.com',987650069)," +
                    "(70,'Pallavi','Desai',50,'Female','India','Maharashtra','Nagpur','2016-10-01','2021-10-01','Party A','MA Economics',23,'Healthcare','pallavi70@gmail.com',987650070)," +
                    "(71,'Amit','Mehta',55,'Male','India','Rajasthan','Udaipur','2010-11-01','2015-11-01','Party B','LLB',25,'Judicial reforms','amit71@gmail.com',987650071)," +
                    "(72,'Priya','Kumar',48,'Female','India','Karnataka','Mysuru','2013-12-01','2018-12-01','Party C','MBA',19,'Social welfare','priya72@gmail.com',987650072)," +
                    "(73,'Sanjay','Sharma',61,'Male','India','Himachal Pradesh','Dharamshala','2009-01-01','2014-01-01','Party A','MA Political Science',32,'Infrastructure boost','sanjay73@gmail.com',987650073)," +
                    "(74,'Neetu','Patel',50,'Female','India','Gujarat','Vadodara','2015-02-01','2020-02-01','Party B','MBA',22,'Trade reforms','neetu74@gmail.com',987650074)," +
                    "(75,'Vikram','Rao',56,'Male','India','Karnataka','Bengaluru','2012-03-01','2017-03-01','Party C','BA History',27,'Heritage preservation','vikram75@gmail.com',987650075);";

            Statement statement = connection.createStatement();
            int rowAffected=statement.executeUpdate(sql);
            System.out.println("rowAffected:"+rowAffected);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}