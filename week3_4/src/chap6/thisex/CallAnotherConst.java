package chap6.thisex;

class Person{
	String name;
	int age;
	
	Person(){ // ����Ʈ ������, ���� �ȵ����� ��� �ڹ� �ڵ����� - �����ڸ� ������ϰ� ��밡��
		// this.name = "noname"; this�� ����� ������ ȣ���ϴ� �ڵ� ������ �ٸ� �ڵ带 ���� �� ����
		this("�̸�����", 1);  // Person(String, int) ������ ȣ��
	}
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	Person returnItSelf() { // �ڽ��� �ν��Ͻ� �ּҸ� ��ȯ
		return this;
	}
	
}

public class CallAnotherConst {

	public static void main(String[] args) {

		Person noName = new Person();
		System.out.println(noName.name);
		System.out.println(noName.age);
		
//		 �ڽ��� �ν��Ͻ� �ּҸ� ��ȯ
		Person p = noName.returnItSelf();
		System.out.println(p);
		System.out.println(noName);
		System.out.println();
	}
}
