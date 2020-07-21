package week3_2;

class Person {
	public String name;
	public int age;
	
	public Person() {
		
	}
	public Person(String s) {
		name = s;
	}
	
	public String getName() {
		return name;
	}
}


public class PersonUse{
	
	public static void main(String args[]) {
		Person aPerson;
		aPerson = new Person("±è¿µ³²");
		int l;
		String s;
		
		aPerson.age = 30;
		l = aPerson.age;
		s = aPerson.getName(); 
		
		System.out.println(s);
	}
}
