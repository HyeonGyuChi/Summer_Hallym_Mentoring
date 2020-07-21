package chap5.hiding;

public class MyDateNew {
	private int day;
	private int month;
	private int year;

	public MyDateNew(int month, int year) {
		this.month = month;
		this.year = year;
	}
	
	public void setDay(int day) { // day setter
		if (month == 2) {
			if (day < 1 || day > 28) {
				System.out.println("�����Դϴ�.");
			} else {
				System.out.println("�����Ǿ����ϴ�");
				this.day = day;
			}
		}
	}

	public static void main(String args[]) {
		MyDateNew date1 = new MyDateNew(2, 2020); // 2020�� 2��
		
		System.out.println("31�Ϸ� ����");
		date1.setDay(31); // 2�� 31��
		
		System.out.println("25�Ϸ� ����");
		date1.setDay(25); // 2�� 25��
		
	}

}
