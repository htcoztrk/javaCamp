package homework;

public class Student extends User{

	private String address;
	private String image;
	private String studentNumber;
	private String courseCount;
	public Student() {
		
	}
	public Student(String address, String image, String studentNumber, String courseCount) {
		super();
		this.address = address;
		this.image = image;
		this.studentNumber = studentNumber;
		this.courseCount = courseCount;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	public String getCourseCount() {
		return courseCount;
	}
	public void setCourseCount(String courseCount) {
		this.courseCount = courseCount;
	}
	
}
