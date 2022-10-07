package school;

import java.util.List;
//created by Simranjeet kaur(2102116) and Ravdeep Kaur(2024192)
public class TeacherInfo extends School{

	// No arg constructor
	public TeacherInfo() {
		super(); // call to super to access no argument constructor 
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void addTeacher(Teachers teacher) {
		// TODO Auto-generated method stub
		super.addTeacher(teacher); // call to super to access a variable or a method from super class
	}
	
	@Override
	public List<Teachers> getTeachers() {
		// TODO Auto-generated method stub
		return super.getTeachers(); // call to super to access a variable or a method from super class
	}
	
	@Override
	public void setAllTeachers(List<Teachers> teachers) {
		// TODO Auto-generated method stub
		super.setAllTeachers(teachers);
	}


	@Override
	public void displayInfo() {
		// TODO Auto-generated method stub
		System.out.println("\n--------- TEACHER LIST ----------\n");
	}
	
	//OVERLOADING - two methods with different method signatures (different parameters and different return types)
		public String info_to_user(String text1) {
			return text1;
		}
		
		public int info_to_user(int val1) {
			return val1;
		}
	
}
