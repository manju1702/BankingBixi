package practicepackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;
import com.mysql.cj.xdevapi.Statement;

public class WriteDataIntoDatabaseTableEmpPrakash 
{
public static void main(String[] args) throws SQLException 
{
	//REGISTER THE DRIVER
	Driver driver = new Driver();
	DriverManager.registerDriver(driver);
	
	//CONNECT TO DATABASE
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sdet52, 'root', 'root'");
	
	//CREATE STATEMENT
	java.sql.Statement state= con.createStatement();
       String query= "select * from empprakash;";
       // execute query
      ResultSet result = state.executeQuery(query);
      Scanner sc = new Scanner(System.in);
      while(result.next())
      {
      if(!query.contains("prakash"))
      {
    	  query="insert into empprakash values('prakash',20)";
    	 int result1 = state.executeUpdate(query);
      }
      else
      {
    	  System.out.println("data already present");
      }
    	  
      }
}
}
