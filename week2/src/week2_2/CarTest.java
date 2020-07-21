// 객체배열
package week2_2; // package는 무조건 가장 위에

import java.util.Scanner;

public class CarTest {

	public static void main(String[] args) {
		Car[] cars = new Car[5]; // 객체 5개를 담을 수 있는 객체배열
		
		for(int i = 0; i < cars.length; i++) {
			cars[i] = new Car(); // 객체생성
		}
		for(int i = 0; i <cars.length; i++) {
			cars[i].speedUp(); // 객체 메소드 접근
		}
		for(int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]); // .toString() 호출
		}

	}

}

class Car {

	public int speed; // 속도
	public int mileage; // 주행거리
	public String color; // 색상

	public Car() {
		speed = mileage = 0;
		color = "red";
	}

	public void speedUp() { // 메소드
		speed += 10;
	}

	public String toString() { // 객체 상태 문자열로 반환
		return "속도" + speed + "주행거리" + mileage + "색상" + color;
	}

}
