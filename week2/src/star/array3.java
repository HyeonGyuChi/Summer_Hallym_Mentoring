package star;

public class array3 {

	public static void main(String[] args) {
		int arr[][] = new int[5][10];
		int cnt = 1;

		// »ğÀÔ
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) { // È¦¼ö ¶óÀÎ
				for (int j = 0; j < arr[i].length; j++) {
					arr[i][j] = cnt++;
				}
			} else { // Â¦¼ö ¶óÀÎ
				for (int j = arr[i].length - 1; j >= 0; j--) {
					arr[i][j] = cnt++;
				}

			}
		}

		// Ãâ·Â
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
