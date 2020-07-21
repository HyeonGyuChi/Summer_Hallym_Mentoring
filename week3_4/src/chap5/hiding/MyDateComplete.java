package chap5.hiding;

import java.util.Calendar;

public class MyDateComplete {

	// private ������ ����
	private int day; // 1~31, 1~30, 1~28(����x), 1~29(����)
	private int month; // 1~12��
	private int year; // 0~2020��
	private boolean isValid = true; // ��¥ ��ȿ�� Ȯ��

	// ������
	public MyDateComplete(int day, int month, int year) {
//		this.day = day;
//		this.month = month;
//		this.year = year;

		// �����߿�
		setYear(year);
		setMonth(month);
		setDay(day);

	}

	// setter
	public void setDay(int day) {
		// this.day = day;
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12: // �ش�� 1 ~ 31 �� ����
			if (day < 1 || day > 31) {
				isValid = false; // ��ȿx
			} else {
				this.day = day; // ��ȿ�ϹǷ� ��������� �ʱ�ȭ
			}
			break;

		case 4:
		case 6:
		case 9:
		case 11: // �ش�� 1~30�� ����
			if (day < 1 || day > 30) {
				isValid = false;
			} else {
				this.day = day;
			}
			break;

		case 2: // 2��
			// ������ ��� = 4���̳� �ֱ�, 100���� ��� ��������, 400���� ��� ����
			if (((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) {
				if (day < 0 || day > 29) { // 29�ϱ��� �Է°���
					isValid = false;
				} else {
					this.day = day;
				}
			} else { // ������ �ƴ� ���
				if (day < 0 || day > 28) { // 28�ϱ��� �Է°���
					isValid = false;
				} else {
					this.day = day;
				}
			}
			break;

		default:
			isValid = false;

		}

	}

	public void setMonth(int month) {
		if (month < 1 || month > 12) {
			isValid = false;
		} else {
			this.month = month;
		}
	}

	public void setYear(int year) {
		if (year > Calendar.getInstance().get(Calendar.YEAR)) { // ���� year ���� Ŭ ���
			isValid = false;
		} else {
			this.year = year;
		}

	}

	// getter
	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}

	// ��ȿ�� Ȯ�� �޼ҵ�
	public void isValid() {
		if (isValid) {
			System.out.println("��ȿ�� ��¥�Դϴ�.");
		} else {
			System.out.println("��ȿ���� ���� ��¥�Դϴ�.");
		}
	}

}
