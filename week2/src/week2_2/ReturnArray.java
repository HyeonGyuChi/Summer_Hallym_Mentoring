// �迭 ���� ����
// �迭�� �����ϰ� �� ���� ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. �迭 ������ �迭�� �����Ͽ� �� ������ �ε��� ������ �ʱ�ȭ�Ͽ� ��ȯ�ϴ� �޼ҵ带 �̿��Ѵ�.

package week2_2;

public class ReturnArray {

	public static int[] makeArray() {
		int temp[] = new int[4];
		for (int i = 0; i < temp.length; i++) {
			temp[i] = i;
		}
		return temp;
	}

	public static void main(String[] args) {
		int intArray[];
		intArray = makeArray();
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
	}

}
