// ��ü�迭
package week2_2; // package�� ������ ���� ����

import java.util.Scanner;

public class CarTest {

	public static void main(String[] args) {
		Car[] cars = new Car[5]; // ��ü 5���� ���� �� �ִ� ��ü�迭
		
		for(int i = 0; i < cars.length; i++) {
			cars[i] = new Car(); // ��ü����
		}
		for(int i = 0; i <cars.length; i++) {
			cars[i].speedUp(); // ��ü �޼ҵ� ����
		}
		for(int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]); // .toString() ȣ��
		}

	}

}

class Car {

	public int speed; // �ӵ�
	public int mileage; // ����Ÿ�
	public String color; // ����

	public Car() {
		speed = mileage = 0;
		color = "red";
	}

	public void speedUp() { // �޼ҵ�
		speed += 10;
	}

	public String toString() { // ��ü ���� ���ڿ��� ��ȯ
		return "�ӵ�" + speed + "����Ÿ�" + mileage + "����" + color;
	}

}
