package inheritance;

public class OverridingTest2 {

	public static void main(String[] args) {
		Customer vc = new VIPCustomer(10030, "������", 2000);
		vc.bonusPoint = 1000;
		
		// ��������� �޼���� ������ Ŭ�������� ���� ȣ��
		// vc.calc(10000)�� �翬�� ������ Ŭ�������� Customer Ŭ������ calcPrice() ȣ���ϰ� ��, No!
		// ����Ŭ������ ����Ŭ������ ���� �̸��� �޼��� ������ �� ȣ��Ǵ� �޼���� �ν��Ͻ��� ���� ���� - �������̵�
		// �� "����޼���" == �ν��Ͻ��� �޼��尡 ȣ��Ǵ� ���
		System.out.println(vc.getCustomerName() +" ���� �����ؾ� �ϴ� �ݾ��� " + vc.calcPrice(10000) + "���Դϴ�.");
		
		// int agentID = vc.getAgentID; // ���Ұ� ��? vc�� Customer�� ������ ����ȯ �Ǿ����Ƿ� Customer Class�� ���ǵ� �޼ҵ常 ��밡��, getAgentID()�� VipCustomer �޼ҵ� �̹Ƿ� ���Ұ�
		// calcPrice()�� ��� CustomerŬ������ �޼ҵ带 ȣ���� ��, ������ �ڽ�Ŭ�������� ������ �Ͽ����Ƿ� VIPCustomerŬ�������� ������ calcPrice�� ȣ�� 
		
	}
}
