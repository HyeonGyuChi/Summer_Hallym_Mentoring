package chap5.hiding;

/*
 * 
 * day, month, year 변수는 private로 선언합니다.
 * 날짜 유효성을 위한 멤버변수 boolean isValid를 만듭니다.(private)
 * 각 변수의 get, set 메서드 public으로 만듭니다.
 * MyDateComplete(int day, int month, int year) 생성자를 만듭니다.
 * public void isValid() 메서드를 만들어 날짜가 유효한지 확인합니다.
 * 윤년(29일)인 경우 = 4년이나 주기, 100년의 경우 윤년제외, 400년의 경우 윤년
 * */

public class MyDateCompleteTest {

	public static void main(String[] args) {
		MyDateComplete date1 = new MyDateComplete(30, 2, 2000); // day, month, year
		date1.isValid(); // 2000,2,30
		MyDateComplete date2 = new MyDateComplete(2, 10, 2006);
		date2.isValid(); // 2006,10,2

	}

}
