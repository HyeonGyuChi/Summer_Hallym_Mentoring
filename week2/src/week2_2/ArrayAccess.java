// �迭�� �Է� ���� �� �� ���� ū �� ã��
// Ű���忡�� �Է� ���� ���� 5���� �迭�� �����ϰ� ���� ū ���� ȭ�鿡 ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 


package week2_2;

import java.util.Scanner;

public class ArrayAccess {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int intArray[] = new int[5];
		int max = 0; 
		
		
		for(int i = 0; i < 5; i++) {
			intArray[i] = in.nextInt(); // ����ڷκ��� �����Է�
			max = max > intArray[i] ? max : intArray[i];  
		}
		System.out.println("�Էµ� ���� ū �� �� " + max + "�Դϴ�.");
		

	}

}
