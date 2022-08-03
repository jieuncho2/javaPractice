package chapter11;

import java.util.Calendar;

public class Exam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar a = Calendar.getInstance();

		int year = a.get(Calendar.YEAR);
		int month = a.get(Calendar.MONTH) + 1;
		int date = a.get(Calendar.DATE);

		System.out.println(year + "년 " + month + "월 " + date + "일");
		System.out.println(dow(a.get(Calendar.DAY_OF_WEEK)));

		System.out.println("이번 년도에서 오늘이 며칠쨰인가?: ");
		System.out.println(a.get(Calendar.DAY_OF_YEAR));

		System.out.println("이번 달은 며칠까지 있는가?: ");
		System.out.println(a.getActualMaximum(Calendar.DATE));

	}

	static String dow(int dayOfWeek) {
		// TODO Auto-generated method stub
//		switch (dayOfWeek) {
//		case 1:
//			return "일요일";
//		case 2:
//			return "월요일";
//		case 3:
//			return "화요일";
//		case 4:
//			return "수요일";
//		case 5:
//			return "목요일";
//		case 6:
//			return "금요일";
//		case 7:
//			return "토요일";
//
//		}
//		return null;

		String[] arr = {"일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};
		
		return arr[dayOfWeek - 1];

	}

}
