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
				System.out.println("오류입니다.");
			} else {
				System.out.println("설정되었습니다");
				this.day = day;
			}
		}
	}

	public static void main(String args[]) {
		MyDateNew date1 = new MyDateNew(2, 2020); // 2020년 2월
		
		System.out.println("31일로 설정");
		date1.setDay(31); // 2월 31일
		
		System.out.println("25일로 설정");
		date1.setDay(25); // 2월 25일
		
	}

}
