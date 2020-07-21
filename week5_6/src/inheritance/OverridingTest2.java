package inheritance;

public class OverridingTest2 {

	public static void main(String[] args) {
		Customer vc = new VIPCustomer(10030, "나몰라", 2000);
		vc.bonusPoint = 1000;
		
		// 멤버변수와 메서드는 선언한 클래스형에 따라 호출
		// vc.calc(10000)은 당연히 선언한 클래스형인 Customer 클래스의 calcPrice() 호출하게 됨, No!
		// 상위클래스와 하위클래스에 같은 이름의 메서드 존재할 때 호출되는 메서드는 인스턴스에 따라 결정 - 오버라이딩
		// 즉 "가상메서드" == 인스턴스의 메서드가 호췰되는 기술
		System.out.println(vc.getCustomerName() +" 님이 지불해야 하는 금액은 " + vc.calcPrice(10000) + "원입니다.");
		
		// int agentID = vc.getAgentID; // 사용불가 왜? vc는 Customer로 묵시적 형변환 되었으므로 Customer Class에 정의된 메소드만 사용가능, getAgentID()는 VipCustomer 메소드 이므로 사용불가
		// calcPrice()의 경우 Customer클래스의 메소드를 호줄한 것, 하지만 자식클래스에서 재정의 하였으므로 VIPCustomer클래스에서 정의한 calcPrice가 호출 
		
	}
}
