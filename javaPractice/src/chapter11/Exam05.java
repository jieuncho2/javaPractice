package chapter11;

import java.util.Calendar;
import java.util.Date;

public class Exam05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Calendar -> Date
		Calendar calendar = Calendar.getInstance();
		Date date = calendar.getTime();
		
//		Date -> Calendar
		calendar.setTime(date);
		
//		Calendar -> long
		long time = calendar.getTimeInMillis();
		System.out.println(time);
		
//		long -> Calendar
		calendar.setTimeInMillis(time);;
	}

}
