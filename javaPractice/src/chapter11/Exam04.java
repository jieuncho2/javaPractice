package chapter11;

import java.util.Calendar;

public class Exam04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar today = Calendar.getInstance(); //현재 날짜를 나타내서 비교 할 때 사용하는 객체
		Calendar endOfYear = Calendar.getInstance(); //연말 날짜를 저장할 객체
		Calendar christmas = Calendar.getInstance(); //크리스마스 날짜를 저장할 객체

		endOfYear.set(Calendar.MONTH, 11); //endOfYear 객체의 월을 12월로 변경
		endOfYear.set(Calendar.DATE, 31); //endOfYear 객체의 일을 31일로 변경
		long diff = endOfYear.getTimeInMillis() - today.getTimeInMillis(); //연말에서 현재 초를 뻼
		System.out.println("연말까지 남은 날: " + diff / (24 * 60 * 60 * 1000) + "일"); //연말에서 현재까지의 초를 일로 변환
		christmas.set(2022, 11, 25); //2022년 12월 25일 월은 -1 값 입력
		diff = christmas.getTimeInMillis() - today.getTimeInMillis(); //크리스마에서 현재 초를 뻼
		System.out.println("크리스마스까지 남은 날: " + diff / (24 * 60 * 60 * 1000) + "일"); //크리스마에서 현재까지의 초를 일로 변환
	}

}
