package demo;

public class CallByValue {

	public static void swap(int x, int y) {

		int temp = x;
		x = y;
		y = temp;

	}

	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		System.out.println("swap() ȣ�� �� : a = " + a + ", b = " + b);

		swap(a, b);

		System.out.println("swap() ȣ�� �� : a = " + a + ", b = " + b);

	}

}