package chap5.constructor;

public class Person {
	  String name;
	  float height;
	  float weight;
	
	  public Person() {} // 디폴트 생성자
//	
//	  public Person(String pname) { //이름을 매ㅉ개변수로 하는 생성자
//		   name = pname;
//	  }
	  public Person(String pname, float pheight, float pweight){ // 이름, 키, 몸무게를 매개변수로 받는 생성자
		   name = pname;
		   height = pheight;
		   weight = pweight;
	  }
	  
	  public void printInfo() {
		  System.out.printf("이름 : %s, 키 : %f, 몸무게 : %f\n", name, height, weight);
	  }
}   

