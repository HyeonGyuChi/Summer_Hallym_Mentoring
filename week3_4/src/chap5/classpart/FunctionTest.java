package chap5.classpart;

public class FunctionTest {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 20;

		int sum = addNum(num1, num2);
		System.out.println(num1 + " + " + num2 + " = " + sum + "입니다");
		
		int div = divNum(num1, num2);
		System.out.println(num1 + " / " + num2 + " = " + div + "입니다");
		
		int mul = mulNum(num1, num2);
		System.out.println(num1 + " * " + num2 + " = " + mul + "입니다");
	}

	public static int addNum(int n1, int n2) {

		int result = n1 + n2;
		return result;
	}

	public static int subNum(int n1, int n2) {

		int result = n1 - n2;
		return result;
	}

	public static int divNum(int n1, int n2) {

		int result = n1 / n2;
		return result;
	}

	public static int mulNum(int n1, int n2) {

		int result = n1 * n2;
		return result;
	}
}
