package chapter11;

import java.time.LocalTime;

public class Exam11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalTime lt = LocalTime.now();
		System.out.println(lt);
		
		LocalTime newTime = lt.withHour(3).withMinute(25).withSecond(24).withNano(33333);
		System.out.println(newTime);
	}

}
