package week2;

public class ContinueExample {

	public static void main(String[] args) {
		int sum = 0;
		
		for(int i = 1; i <= 100; i++) {
			sum += i%2 == 1 ? 0 : i; // 삼항연산자 사용

//			if(i%2 == 1) { // 홀수
//				continue;
//			}
//			sum+=i;
		}
		
		System.out.println("1부터 100까지 짝수의 합은 " + sum);
		
		

	}

}
