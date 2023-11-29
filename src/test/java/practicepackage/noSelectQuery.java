package practicepackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class noSelectQuery {
	public static void main(String[] args) throws SQLException {
		Connection con = null;
		int result = 0;

		try {
			// Register the driver
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);

			// get connection of database
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sdet52", "root", "root");

			// create statement
			Statement state = con.createStatement();
			String query = "insert into student_info values('nyez','9163044287','kolkata',80);";
			// execute query
			result = state.executeUpdate(query);
			if (result == 1) {																																																																																			
				System.out.println("data inserted successfully");
			} else {
				System.out.println("data is not updated");
			}
		} catch (Exception e) {

		} finally {
			con.close();
		}
	}
}
