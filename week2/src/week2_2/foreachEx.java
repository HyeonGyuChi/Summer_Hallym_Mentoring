//for each �ݺ��� Ȱ��

package week2_2;

public class foreachEx {
	
	enum Week {��, ȭ, ��, ��, ��, ��, ��};

	public static void main(String[] args) {
		int[] num = {1,2,3,4,5};
		String names[] = {"���", "��", "�ٳ���", "ü��", "����", "����"};
		int sum = 0;
		
		// num[0], num[1] ... num[4] ���� �ݺ�
		for(int k : num) {
			sum += k;
		}
		System.out.println("����" + sum);
		
		for(String s : names) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		for(Week day : Week.values()) {
			System.out.print(day + "���� ");
		}
		System.out.println(" ");

	}

}
