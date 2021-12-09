package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
		} catch (ClassNotFoundException e) {
			System.out.println("ClassNotFoundException in DBManager.getConnection()");
		} catch (SQLException e) {
			System.out.println("SQLException in DBManager.getConnection()");
		}
		
		return conn;
	}
	
	public void closeConnection(Connection conn) {
		try {
			if (conn != null) {
				conn.close();
			}
			else {
				System.out.println("No connection to close");
			}
		} catch (SQLException e) {
			System.out.println("SQLException in DBManager.closeConnection()");
		}
	}
	
	public boolean canLogin(Connection conn, String email, String password, String errorMessage) {
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
			errorMessage = "Login credentials wrong";
		}
		catch (NullPointerException e){
			System.out.println("NullPointerException in DBManager.canLogin()");
			errorMessage = "Connection to database was not successful";
		}
		return false;
	}
	
	public boolean canRegister(Connection conn, String email, String firstname, String lastname, String password) {
		try {
			String sql = "INSERT INTO users VALUES (?, ?, ?, ?);";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, email);
			ps.setString(2, firstname);
			ps.setString(3, lastname);
			ps.setString(4, password);
			ps.executeUpdate();
			return true;
		}
		catch (SQLException e) {
			System.out.println("SQLException in DBManager.canRegister()");
			
		}
		return false;
	}
	
	public List<User> fetchUsers(Connection conn) {
		List<User> users = new ArrayList<User>();
		String sql = "SELECT email, firstname, lastname, password FROM users";
		ResultSet rs = null;
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				String email = rs.getString(1);
				String firstname = rs.getString(2);
				String lastname = rs.getString(3);
				String password = rs.getString(4);
				users.add(new User(email, firstname, lastname, password));
			}
			rs.close();
			rs = null;
		}
		catch (SQLException e) {
			System.out.println("SQLException in DBManager.fetchUsers()");
		}
		catch (NullPointerException e){
			System.out.println("NullPointerException in DBManager.canRegister()");
		}
		return users;
	}

}
