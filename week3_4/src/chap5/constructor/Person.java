package chap5.constructor;

public class Person {
	  String name;
	  float height;
	  float weight;
	
	  public Person() {} // ����Ʈ ������
//	
//	  public Person(String pname) { //�̸��� �Ť��������� �ϴ� ������
//		   name = pname;
//	  }
	  public Person(String pname, float pheight, float pweight){ // �̸�, Ű, �����Ը� �Ű������� �޴� ������
		   name = pname;
		   height = pheight;
		   weight = pweight;
	  }
	  
	  public void printInfo() {
		  System.out.printf("�̸� : %s, Ű : %f, ������ : %f\n", name, height, weight);
	  }
}   

