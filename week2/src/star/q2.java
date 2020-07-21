package star;

import java.util.Scanner;

public class q2 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int line = in.nextInt();

		for (int i = 0; i < line; i++) { // 0~4 : 5¹ø¹Ýº¹
			for(int j = 0; j < line - i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
