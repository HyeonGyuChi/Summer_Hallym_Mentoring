// 3�Ⱓ �����Ѿװ� ��ձ��ϱ�
// �� ȸ���� ���� 3�Ⱓ �б⺰ ������ �Ѿװ� ����� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�. 

package week2_2;

public class SalesRevenue {

	public static void main(String[] args) {
		int intArray[][] = { { 90, 90, 110, 110 }, { 120, 110, 100, 110 }, { 120, 110, 100, 110 }, { 120, 140, 130, 150 } };
		double sum = 0;

		for (int i = 0; i < intArray.length; i++) {
			for (int j = 0; j < intArray[0].length; j++) {
				sum += intArray[i][j];
			}
		}

		System.out.println("���� 3�Ⱓ ���� �Ѿ��� " + sum + "�̸� ����� ������ " + sum / intArray.length + "�Դϴ�.");

	}

}
