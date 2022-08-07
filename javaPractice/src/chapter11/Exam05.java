package chapter11;

import java.util.Calendar;
import java.util.Date;

public class Exam05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Calendar -> Date
		Calendar calendar = Calendar.getInstance();
		Date date = calendar.getTime(); //getTime() 메서드로 Calendar -> Date로 변환
		System.out.println(date);
		
//		Date -> Calendar
		calendar.setTime(date); //date 값으로 calendar 객체 값 변환
		
//		Calendar -> long
		long time = calendar.getTimeInMillis(); //calendar 객체에 저장된 값을 long형으로 반환
		System.out.println(time);
		
//		long -> Calendar
		calendar.setTimeInMillis(time);; //long 데이터 타입을 calenda 객체 값 변환
	}

}
