package chap6.singleton;

public class CarFactory {
	private static CarFactory cf = new CarFactory();

	private CarFactory() {}

	public static CarFactory getInstance() {
		return cf;
	}
	
	public Car createCar(){
		Car c = new Car();
		return c;
	}
}
