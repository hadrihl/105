package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import entity.User;

public class UserDaoImpl implements UserDao {

	@Override
	public int insert(User user) {
		int rowsAffected = 0;
		
		String sql = "insert into user(firstname,lastname,email,password,city) values (?,?,?,?,?)";
		Connection connection = null;
		
		try {
			connection = DBConnection.getConnection();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, user.getFirstname());
			ps.setString(2, user.getLastname());
			ps.setString(3, user.getEmail());
			ps.setString(4, user.getPassword());
			ps.setString(5, user.getCity());
			
			rowsAffected = ps.executeUpdate();
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return rowsAffected;
	}

}
