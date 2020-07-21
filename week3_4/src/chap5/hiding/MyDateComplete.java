package chap5.hiding;

import java.util.Calendar;

public class MyDateComplete {

	// private 변수로 선언
	private int day; // 1~31, 1~30, 1~28(윤달x), 1~29(윤달)
	private int month; // 1~12월
	private int year; // 0~2020년
	private boolean isValid = true; // 날짜 유효성 확인

	// 생성자
	public MyDateComplete(int day, int month, int year) {
//		this.day = day;
//		this.month = month;
//		this.year = year;

		// 순서중요
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
		case 12: // 해당월 1 ~ 31 일 존재
			if (day < 1 || day > 31) {
				isValid = false; // 유효x
			} else {
				this.day = day; // 유효하므로 멤버변수로 초기화
			}
			break;

		case 4:
		case 6:
		case 9:
		case 11: // 해당월 1~30일 존재
			if (day < 1 || day > 30) {
				isValid = false;
			} else {
				this.day = day;
			}
			break;

		case 2: // 2월
			// 윤년인 경우 = 4년이나 주기, 100년의 경우 윤년제외, 400년의 경우 윤년
			if (((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) {
				if (day < 0 || day > 29) { // 29일까지 입력가능
					isValid = false;
				} else {
					this.day = day;
				}
			} else { // 윤년이 아닌 경우
				if (day < 0 || day > 28) { // 28일까지 입력가능
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
		if (year > Calendar.getInstance().get(Calendar.YEAR)) { // 현재 year 보다 클 경우
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

	// 유효성 확인 메소드
	public void isValid() {
		if (isValid) {
			System.out.println("유효한 날짜입니다.");
		} else {
			System.out.println("유효하지 않은 날짜입니다.");
		}
	}

}
