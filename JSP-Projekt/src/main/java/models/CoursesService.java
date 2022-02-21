package models;

import java.sql.Connection;
import java.util.List;

public class CoursesService {
	private static CoursesService instance = null;
	private CoursesService() {}
	public static CoursesService getInstance() {
		if (instance == null) {
			instance = new CoursesService();
		}
		return instance;
	}
	public List<Course> fetchCourses() {
		DBManager db = DBManager.getInstance();
		Connection conn = null;
		conn = db.getConnection();
		
		List<Course> courses = db.fetchCourses(conn);
		
		db.closeConnection(conn);
		
		return courses;
	}
}
