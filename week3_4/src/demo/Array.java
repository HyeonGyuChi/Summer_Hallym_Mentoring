package demo;

public class Array {

	public static void main(String[] args) {
		int arr[];
		arr = new int[5];
		int sum = 0; // 배열원소의 총합
		double avg = 0;
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		for(int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		
		System.out.println(sum / arr.length);
		
		

	}

}
