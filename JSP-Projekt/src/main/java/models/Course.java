package models;

import java.util.Objects;

public class Course {
	private int coursesId;
	private String title;
	private String videosCount;
	private String videosAvgLen;
	private double price;
	private String imageString;
	
	public int getCoursesId() {
		return coursesId;
	}

	public void setCoursesId(int coursesId) {
		this.coursesId = coursesId;
	}

	public String getImageString() {
		return imageString;
	}

	public void setImageString(String imageString) {
		this.imageString = imageString;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getVideosCount() {
		return videosCount;
	}

	public void setVideosCount(String videosCount) {
		this.videosCount = videosCount;
	}

	public String getVideosAvgLen() {
		return videosAvgLen;
	}

	public void setVideosAvgLen(String videosAvgLen) {
		this.videosAvgLen = videosAvgLen;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

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
