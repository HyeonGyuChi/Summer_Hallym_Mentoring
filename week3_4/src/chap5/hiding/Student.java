package chap5.hiding;

public class Student {
	
	int studentID;
	private String studentName;
	int grade;
	String address;
	
	public String getStudentName() { // getter
		return studentName;
	}

	public void setStudentName(String studentName) { // setter
		this.studentName = studentName;
	}

}
