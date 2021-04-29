package homework;

import Business.InstructorManager;
import Business.StudentManager;
import homework.logger.DatabaseLogger;
import homework.logger.FileLogger;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student student1=new Student();
		 student1.setId(1);
		 student1.setFirstName("Hatice");
		 student1.setLastName("Ozturk");
		 student1.setCourseCount("Elazıg");
		 
		Instructor instructor=new Instructor();
		instructor.setId(1);
		instructor.setFirstName("m");
		instructor.setLastName("oz");
		
		StudentManager studentManager=new StudentManager(new FileLogger());
	    InstructorManager instructorManager=new InstructorManager(new DatabaseLogger());
	
	    
	   studentManager.add(student1);
	   instructorManager.delete(instructor);
	
	
	}

}
