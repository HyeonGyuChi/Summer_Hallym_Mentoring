package star;

public class array1 {

	public static void main(String[] args) {
		int arr[][] = new int[5][10];
		int cnt = 1;

		// ����
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = cnt++;
			}
		}
		
		// ���
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
		

	}

}
