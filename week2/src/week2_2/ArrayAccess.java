// 배열에 입력 받은 수 중 제일 큰 수 찾기
// 키보드에서 입력 받은 정수 5개를 배열에 저장하고 제일 큰 수를 화면에 출력하는 프로그램을 작성하시오. 


package week2_2;

import java.util.Scanner;

public class ArrayAccess {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int intArray[] = new int[5];
		int max = 0; 
		
		
		for(int i = 0; i < 5; i++) {
			intArray[i] = in.nextInt(); // 사용자로부터 정수입력
			max = max > intArray[i] ? max : intArray[i];  
		}
		System.out.println("입력된 가장 큰 수 는 " + max + "입니다.");
		

	}

}
