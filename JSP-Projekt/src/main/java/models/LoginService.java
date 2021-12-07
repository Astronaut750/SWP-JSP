package models;

import java.sql.Connection;

public class LoginService {
	private static LoginService instance = null;
	private LoginService() {}
	public static LoginService getInstance() {
		if(instance == null) {
			instance = new LoginService();
		}
		return instance;
	}
	public boolean canLogin(String email, String password) {
		DBManager db = DBManager.getInstance();
		Connection conn = null;
		
		conn = db.getConnection();
		boolean success = db.canLogin(conn, email, password);
		
		db.closeConnection(conn);
		return success;
	}
}
