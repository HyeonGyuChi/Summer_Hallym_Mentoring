package chap6.staticex;

public class StudentCardTest {

	public static void main(String[] args) {

		StudentCard studentLee = new StudentCard();
		studentLee.setStudentName("������");
		System.out.println(
				studentLee.getStudentName() + " �й�:" + studentLee.studentID + " ī���ȣ: " + studentLee.getCardNum());

		StudentCard studentSon = new StudentCard();
		studentSon.setStudentName("�ռ���");
		System.out.println(studentSon.studentName + " �й�:" + studentSon.studentID + " ī���ȣ: " + studentLee.getCardNum());
		
		StudentCard studentChi = new StudentCard();
		studentChi.setStudentName("������");
		System.out.println(studentChi.studentName + " �й�:" + studentChi.studentID + " ī���ȣ: " + studentChi.getCardNum());
	}
}
