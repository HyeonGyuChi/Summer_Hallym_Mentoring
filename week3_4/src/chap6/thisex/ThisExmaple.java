package chap6.thisex;

class BirthDay{

	int day;
	int month;
	int year;
	
	public void setYear(int year) {
		this.year = year; // �Ű��������� ����
	}
	
	public void printThis() {
		System.out.println(this);  //this ����غ���
	}
}

public class ThisExmaple {

	public static void main(String[] args) {
		
		BirthDay bDay = new BirthDay();
		bDay.setYear(2000);
		
		System.out.println(bDay); // Ŭ�����̸�@�޸��ּ�
		bDay.printThis(); // ������ �ν��Ͻ� �����θ� ����Ű�� �����
		
		BirthDay bDay2 = new BirthDay();
		System.out.println(bDay2); // �ٸ� �ν��Ͻ�
		
		
		
	}
}
