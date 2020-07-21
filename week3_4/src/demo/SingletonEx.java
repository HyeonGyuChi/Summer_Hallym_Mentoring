package demo;

public class SingletonEx {

	public static void main(String[] args) {
		// Singleton ob1 = new Singleton(); // error

		Singleton ob1 = Singleton.getInstance();
		Singleton ob2 = Singleton.getInstance();

		if (ob1 == ob2) {
			System.out.println("같은 객체");
		} else {
			System.out.println("다른 객체");
		}

	}

}

class Singleton {
	private static Singleton singleton = new Singleton();

	private Singleton() {
	}

	static Singleton getInstance() { // static메소드 > static 변수만 접근가능
		return singleton;
	}
}