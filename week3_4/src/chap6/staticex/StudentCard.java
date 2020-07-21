package chap6.staticex;
// 학생마다 각각 다른 학생카드가 발급됩니다. 학생 카드 번호는 학번에 100을 더한 값
// StudentCard 클래스를 만들어 학생카드 번호 멤버 변수를 추가 하고, 학생이 생성될 때마다 학생카드 번호 부여
// StudentCardTest 클래스를 만들어 세 학생의 카드 번호를 출력해보세요


public class StudentCard {
	
	private static int serialNum = 1000; // private
	private int cardNum;
	int studentID; // 카드 번호
	String studentName;
	// int grade;
	// String address;
	
	public StudentCard(){
		serialNum++;
		studentID = serialNum;
		cardNum = studentID + 100; // 카드 번호
	}
	
	public String getStudentName(){
		return studentName;
	}
	
	public void setStudentName(String name){
		studentName = name;
	}

	public static int getSerialNum() { // static getter 
		return serialNum;
	}

	public static void setSerialNum(int serialNum) { // static setter
		StudentCard.serialNum = serialNum;
	}
	
	public int getCardNum() { // 카드번호 가져오기
		return cardNum;
	}
}
