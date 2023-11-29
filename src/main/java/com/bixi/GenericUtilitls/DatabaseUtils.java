package com.bixi.GenericUtilitls;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

/**
 * 1.METHOD1---CONNECT TO DATABASE 2.METHOD2--EXECUTE AND GET DATA/WRITE DATA
 * INTO DATABASE 3.METHOD3--DISCONNECT TO DATABASE
 * 
 * @author manju sahu
 *
 */
public class DatabaseUtils {
	Connection con = null;

	public void connectDB() throws Throwable {
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		con = DriverManager.getConnection(IpathConstants.DB_URL, IpathConstants.DB_UN, IpathConstants.DB_PWD);

	}

	public String executeAndGetData(int coldata, String expdata, String query) throws Throwable 
	{
		Statement state = con.createStatement();
		ResultSet result = state.executeQuery(query);
		boolean flag = false;
		while (result.next()) {
			String actual = result.getString(coldata);

			if (actual.equalsIgnoreCase(expdata)) {
				flag = true;
				break;
			}
}
		if (flag) {
			System.out.println("project created successfully");
		} else {
			System.out.println("project is not created");
		}

		return "";
	}

	public void disconnectDB() throws Throwable {
		con.close();
	}

}
