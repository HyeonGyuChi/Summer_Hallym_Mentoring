package chap6.cooperation;

public class Bus {
	 int busNumber;             // ���� ��ȣ
	 int passengerCount;        // �°� ��
	 int money;                 // ������ ����
	    
	 public Bus(int busNumebr)   // ���� ��ȣ�� �Ű������� �޴� ������
	 {   
		  this.busNumber = busNumebr;
	 }
	
	 public void take(int money)   // �°��� �� ���� ����
	 {  
		  this.money += money;    // ������ ���� ����
		  passengerCount++;      // �°� �� ����
	 }
	    
	 public void showInfo() {      // ���� ������ ����ϴ� �Լ�
		  System.out.println("���� " + busNumber + "���� �°��� " + passengerCount +"���̰�, ������ " + money + "�Դϴ�.");
	 }


}
