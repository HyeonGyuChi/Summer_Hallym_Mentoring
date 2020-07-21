package star;

import java.util.Scanner;

public class q7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int line = num * 2 - 1;

		for (int i = 0; i < line; i++) {
			for (int j = 0; j < Math.abs(num - i - 1); j++) {
				System.out.print("*");
			}
			for(int j = 0; j < Math.abs(line - 2*Math.abs(num-i-1)); j++) {
				System.out.print("#");
			}
			
			System.out.println();

		}

	}

}
