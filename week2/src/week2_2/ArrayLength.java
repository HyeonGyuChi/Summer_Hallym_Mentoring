// �迭 ������ ��ձ��ϱ�
// �迭�� length �ʵ带 �̿��Ͽ� �迭 ũ�⸸ŭ Ű���忡�� ������ �Է� �ް� ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.


package week2_2;
import java.util.Scanner;

public class ArrayLength {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int intArray[] = new int[5];
		double sum = 0;
		
		for(int i = 0; i < intArray.length; i++) { // �迭 �Է�
			intArray[i] = in.nextInt();
		}
		
		for(int i = 0; i < intArray.length; i++) { // �迭 ����
			sum += intArray[i];
		}
		
		System.out.println("�迭 ������ ��� : " + sum / intArray.length);

	}

}
