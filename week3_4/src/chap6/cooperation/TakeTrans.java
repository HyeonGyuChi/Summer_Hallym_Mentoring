package chap6.cooperation;

// 문제. 택시타는 과정을 추가로 구현
// Edward 학생이 늦잠을 자서 택시를 타고 학교에 가게 되었습니다. 택시요금은 10000원을 지불했습니다.

public class TakeTrans {

	public static void main(String[] args) {
		// 두 명의 학생을 생성
		  Student studentJames = new Student("James", 5000);   
		  Student studentTomas = new Student("Tomas", 10000);
		   
		  Bus bus100 = new Bus(100);
		  studentJames.takeBus(bus100);     // james가 100번 버스를 탐
		  studentJames.showInfo();           // james 정보 출력
		  bus100.showInfo();                // 버스 정보 출력
		  
		  Subway subwayGreen = new Subway("2호선");  
		  studentTomas.takeSubway(subwayGreen);  // Tomas가 2호선을 탐
		  studentTomas.showInfo();                 // Tomas 정보 출력
		  subwayGreen.showInfo();  

		  /*	  
		  // 문제해결
		  Student studentEdward = new Student("Edward", 15000);
		  Taxi taxi = new Taxi("카카오");
		  
		  studentEdward.takeTaxi(taxi);
		  studentEdward.showInfo();
		  taxi.showInfo();
		   */	  
	}
}
