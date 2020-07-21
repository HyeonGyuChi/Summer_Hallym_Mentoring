package chap6.staticex;

public class StudentCardTest {

	public static void main(String[] args) {

		StudentCard studentLee = new StudentCard();
		studentLee.setStudentName("이지원");
		System.out.println(
				studentLee.getStudentName() + " 학번:" + studentLee.studentID + " 카드번호: " + studentLee.getCardNum());

		StudentCard studentSon = new StudentCard();
		studentSon.setStudentName("손수경");
		System.out.println(studentSon.studentName + " 학번:" + studentSon.studentID + " 카드번호: " + studentLee.getCardNum());
		
		StudentCard studentChi = new StudentCard();
		studentChi.setStudentName("지현규");
		System.out.println(studentChi.studentName + " 학번:" + studentChi.studentID + " 카드번호: " + studentChi.getCardNum());
	}
}
