package chap5.hiding;

public class MyDateTest {

	public static void main(String[] args) {

		MyDate date = new MyDate();
		date.month = 2; // ? 2월은 28일이나 29일까지
		date.day = 31; // ? 31일로 대입 가능
		date.year = 2016;
		
		// 즉 클래스의 맴머변수를 public으로 선언하면 접근이 제한되지 않으므로 정보의 오류 발생가능
		// 이런경우 오류가 나더라도 그값이 해당 변수에 대입되지 못하도록 private로 바꾸고 public메소드를 별도로 제공해야 함.
	}
}
