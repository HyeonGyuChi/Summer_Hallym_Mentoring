package chap6.staticex;
//static활용: 학번 자동으로 부여하기 + static get,set


public class Student2 {
	
	private static int serialNum = 1000; // private
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public Student2(){
		serialNum++;
		studentID = serialNum;
	}
	
	public String getStudentName(){
		return studentName;
	}
	
	public void setStudentName(String name){
		studentName = name;
	}

	public static int getSerialNum() {
		//studentName = "aaa";   //오류 남 ? static 메소드 => 인스턴스 변수 접근
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		Student2.serialNum = serialNum;
	}
}
