package chap6.singleton;

public class CarFactoryTest {

	public static void main(String[] args) {
		CarFactory factory = CarFactory.getInstance(); // ��Ŭ��
		Car mySonata = factory.createCar(); // �޼���� Car����
		Car yourSonata = factory.createCar();
		
		System.out.println(mySonata.getCarnum());
		System.out.println(yourSonata.getCarnum());

	}

}
