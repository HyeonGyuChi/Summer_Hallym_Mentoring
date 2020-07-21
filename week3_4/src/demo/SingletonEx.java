package demo;

public class SingletonEx {

	public static void main(String[] args) {
		// Singleton ob1 = new Singleton(); // error

		Singleton ob1 = Singleton.getInstance();
		Singleton ob2 = Singleton.getInstance();

		if (ob1 == ob2) {
			System.out.println("���� ��ü");
		} else {
			System.out.println("�ٸ� ��ü");
		}

	}

}

class Singleton {
	private static Singleton singleton = new Singleton();

	private Singleton() {
	}

	static Singleton getInstance() { // static�޼ҵ� > static ������ ���ٰ���
		return singleton;
	}
}