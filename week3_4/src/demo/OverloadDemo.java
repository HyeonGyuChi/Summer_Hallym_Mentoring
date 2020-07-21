package demo;

public class OverloadDemo {

	public void printHello() {
		System.out.println("�Ķ���� 0");
	}

	public void printHello(int n1) {
		System.out.println("�Ķ���� 1");
	}

	public int printHello(int n1, int n2) {
		System.out.println("�Ķ���� 2");
		return n1;
	}
	
	public void printHello(int n1, int n2, int n3) {
		System.out.println("�Ķ���� 3");
	}
	


	public static void main(String[] args) {
		OverloadDemo o = new OverloadDemo();
		o.printHello();
		o.printHello(1);
		o.printHello(1,2); // void
		o.printHello(1,2, 3); // int
	}

}
