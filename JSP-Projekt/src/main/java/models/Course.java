package models;

import java.util.Objects;

public class Course {
	private int coursesId;
	private String imageString;
	private String title;
	private String videosCount;
	private String videosAvgLen;
	private double price;
	
	public Course(int coursesId, String imageString, 
			String title, String videosCount, String videosAvgLen,
			double price) {
		super();
		this.coursesId = coursesId;
		this.imageString = imageString;
		this.title = title;
		this.videosCount = videosCount;
		this.videosAvgLen = videosAvgLen;
		this.price = price;
	}
	
	public Course() { this(0, "","","","",0.0); }
}
