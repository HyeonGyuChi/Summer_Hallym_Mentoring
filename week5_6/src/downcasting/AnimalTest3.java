package downcasting;

public class AnimalTest3 {
	
	 public static void main(String[] args) {
		 
		 // �ٿ�ĳ���� = ���� Ŭ������ �� ��ȯ�Ǿ��� ���� Ŭ������ �ٽ� ���� �ڷ������� �� ��ȯ�ϴ� ��, �� ���� �ν��Ͻ��� �޼ҵ带 ����ϱ� ����

		 // ������ ���� ����
		 // ��? Tiger�ν��Ͻ��� Animal������ �ڵ�����ȯ
		 // ���� h�� �ڷ��� Human�� ���� �� ��ȯ�Ǵ� ani�� (Human)���� �����ϹǷ� ������ ���� ����
		 
		 // but �ڵ� ����� ����
		 Animal ani = new Tiger();
		 Human h = (Human)ani;
		 
		 // �׷��Ƿ� instanceof ���� ���� ���� �ν��Ͻ����� ��Ȯ�� Ȯ���ϰ� �ٿ�ĳ������ �ؾ� ����
		 Animal hAnimal = new Human();
		 if(hAnimal instanceof Human) { // hAnimal �ν��Ͻ� �ڷ����� Human���̶��
			 Human human = (Human)hAnimal; // �ν��Ͻ� hAnimal�� Human������ �ٿ�ĳ����
		 }

	 }

	

}



