package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		
		String dbURL = "jdbc:mysql://localhost:3306/105";
		String dbUser = "root";
		String dbPassword = "";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection(dbURL, dbUser, dbPassword);
		System.err.println("Connected successfully.");
		return connection;

	}
}
