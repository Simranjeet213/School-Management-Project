package school;
//created by Simranjeet kaur(2102116) and Ravdeep Kaur(2024192)
//This class is responsible for keeping the track of teachers name,subject,salary.
public class Teachers {

	protected String subject;
	protected String name;
	protected String salary;
	
	//parameterized constructor
	public Teachers(String name,String subject, String salary) {
		
		this.subject=subject;
		this.name=name;
		this.salary=salary;		
	}
	
	// use of getters and setters
	public String getSubject() {
		return subject;
	}
	
	public String getName() {
		return name;
	}
	
	public String getSalary() {
		return salary;
	}
	
	//set the salary
	public void setSalary(String salary) {
		this.salary=salary;
	}
	
	//removes from total money earned by school.
//	public void receiveSalary(int salary) {
//		salaryEarned+=salary;
//		School.updateTotalMoneySpent(salary);
//	}
	
	
}
