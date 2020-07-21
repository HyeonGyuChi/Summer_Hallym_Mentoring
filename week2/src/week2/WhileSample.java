package week2;

import java.util.Scanner;

public class WhileSample {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n = 0;
		double sum = 0;
		int i = 0;
		while ((i = in.nextInt()) != 0) {
			sum += i;
			n++;
		}
		System.out.println("입력된 수의 개수는 " + n + "개이며 평균은" + sum / n + "입니다.");
	}

}
