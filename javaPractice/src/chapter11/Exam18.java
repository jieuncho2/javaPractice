package chapter11;

import java.util.Calendar;

public class Exam18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar a = Calendar.getInstance();
		
		int year = a.get(Calendar.YEAR);
		int month = a.get(Calendar.MONTH) + 1;
		int day = a.get(Calendar.DATE);
		String strWeek = dow(a.get(Calendar.DAY_OF_WEEK));
		String strAmPm = ampm(a.get(Calendar.AM_PM));
		int hour = a.get(Calendar.HOUR);
		int minute = a.get(Calendar.MINUTE);
		int second = a.get(Calendar.SECOND);
		
		System.out.println(year + "년");
		System.out.println(month + "월");
		System.out.println(day + "일");
		System.out.println(strWeek);
		System.out.println(strAmPm);
		System.out.println(hour + "시");
		System.out.println(minute + "분");
		System.out.println(second + "초");
	}

	static String dow(int dayOfWeek) {
		String[] arr = { "일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일" };

		return arr[dayOfWeek - 1];
	}

	static String ampm(int amPm) {
		if (amPm == 0) {
			return "오전";
		} else if (amPm == 1) {
			return "오후";
		}
		return null;
	}
}
