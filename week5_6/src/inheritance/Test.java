package inheritance;

public class Test {

	Test(){
		
		
		Customer c = new Customer();
		c.bonusPoint = 100;
		c.customerID = 10001;
		
		Customer vc = new VIPCustomer(); // ��� ����Ŭ���� ��ü -> ����Ŭ������ ����ȯ ����(������ ����ȯ)
//		VIPCustomer cc = new Customer(); // ����Ŭ������ ��ü -> ����Ŭ������ ����ȯ �Ұ�
	}
}
