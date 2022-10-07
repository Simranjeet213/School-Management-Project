package school;
//created by Simranjeet kaur(2102116) and Ravdeep Kaur(2024192)
public class Student {
	
	public int id;
	public String name;
	public int roll_no;

	// parameterized constructor
	public Student(int id,String name,int roll_no)
	{
		// use of this keyword
		this.id=id;
		this.name=name;
		this.roll_no=roll_no;		
	}
	
	// use of getters and setters
	// use of method with  return type int
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

//	use of method with return type string
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public int getRoll_no() {
		return roll_no;
	}


	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	

}
