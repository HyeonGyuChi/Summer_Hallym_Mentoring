package chap5.reference;

public class StudentTest {

	public static void main(String[] args) {
		Student4 studentLee = new Student4(1001, "Lee");
		
		studentLee.setKorean("����", 100);
		studentLee.setMath("����", 50);
		
		Student4 studentKim = new Student4(1002, "Kim");
		
		studentKim.setKorean("����", 70);
		studentKim.setMath("����", 85);
		
		studentLee.showStudentInfo();
		studentKim.showStudentInfo();
	}
}
