package week2;

public class ContinueExample {

	public static void main(String[] args) {
		int sum = 0;
		
		for(int i = 1; i <= 100; i++) {
			sum += i%2 == 1 ? 0 : i; // ���׿����� ���

//			if(i%2 == 1) { // Ȧ��
//				continue;
//			}
//			sum+=i;
		}
		
		System.out.println("1���� 100���� ¦���� ���� " + sum);
		
		

	}

}
