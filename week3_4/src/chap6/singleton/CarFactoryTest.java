package chap6.singleton;

public class CarFactoryTest {

	public static void main(String[] args) {
		CarFactory factory = CarFactory.getInstance(); // ½ÌÅ¬Åæ
		Car mySonata = factory.createCar(); // ¸Þ¼­µå·Î Car»ý¼º
		Car yourSonata = factory.createCar();
		
		System.out.println(mySonata.getCarnum());
		System.out.println(yourSonata.getCarnum());

	}

}
