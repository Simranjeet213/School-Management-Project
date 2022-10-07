package school;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//created on 5 dec 2021.
//created by Simranjeet kaur(2102116) and Ravdeep Kaur(2024192)
//This class is main driver class to run the project with all its implementations.
public class Driver_Class {
	
//	use of static variables
	 static List<Classes_Student_Info> all_classesStudent_Infos = new ArrayList<>(); //List to maintain record of classes
	 static boolean flag=false;
	 static int selected_value=0;
	 static Scanner scanner = null;
	 static TeacherInfo teacherInfo;
	 static Courses courses;
	 static List<Courses> addCourses = new ArrayList<>(); //List to maintain record of courses
	 static Classes_Student_Info classes_Student_Info; 
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           
		// add teachers on by default initialization of project
		   Teachers Nick=new Teachers("Nick","English","15000");
           Teachers Mellisa=new Teachers("Mellisa","Maths","14500");
           Teachers Alex=new Teachers("Alex","Science","14900");
           
           List<Teachers>teachersList=new ArrayList<>();
           teachersList.add(Nick);
           teachersList.add(Mellisa);
           teachersList.add(Alex);
         
           teacherInfo = new TeacherInfo();  // initialize a class
           teacherInfo.setAllTeachers(teachersList); // set all teachers at once in a list
           
           classes_Student_Info = new Classes_Student_Info();
           
           courses = new Courses();
            // use of overloading method with three parameters in Courses class and added dynamic data on inital of program
            Courses course_second_method = new Courses();
   			course_second_method.addNewCourse("English Language", "3 months", "7000");
   			addCourses.add(course_second_method);	
   			
   			// use of return type method with String parameter
   			String welcomeString = classes_Student_Info.info_to_user("Welcome");
   			System.out.println("\n\t\t------------- " + welcomeString + " to School Management Project" + " -------------\n");
   			 
   			System.out.println("*****************************");   			
   			//           -- inheritance concept--
           BasicInfo basicInfo = new BasicInfo();
           basicInfo.setTitle("Cambridge convent school");
           basicInfo.setAddress("Chandigarh");
           basicInfo.displayInfo();
           
           System.out.println("*****************************");
           
//           ------ Display list of options to choose from ----
           
           diplay_options();       
           user_selected_options();
           
	}
	
	
	private static void diplay_options() {
		 
//      ------ Display list of options to choose from ----
      
      // class
      System.out.println("\nTo add a new class, press 1");
      System.out.println("To check total number of classes, press 11");
      System.out.println("To check total number of classes in detail with total number of students, press 111");
      
      //teacher
      System.out.print("\n");
      System.out.println("To add a new teacher, press 2");
      System.out.println("To check total number of teachers, press 22");
      System.out.println("To check total number of teachers in detail, press 222");
               
      // course
      System.out.print("\n");
      System.out.println("To add a new course, press 3");
      System.out.println("To check courses in detail, press 33");
      
      //fees
      System.out.print("\n");
      System.out.println("To check how many students paid their fees, press 4");
      System.out.println("To check how many students still not pay their fees, press 5");

	}
	
	
	// call to a method for user selection options
	
	private static void user_selected_options() {
		do
        {
          try
          {
         scanner = new Scanner(System.in);
         System.out.println("\nPlease enter any number :  ");
            selected_value =scanner.nextInt(); // save entered value by a user in this variable
          }
          catch(Exception e)
          {
            // accept integer only and ask user again and again until integer value entered
            System.out.println("ALERT - Please enter only integer value..");
            flag=true;
          }
        }
        while(flag);   
        
        if (selected_value == 1) {  // check entered value by a user
        	// use of return type method with int parameter
        	int val = classes_Student_Info.info_to_user(1);
        	System.out.println("----- "+"you have selected "+val + " -----\n");
     	   boolean add_class = true;
     	   while (add_class) {
     		System.out.println("Enter Class Title : ");
    			String classTitle = scanner.next();
    			System.out.println("Enter Class Section : ");
    			String section = scanner.next();
    			addNewClassRecord(classTitle, section);
    			System.out.print("\n");
    			System.out.println("To continue adding a new class, press 1");
    			System.out.println("else, press 0");
    			int ch_val = scanner.nextInt();
    			if (ch_val == 0) {
					add_class = false;
				}
    			
     	  }
     	
     	   // call method again to display list of prompt user options
     	 
     	   System.out.println("To check total number of classes in detail with number of students, press 11");
     	  int check_val = scanner.nextInt();
     	  if(check_val == 11) {
//         call method for classes info 
             displayClasses_Record();
     	  }
		   }
        
        else if (selected_value == 11) {
     	   List<Classes_Student_Info> check_class_record = all_classesStudent_Infos; 
            if (check_class_record.size() > 0) {
         	   System.out.println("Total number of classes in a school : " + check_class_record.size());
            }else {
         	   System.out.println("\nThere is no any class found yet. Please add a new class first.");
    			   System.out.println("\nTo go back to main menu, please rerun the application once more.");
            }
        }
        else if (selected_value == 111) {
     	   
     	   
//          call method for classes info 
            displayClasses_Record();
        }
        else if (selected_value == 2) {
        	// use of return type method with int parameter
        	int val = classes_Student_Info.info_to_user(2);
        	System.out.println("----- "+"you have selected "+val + " -----\n");
        	
     	   boolean add_tch = true;
     	   while (add_tch) {
     		System.out.println("Enter teacher name : ");
    			String teacher_name = scanner.next();
    			System.out.println("Enter Subject : ");
    			String subject = scanner.next();
    			System.out.println("Enter salary : ");
    			String salary = scanner.next();
    			addNewTeacherRecord(teacher_name, subject, salary);
    
    			System.out.print("\n");
    			System.out.println("To continue adding a new teacher, press 2");
    			System.out.println("else to check its record, press 0");
    			int ch_val = scanner.nextInt();
    			if (ch_val == 0) {
    				add_tch = false;
				}
    			
     	  }
     	
     	   // call method again to display list of prompt user options
     	 
     	   System.out.println("To check total number of teachers, press 22");
     	   System.out.println("To check total number of teachers in detail, press 222");
     	  int check_val = scanner.nextInt();
     	  if(check_val == 22) {
     		  List<Teachers> check_tchr_record = teacherInfo.getTeachers(); 
               if (check_tchr_record.size() > 0) {
            	   System.out.println("Total number of teachers in a school : " + check_tchr_record.size());
            	   
            	   System.out.println("\n ==== To go back to the main menu, press 6");
            	   System.out.println("\n ==== To exit, press 7");
            	   int entered_val = scanner.nextInt();
            	   if (entered_val == 6) {
            		   diplay_options();       
                       user_selected_options();
            	   }
            	  
            	   else if (entered_val == 7) {
            		   System.out.println("\n--- Thank you for using School Management project ---");
            		   System.exit(0);
            	   }
            	   else {
            		   System.out.println("You have selected wrong option, please rerun the project");
            	   }
            	   
               }else {
            	   System.out.println("\nThere is no any teacher found yet. Please add a new teacher first.");
       			   System.out.println("\nTo go back to main menu, please rerun the application once more.");
               }
     	  }
     	  else if (check_val == 222) {
     		  displayTeachers_Record();
     	  }
     	   
        }
        else if (selected_value == 22) {
     	   List<Teachers> check_tchr_record = teacherInfo.getTeachers(); 
            if (check_tchr_record.size() > 0) {
         	   System.out.println("Total number of teachers in a school : " + check_tchr_record.size());
         	   
           System.out.println("\n ==== To go back to the main menu, press 6");
       	   System.out.println("\n ==== To exit, press 7");
       	   int entered_val = scanner.nextInt();
       	   if (entered_val == 6) {
       		   diplay_options();       
                  user_selected_options();
       	   }
       	  
       	   else if (entered_val == 7) {
       		   System.out.println("\n--- Thank you for using School Management project ---");
       		   System.exit(0);
       	   }
       	   else {
       		   System.out.println("You have selected wrong option, please rerun the project");
       	   }
         	   
            }else {
         	   System.out.println("\nThere is no any teacher found yet. Please add a new teacher first.");
    			   System.out.println("\nTo go back to main menu, please rerun the application once more.");
            }
        }
        else if (selected_value == 222) {
//          call method for teachers info 
            displayTeachers_Record();
        }
        else if (selected_value == 3) {
        	// use of return type method with int parameter
        	int val = classes_Student_Info.info_to_user(3);
        	System.out.println("----- "+"you have selected "+val + " -----\n");
        	
     	   boolean add_csr = true;
     	   while (add_csr) {
     		System.out.println("Enter course title : ");
    			String courseTitle = scanner.next();
    			System.out.println("Enter duration of month: ");
    			String duration = scanner.next();
    			System.out.println("Enter fees : ");
    			String fees = scanner.next();
    			addNewCourseRecord(courseTitle, duration, fees);
    
    			System.out.print("\n");
    			System.out.println("To continue adding a new course, press 3");
    			System.out.println("else to check its record, press 0");
    			int ch_val = scanner.nextInt();
    			if (ch_val == 0) {
    				add_csr = false;
				}
    			
     	  }
     	
     	   // call method again to display list of prompt user options
     	 
     	   System.out.println("To check total number of courses in detail, press 33");
     	  int check_val = scanner.nextInt();
     	  if(check_val == 33) {
     		  displayCourses_Record();
     	  }
        }
        else if (selected_value == 33) {
			displayCourses_Record();
        }
        else if (selected_value == 4) {
        	// use of return type method with int parameter
        	int val = classes_Student_Info.info_to_user(4);
        	System.out.println("----- "+"you have selected "+val + " -----");
        	
     	   Classes_Student_Info cls_fees_by_student = new Classes_Student_Info();
     	   int fees_paid = cls_fees_by_student.fees_paid_by_no_of_students();
     	   System.out.println("\n"+fees_paid + " students already paid their fees on time.");
     	   
     	  System.out.println("\n ==== To go back to the main menu, press 6");
     	 System.out.println("\n ==== To exit, press 7");
   	   int entered_val = scanner.nextInt();
   	   if (entered_val == 6) {
   		   diplay_options();       
              user_selected_options();
   	   }
   
	   else if (entered_val == 7) {
		   System.out.println("\n--- Thank you for using School Management project ---");
		   System.exit(0);
	   }
   	   else {
   		   System.out.println("You have selected wrong option, please rerun the project");
   	   }
        }
        else if (selected_value == 5) {
        	
        	// use of return type method with int parameter
        	int val = classes_Student_Info.info_to_user(5);
        	System.out.println("----- "+"you have selected "+val + " -----");
        	
     	   Classes_Student_Info cls_fees_by_student = new Classes_Student_Info();
     	   int fees_not_paid = cls_fees_by_student.fees_not_paid_by_no_of_students();
     	   System.out.println("\n"+fees_not_paid + " are still remaining to pay their fees.");
     	   
     	  System.out.println("\n ==== To go back to the main menu, press 6");
     		System.out.println("\n ==== To exit, press 7");
   	   int entered_val = scanner.nextInt();
   	   if (entered_val == 6) {
   		   diplay_options();       
              user_selected_options();
   	   }
   	
	   else if (entered_val == 7) {
		   System.out.println("\n--- Thank you for using School Management project ---");
		   System.exit(0);
	   }
   	   else {
   		   System.out.println("You have selected wrong option, please rerun the project");
   	   }
      }
      
        else {
        	 System.out.println("You have selected wrong option, please rerun the project");
        }
       
	}
	
	
//	----------------method to add new class record ----------------
	private static void addNewClassRecord(String classTitle, String section) {
			
	        
			classes_Student_Info = new Classes_Student_Info();
			classes_Student_Info.setClassTitle(classTitle);
	        classes_Student_Info.setSection(section);
	        
//	        -------- Add list of students in a class---
	        Student Jas=new Student(1,"Jas",4);
	        Student Sam=new Student(2,"Sam",12);
	        Student Rabby=new Student(3,"Rabby",3);
	        
	        List<Student>studentList=new ArrayList<>();
	        studentList.add(Jas);
	        studentList.add(Sam);
	        studentList.add(Rabby);

	        classes_Student_Info.addStudents(studentList);
	        all_classesStudent_Infos.add(classes_Student_Info);
	        classes_Student_Info.addNewClassInfo(all_classesStudent_Infos);
	}
	
	
//	----------------method to display added class record ----------------
	private static void displayClasses_Record() {       
          
		classes_Student_Info.displayInfo(); // use of method from super class
	
        List<Classes_Student_Info> check_class_record = all_classesStudent_Infos; 
        if (check_class_record.size() > 0) {
        	  for(int i = 0; i < check_class_record.size(); i++) {
              	String class_Title = check_class_record.get(i).getClassTitle();
              	String class_Section = check_class_record.get(i).getSection();
              	int students_list = check_class_record.get(i).getNumberofStudents().size(); 
              	
              	 System.out.println("\nClass Info : " + class_Title + "\tSection - " + class_Section + "\n"
                		   	+"Total number of students in a class - "+ students_list +"\n");             
              }
        	  
        	  
        	  System.out.println("\n ==== To go back to the main menu, press 6");
        	  System.out.println("\n ==== To exit, press 7");
       	   int entered_val = scanner.nextInt();
       	   if (entered_val == 6) {
       		   diplay_options();       
                  user_selected_options();
       	   }
      
 	   else if (entered_val == 7) {
 		   System.out.println("\n--- Thank you for using School Management project ---");
 		   System.exit(0);
 	   }
       	   else {
       		   System.out.println("You have selected wrong option, please rerun the project");
       	   }
		}else {
			System.out.println("\nThere is no any class found yet. Please add a new class first.");
			System.out.println("\nTo go back to main menu, please rerun the application once more.");
	
		}
      
        
	}
	
	
//	----------------method to add new teacher record ----------------
	private static void addNewTeacherRecord(String name, String subject, String salary) {
		Teachers new_teacher=new Teachers(name, subject, salary);	
        teacherInfo.addTeacher(new_teacher);
        System.out.println("------ New teacher added successfully ------");
	}
	
	
//	----------------method to display teacher class record ----------------
	private static void displayTeachers_Record() {
		
		teacherInfo.displayInfo();
        List<Teachers> check_tch_record = teacherInfo.getTeachers(); 
        if (check_tch_record.size() > 0) {
        	  for(int i = 0; i < check_tch_record.size(); i++) {
              	String teachername = check_tch_record.get(i).getName();
              	String subject = check_tch_record.get(i).getSubject();
              	String salary = check_tch_record.get(i).getSalary(); 
              	
              	 System.out.println("\nTeacher : " + teachername + "\nSubject - " + subject + "\n"
                		   	+"Monthly Salary - "+ salary +"\n");             
              }
        	  
        	  System.out.println("\n ==== To go back to the main menu, press 6");
        		System.out.println("\n ==== To exit, press 7");
       	   int entered_val = scanner.nextInt();
       	   if (entered_val == 6) {
       		   diplay_options();       
                  user_selected_options();
       	   }
       	
    	   else if (entered_val == 7) {
    		   System.out.println("\n--- Thank you for using School Management project ---");
    		   System.exit(0);
    	   }
       	   else {
       		   System.out.println("You have selected wrong option, please rerun the project");
       	   }
		}else {
			System.out.println("\nThere is no any teacher found yet. Please add a new teacher first.");
			System.out.println("\nTo go back to main menu, please rerun the application once more.");
		}
	}

	
//	----------------method to add new course record ----------------
	private static void addNewCourseRecord(String courseTitle, String duration, String fees) {	
		courses = new Courses();
		courses.courseTitle = courseTitle;
		courses.duration = duration;
		courses.fees = fees;
		addCourses.add(courses);

//		use of overloading method with one parameter in Courses class and add data entered by the user
		 courses.addNewCourse(addCourses);
		
	}
	
	
//	----------------method to display courses class record ----------------
	private static void displayCourses_Record() {
		
		System.out.println("\n--------- COURSE LIST ----------\n");
        List<Courses> check_crs_record = courses.getAllCourses(); 
        if (check_crs_record.size() > 0) {
        	  for(int i = 0; i < check_crs_record.size(); i++) {
              	String crs_title = check_crs_record.get(i).getCourseTitle();
              	String duration = check_crs_record.get(i).getDuration();
              	String fees = check_crs_record.get(i).getFees(); 
              	
              	 System.out.println("\nCourse : " + crs_title + "\nDuration - " + duration + "\n"
                		   	+"Overall Fees - "+ fees +"\n");             
              }
        	  
        	  System.out.println("\n ==== To go back to the main menu, press 6");
        	  System.out.println("\n ==== To exit, press 7");
       	   int entered_val = scanner.nextInt();
       	   if (entered_val == 6) {
       		   diplay_options();       
                  user_selected_options();
       	   }
       	   else if (entered_val == 7) {
       		   System.out.println("\n--- Thank you for using School Management project ---");
       		   System.exit(0);
       	   }
       	   else {
       		   System.out.println("You have selected wrong option, please rerun the project");
       	   }
		}else {
			System.out.println("\nThere is no any course found yet. Please add a new course first.");
			System.out.println("\nTo go back to main menu, please rerun the application once more.");
		}
	}
}
