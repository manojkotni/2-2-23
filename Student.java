package encapsulation;

public class Student {
	private  int StudentRollnumber;
	private String StudentName;
	private String address;
	private int phonenumber;
	private char grade;
	private  boolean status ;
	public int getStudentRollnumber() {
		return StudentRollnumber;
	}
	public void setStudentRollnumber(int studentRollnumber) {
		StudentRollnumber = studentRollnumber;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	

}
