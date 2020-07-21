package chap6.thisex;

class Person{
	String name;
	int age;
	
	Person(){ // 디폴트 생성자, 선언 안되있을 경우 자바 자동생성 - 생성자를 선언안하고도 사용가능
		// this.name = "noname"; this를 사용해 생성자 호출하는 코드 이전에 다른 코드를 넣을 수 없음
		this("이름없음", 1);  // Person(String, int) 생성자 호출
	}
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	Person returnItSelf() { // 자신의 인스턴스 주소를 반환
		return this;
	}
	
}

public class CallAnotherConst {

	public static void main(String[] args) {

		Person noName = new Person();
		System.out.println(noName.name);
		System.out.println(noName.age);
		
//		 자신의 인스턴스 주소를 반환
		Person p = noName.returnItSelf();
		System.out.println(p);
		System.out.println(noName);
		System.out.println();
	}
}
