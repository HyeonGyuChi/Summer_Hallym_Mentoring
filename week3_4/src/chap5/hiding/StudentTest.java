package chap5.hiding;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student();
//		studentLee.studentName = "������";
		studentLee.setStudentName("������");
		
		System.out.println(studentLee.getStudentName());
	}
}

