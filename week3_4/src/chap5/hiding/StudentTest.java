package chap5.hiding;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student();
//		studentLee.studentName = "지현규";
		studentLee.setStudentName("지현규");
		
		System.out.println(studentLee.getStudentName());
	}
}

