package chap5.hiding;

/*
 * 
 * day, month, year ������ private�� �����մϴ�.
 * ��¥ ��ȿ���� ���� ������� boolean isValid�� ����ϴ�.(private)
 * �� ������ get, set �޼��� public���� ����ϴ�.
 * MyDateComplete(int day, int month, int year) �����ڸ� ����ϴ�.
 * public void isValid() �޼��带 ����� ��¥�� ��ȿ���� Ȯ���մϴ�.
 * ����(29��)�� ��� = 4���̳� �ֱ�, 100���� ��� ��������, 400���� ��� ����
 * */

public class MyDateCompleteTest {

	public static void main(String[] args) {
		MyDateComplete date1 = new MyDateComplete(30, 2, 2000); // day, month, year
		date1.isValid(); // 2000,2,30
		MyDateComplete date2 = new MyDateComplete(2, 10, 2006);
		date2.isValid(); // 2006,10,2

	}

}
