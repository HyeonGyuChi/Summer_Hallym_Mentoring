package chap5.hiding;

public class MyDateTest {

	public static void main(String[] args) {

		MyDate date = new MyDate();
		date.month = 2; // ? 2���� 28���̳� 29�ϱ���
		date.day = 31; // ? 31�Ϸ� ���� ����
		date.year = 2016;
		
		// �� Ŭ������ �ɸӺ����� public���� �����ϸ� ������ ���ѵ��� �����Ƿ� ������ ���� �߻�����
		// �̷���� ������ ������ �װ��� �ش� ������ ���Ե��� ���ϵ��� private�� �ٲٰ� public�޼ҵ带 ������ �����ؾ� ��.
	}
}
