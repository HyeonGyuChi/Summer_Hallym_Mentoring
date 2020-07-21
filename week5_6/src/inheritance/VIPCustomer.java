package inheritance;

public class VIPCustomer extends Customer{
	
	private int agentID;
	double saleRatio;
	
	public VIPCustomer()
	{
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
//		System.out.println("VIPCusomer() ������ ȣ��");
	}
	
	public VIPCustomer(int customerID, String customerName, int agentID){
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
//		System.out.println("VIPCusomer(int, String) ������ ȣ��");
	}
	
	public int calcPrice(int price){ // �޼��� �������̵�(����Ŭ������ ������ �޼��尡 ����Ŭ�������� ������ ���밡 ����������� ������)
		// System.out.println("VIP calc");
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}
	
	public int getAgentID(){
		return agentID;
	}
	
	public String showVIPInfo() {
		return super.showCustomerInfo() + "��� ���� ���̵��" + agentID + "�Դϴ�."; // ���� Ŭ������ showCustomerInfo()�� �������̵� �Ǿ��� ��� �θ�޼ҵ带 ȣ��
//		return showCustomerInfo() + "��� ���� ���̵��" + agentID + "�Դϴ�.";
 	}
	
}
