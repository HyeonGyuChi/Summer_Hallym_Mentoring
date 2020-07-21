// 3년간 매출총액과 평균구하기
// 한 회사의 지난 3년간 분기별 매출의 총액과 연평균 매출을 구하는 프로그램을 작성하시오. 

package week2_2;

public class SalesRevenue {

	public static void main(String[] args) {
		int intArray[][] = { { 90, 90, 110, 110 }, { 120, 110, 100, 110 }, { 120, 110, 100, 110 }, { 120, 140, 130, 150 } };
		double sum = 0;

		for (int i = 0; i < intArray.length; i++) {
			for (int j = 0; j < intArray[0].length; j++) {
				sum += intArray[i][j];
			}
		}

		System.out.println("지난 3년간 매출 총액은 " + sum + "이며 연평균 매출은 " + sum / intArray.length + "입니다.");

	}

}
