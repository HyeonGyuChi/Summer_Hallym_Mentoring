package chap6.staticex;
// �л����� ���� �ٸ� �л�ī�尡 �߱޵˴ϴ�. �л� ī�� ��ȣ�� �й��� 100�� ���� ��
// StudentCard Ŭ������ ����� �л�ī�� ��ȣ ��� ������ �߰� �ϰ�, �л��� ������ ������ �л�ī�� ��ȣ �ο�
// StudentCardTest Ŭ������ ����� �� �л��� ī�� ��ȣ�� ����غ�����


public class StudentCard {
	
	private static int serialNum = 1000; // private
	private int cardNum;
	int studentID; // ī�� ��ȣ
	String studentName;
	// int grade;
	// String address;
	
	public StudentCard(){
		serialNum++;
		studentID = serialNum;
		cardNum = studentID + 100; // ī�� ��ȣ
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
	
	public int getCardNum() { // ī���ȣ ��������
		return cardNum;
	}
}
