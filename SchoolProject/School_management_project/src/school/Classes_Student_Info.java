package school;

import java.util.List;
//created by Simranjeet kaur(2102116) and Ravdeep Kaur(2024192)

// use of multiple inheritance (One parent class, one interface, one child class) 
// parent class is School class
// child class is Classes_Student_Info class
// interface class is FeesInfo class

public class Classes_Student_Info extends School implements FeesInfo{

	public String class_title;
	public String section;

	public List<Student> list_students;
	public List<Classes_Student_Info> classes_Student_Infos;
	
	// use of static final variables
	static final int STUDENTS_FEES_PAID = 12;
	static final int STUDENTS_FEES_NOT_PAID = 8;

	// No arg constructor
	public Classes_Student_Info() {
		super(); // call to super to access no argument constructor
	}
	
	public String getClassTitle() {
		return class_title;
	}


	public void setClassTitle(String title) {
		// use of this keyword
		this.class_title = title;
	}


	public String getSection() {
		return section;
	}


	public void setSection(String section) {
		// use of this keyword
		this.section = section;
	}
	
	public List<Student> getNumberofStudents() {
		return list_students;
	}

	//adds student to the school
	public void addStudents(List<Student> list_students) {
//		students.add(student);
		this.list_students = list_students;
	}

	
	public List<Classes_Student_Info> getNumberofClasses_In_detail() {
		return classes_Student_Infos;
	}

	//add new class to the school
	public void addNewClassInfo(List<Classes_Student_Info> classes) {
		this.classes_Student_Infos = classes;
	}


	// use of method overriding (Polymorphism)
	@Override
	public void displayInfo() {
		// TODO Auto-generated method stub
		System.out.println("\n--------- CLASSES LIST ----------\n");
	}
	
	//-------- Use of interface methods from FeesInfo class------
	@Override
	public int fees_paid_by_no_of_students() {
		// TODO Auto-generated method stub
		return STUDENTS_FEES_PAID;
	}

	@Override
	public int fees_not_paid_by_no_of_students() {
		// TODO Auto-generated method stub
		return STUDENTS_FEES_NOT_PAID;
	}
	
	//OVERLOADING - two methods with different method signatures (different parameters and different return types)
	public String info_to_user(String text1) {
		return text1;
	}
	
	public int info_to_user(int val1) {
		return val1;
	}
}
