package TestYanraPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class SqlQueryTest05 {
	public static void main(String[] args) throws SQLException {
		// register the driver
		Driver jdbcdriver = new Driver();
		DriverManager.registerDriver(jdbcdriver);

		// get connection to database
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sdet52\", \"root\", \"root\"");

		// create statement
		Statement state = con.createStatement();
		String query = "select * from student_info;";

		// execute query
		ResultSet result = state.executeQuery(query);
		
		//close the database
		con.close();

	}

}
