package chap6.cooperation;

public class Taxi {
	String companyName; // 회사이름
	int money; // 택시의 수입

	public Taxi(String companyName) { // 회사이름을 매개변수로 받는 생성자
		this.companyName = companyName;
	}

	public void take(int money) { // 승객이 낸 돈을 받음
		this.money = money;
	}

	public void showInfo() {
		System.out.println(companyName + "택시 수입은 " + money + "입니다.");
	}

}
