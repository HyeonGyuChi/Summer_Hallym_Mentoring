package chap6.cooperation;

public class Taxi {
	String companyName; // ȸ���̸�
	int money; // �ý��� ����

	public Taxi(String companyName) { // ȸ���̸��� �Ű������� �޴� ������
		this.companyName = companyName;
	}

	public void take(int money) { // �°��� �� ���� ����
		this.money = money;
	}

	public void showInfo() {
		System.out.println(companyName + "�ý� ������ " + money + "�Դϴ�.");
	}

}
