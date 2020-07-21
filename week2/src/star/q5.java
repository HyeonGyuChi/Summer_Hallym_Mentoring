package star;

import java.util.Scanner;

public class q5 {

	public static void main(String[] args) {
		

		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int line = 2*num - 1;
		

		for (int i = 0; i < line; i++) {
			for(int j = 0; j < num - Math.abs(num - i - 1); j++) {
				System.out.print("*");
			}
			
			
			System.out.println();
		}

	}

}
