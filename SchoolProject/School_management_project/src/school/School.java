package school;
import java.util.List;
//created by Simranjeet kaur(2102116) and Ravdeep Kaur(2024192)

//use of hierarchical inheritance as the School class is the parent class and
// its child classes are BasicInfo, Classes_Student_Info and TeacherInfo
public abstract class School {
	
	public int Schoolid;
	public String title;
	public String address;
	public List<Teachers>teachers;

	// no arg constructor
	public School() {
	}
	
	
	//use of getters and setters
	public int getSchoolid() {
		return Schoolid;
	}



	public void setSchoolid(int schoolid) {
		Schoolid = schoolid;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	// use of return type method with string 
	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}


	// use of return type method with list 
	public List<Teachers> getTeachers() {
		return teachers;
	}

	public void addTeacher(Teachers teacher) {
		teachers.add(teacher);
	}
	
	public void setAllTeachers(List<Teachers> teachers) {
		this.teachers=teachers;
	}	

	public abstract void displayInfo();	
	
	//OVERLOADING - two methods with different method signatures (different parameters and different return types)
		public String info_to_user(String text1) {
			return text1;
		}
		
		public int info_to_user(int val1) {
			return val1;
		}

}
