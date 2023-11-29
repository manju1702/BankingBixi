package TestYanraPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class NoSelectQueryTest06 
{
	public static void main(String[] args) throws SQLException 
	{
		Connection con=null;
		int result= 0;
		
		// register the driver
		Driver driver =new Driver();
		DriverManager.registerDriver(driver);
		
		//get  connection to database
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sdet52\", \"root\", \"root\"");
	
	//create statement
	Statement state = con.createStatement();
	String query ="insert into student_info values('manju',9785678908,'chhattishgarh','56')";
	
	//update query
	result=state.executeUpdate(query);
	if(result==1)
	{
		System.out.println("data inserted successfully");
	}
	else
	{
	System.out.println("data not inserted");
		
	}
	//close the database
	con.close();
	}
}
