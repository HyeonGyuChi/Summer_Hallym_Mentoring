package inheritance;

public class VIPCustomer extends Customer{
	
	private int agentID;
	double saleRatio;
	
	public VIPCustomer()
	{
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
//		System.out.println("VIPCusomer() 생성자 호출");
	}
	
	public VIPCustomer(int customerID, String customerName, int agentID){
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
//		System.out.println("VIPCusomer(int, String) 생성자 호출");
	}
	
	public int calcPrice(int price){ // 메서드 오버라이딩(상위클래스에 정의한 메서드가 하위클래스에서 구현할 내용가 맞지않을경우 재정의)
		// System.out.println("VIP calc");
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}
	
	public int getAgentID(){
		return agentID;
	}
	
	public String showVIPInfo() {
		return super.showCustomerInfo() + "담당 상담원 아이디는" + agentID + "입니다."; // 하위 클래스에 showCustomerInfo()가 오버라이딩 되었을 경우 부모메소드를 호출
//		return showCustomerInfo() + "담당 상담원 아이디는" + agentID + "입니다.";
 	}
	
}
