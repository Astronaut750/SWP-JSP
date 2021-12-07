package models;

import java.sql.Connection;

public class RegisterService {
	private static RegisterService instance = null;
	private RegisterService() {}
	public static RegisterService getInstance() {
		if (instance == null) {
			instance = new RegisterService();
		}
		return instance;
	}
	public boolean canRegister(String email, String firstname, String lastname, String password) {
		
		if (email == "" || firstname == "" || lastname == "" || password == "") {
			return false;
		}
		
		DBManager db = DBManager.getInstance();
		Connection conn = null;
		
		conn = db.getConnection();
		boolean success = db.canRegister(conn, email, firstname, lastname, password);
		
		db.closeConnection(conn);
		return success;
	}
}
