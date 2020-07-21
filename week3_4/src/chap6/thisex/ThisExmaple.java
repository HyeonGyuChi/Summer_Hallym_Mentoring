package chap6.thisex;

class BirthDay{

	int day;
	int month;
	int year;
	
	public void setYear(int year) {
		this.year = year; // 매개변수와의 구분
	}
	
	public void printThis() {
		System.out.println(this);  //this 출력해보기
	}
}

public class ThisExmaple {

	public static void main(String[] args) {
		
		BirthDay bDay = new BirthDay();
		bDay.setYear(2000);
		
		System.out.println(bDay); // 클래스이름@메모리주소
		bDay.printThis(); // 생성된 인스턴스 스스로를 가르키는 예약어
		
		BirthDay bDay2 = new BirthDay();
		System.out.println(bDay2); // 다른 인스턴스
		
		
		
	}
}
