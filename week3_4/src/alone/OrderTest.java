package alone;

public class OrderTest {

	public static void main(String[] args) {
		Order order = new Order();
		
		order.orderId = 202003120001L; // int x
		order.customerId = "abs123";
		order.orderDate = "2018�� 3�� 12��"; 
		order.customerName = "ȫ���";
		order.productId = "PD345-12";
		order.shippingAddress = "����� �������� ���ǵ��� 20����";
		
		System.out.println("�ֹ� ��ȣ: " + order.orderId);
		System.out.println("�ֹ��� ���̵�: " + order.customerId);
		System.out.println("�ֹ� ��¥: " + order.orderDate);
		System.out.println("�ֹ��� �̸�: " + order.customerName);
		System.out.println("�ֹ� ��ǰ ��ȣ: " + order.productId);
		System.out.println("��� �ּ�: " + order.shippingAddress);
	}

}