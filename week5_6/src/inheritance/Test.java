package inheritance;

public class Test {

	Test(){
		
		
		Customer c = new Customer();
		c.bonusPoint = 100;
		c.customerID = 10001;
		
		Customer vc = new VIPCustomer(); // 모든 하위클래스 객체 -> 상위클래스로 형변환 가능(묵시적 형변환)
//		VIPCustomer cc = new Customer(); // 상위클래스의 객체 -> 하위클래스로 형변환 불가
	}
}
