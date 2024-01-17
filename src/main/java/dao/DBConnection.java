package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		
		String dbURL = "jdbc:mysql://localhost:3306/105?useSSL=false&serverTimezone=UTC";
		String dbUser = "root";
		String dbPassword = "password";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection(dbURL, dbUser, dbPassword);
		System.out.println("Connected successfully.");
		return conn;
	}

}
