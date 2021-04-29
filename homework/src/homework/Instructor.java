package homework;

public class Instructor extends User {
   
	private String department;
	
	public Instructor(String department) {
		super();
		this.department = department;
	}

	public Instructor() {
		
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
}
