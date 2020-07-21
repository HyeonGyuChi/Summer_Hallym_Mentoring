package chap6.staticex;
//staticȰ��: �й� �ڵ����� �ο��ϱ� + static get,set


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
		//studentName = "aaa";   //���� �� ? static �޼ҵ� => �ν��Ͻ� ���� ����
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		Student2.serialNum = serialNum;
	}
}
