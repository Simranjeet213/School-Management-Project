package school;

import java.util.ArrayList;
import java.util.List;
//created by Simranjeet kaur(2102116) and Ravdeep Kaur(2024192)
public class Courses {
	
	
	String courseTitle;
	String duration;
	String fees;
	List<Courses> allCourses = new ArrayList<>(); 
	
	//----- use of overloading (Polymorphism) method with different parameters -----
	public void addNewCourse(List<Courses> courses) {
		this.allCourses = courses;
	}
	
	public void addNewCourse(String title,String duration,String fees) {		
		setCourseTitle(title);
		setDuration(duration);
		setFees(fees);
	}
	
	public List<Courses> getAllCourses() {
		return allCourses;
	}
	
	public String getCourseTitle() {
		return courseTitle;
	}

	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getFees() {
		return fees;
	}

	public void setFees(String fees) {
		this.fees = fees;
	}

}
