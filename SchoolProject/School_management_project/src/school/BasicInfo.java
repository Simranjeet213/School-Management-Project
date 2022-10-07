package school;
//created by Simranjeet kaur(2102116) and Ravdeep Kaur(2024192)

// Basic class to display school title and address . Its called in driver class
public class BasicInfo extends School {

	// No arg constructor
		public BasicInfo() {
		super(); //use of super to access no argument constructor
		}
		
		//set School Title
		@Override
		public void setTitle(String title) {
			// TODO Auto-generated method stub
			super.setTitle(title); // call to super to access a variable or a method from super class
		}
		
		@Override
		public void setAddress(String address) {
			// TODO Auto-generated method stub
			super.setAddress(address); // call to super to access a variable or a method from super class
		}

		
		// abstract method from abstract School class
		@Override
		public void displayInfo() {
		// TODO Auto-generated method stub
			String information = "School - " + getTitle() +"\n"+ "Address - "+getAddress();
			System.out.println(information);
		}
		
		//OVERLOADING - two methods with different method signatures (different parameters and different return types)
		public String info_to_user(String text1) {
			return text1;
		}
		
		public int info_to_user(int val1) {
			return val1;
		}

}
