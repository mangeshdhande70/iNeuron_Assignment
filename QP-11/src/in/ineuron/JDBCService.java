
/*
 * 
 * Write a Java program that connects to a MySQL database using JDBC. The program
	should read data from a table and display the results in the console
 */


package in.ineuron;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCService {
	

	public static void main(String[] args) {
		
		

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try{

            //Step1. Load and register the Driver
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            System.out.println("Driver loaded successfully....");

            //Step2. Establish the Connection with database
            String url = "jdbc:mysql://localhost:3306/ineuron";

            //username and password would vary from user to user
            String user = "root";
            String pass = "Md7$#1998";



            connection = DriverManager.getConnection(url,user,pass);
            System.out.println("Connection Established.....");
            System.out.println("The implementation class Name is ::  "+connection.getClass().getName());


            //Step3. Create statement Object and send the query

            String sqlQuery = "select id,name,lastName,mailId,mobNo,age,course from student";

            statement = connection.createStatement();
            System.out.println("The implementation class Name is :: "+statement.getClass().getName());

            resultSet =statement.executeQuery(sqlQuery);


            System.out.println("\n\n");
            System.out.println("Id\tName\t\tLastName\t  MailId\t\tMobNo");

            System.out.println("____________________________________________________________________________");
            while (resultSet.next())
            {

                Integer id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                String lastName = resultSet.getString(3);
                String mailId = resultSet.getString(4);
                Integer mobNo = resultSet.getInt(5);


                System.out.println(id+"\t"+name+"\t\t"+lastName+"\t\t"+mailId+"\t\t"+mobNo);


            }

        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

			
}
	