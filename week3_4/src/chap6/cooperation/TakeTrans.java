package chap6.cooperation;

// ����. �ý�Ÿ�� ������ �߰��� ����
// Edward �л��� ������ �ڼ� �ýø� Ÿ�� �б��� ���� �Ǿ����ϴ�. �ýÿ���� 10000���� �����߽��ϴ�.

public class TakeTrans {

	public static void main(String[] args) {
		// �� ���� �л��� ����
		  Student studentJames = new Student("James", 5000);   
		  Student studentTomas = new Student("Tomas", 10000);
		   
		  Bus bus100 = new Bus(100);
		  studentJames.takeBus(bus100);     // james�� 100�� ������ Ž
		  studentJames.showInfo();           // james ���� ���
		  bus100.showInfo();                // ���� ���� ���
		  
		  Subway subwayGreen = new Subway("2ȣ��");  
		  studentTomas.takeSubway(subwayGreen);  // Tomas�� 2ȣ���� Ž
		  studentTomas.showInfo();                 // Tomas ���� ���
		  subwayGreen.showInfo();  

		  /*	  
		  // �����ذ�
		  Student studentEdward = new Student("Edward", 15000);
		  Taxi taxi = new Taxi("īī��");
		  
		  studentEdward.takeTaxi(taxi);
		  studentEdward.showInfo();
		  taxi.showInfo();
		   */	  
	}
}
