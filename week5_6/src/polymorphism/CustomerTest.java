package polymorphism;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customerLee = new Customer();
		customerLee.setCustomerID(10010);
		customerLee.setCustomerName("�̼���");
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());

		Customer customerKim = new VIPCustomer(10020, "������", 12345); // �ν��Ͻ��� ���� �޼ҵ� ȣ��
		customerKim.bonusPoint = 1000;
		System.out.println(customerKim.showCustomerInfo());
		
		
		System.out.println("====== �������� ���ʽ� ����Ʈ ��� =======");
		
		int price = 10000;
		int leePrice = customerLee.calcPrice(price); // �� ���� �� ����Ʈ ����
		int kimPrice = customerKim.calcPrice(price); // �� ���� �� ����Ʈ ����(�޼ҵ� �������̵�)
		System.out.println(customerLee.getCustomerName() +" ���� " + leePrice + "�� �����ϼ̽��ϴ�.");
		System.out.println(customerLee.showCustomerInfo());
		System.out.println(customerKim.getCustomerName() +" ���� " + kimPrice + "�� �����ϼ̽��ϴ�.");
		System.out.println(customerKim.showCustomerInfo());
	}
}