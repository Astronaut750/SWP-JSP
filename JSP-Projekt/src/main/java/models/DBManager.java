package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBManager {
	private static DBManager instance = null;
	private DBManager() {}
	
	public static DBManager getInstance() {
		if (instance == null) {
			instance = new DBManager();
		}
		return instance;
	}
	
	String url="jdbc:mysql://localhost:3306/swp_holzmann";
	
	public Connection getConnection() {
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, "root", "root");
			System.out.println("Connection to swp_holzmann successful");
		} catch (ClassNotFoundException e) {
			System.out.println("ClassNotFoundException in DBManager.getConnection()");
		} catch (SQLException e) {
			System.out.println("SQLException in DBManager.getConnection()");
		}
		
		return conn;
	}
	
	public void closeConnection(Connection conn) {
		try {
			conn.close();
		} catch (SQLException e) {
			System.out.println("SQLException in DBManager.closeConnection()");
		}
	}
	
	public boolean canLogin(Connection conn, String email, String password) {
		try {
			String sql = "SELECT email, password FROM users WHERE email=? AND password=?;";
			PreparedStatement ps;

			ps = conn.prepareStatement(sql);
			 
			ps.setString(1, email);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				return rs.getString("email").equals(email) && rs.getString("password").equals(password);
			}
		} catch (SQLException e) {
			System.out.println("SQLException in DBManager.canLogin()");
		}
		return false;
	}

}
