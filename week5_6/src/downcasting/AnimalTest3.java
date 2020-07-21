package downcasting;

public class AnimalTest3 {
	
	 public static void main(String[] args) {
		 
		 // 다운캐스팅 = 상위 클래스로 형 변환되었던 하위 클래스를 다시 원래 자료형으로 형 변환하는 것, 즉 원래 인스턴스의 메소드를 사용하기 위해

		 // 컴파일 오류 없음
		 // 왜? Tiger인스턴스는 Animal형으로 자동형변환
		 // 변수 h의 자료형 Human과 강제 형 변환되는 ani의 (Human)형이 동일하므로 컴파일 오류 없음
		 
		 // but 코드 실행시 오류
		 Animal ani = new Tiger();
		 Human h = (Human)ani;
		 
		 // 그러므로 instanceof 예약어를 통해 원래 인스턴스형을 정확히 확인하고 다운캐스팅을 해야 안전
		 Animal hAnimal = new Human();
		 if(hAnimal instanceof Human) { // hAnimal 인스턴스 자료형이 Human형이라면
			 Human human = (Human)hAnimal; // 인스턴스 hAnimal을 Human형으로 다운캐스팅
		 }

	 }

	

}



