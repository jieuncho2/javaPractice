package chapter11;

import java.time.LocalDateTime;

public class Exam14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime ldt1 = LocalDateTime.of(2010, 1, 1, 12, 23, 23, 444);
		System.out.println(ldt1);
		LocalDateTime ldt2 = LocalDateTime.of(2010, 12, 25, 1, 12, 2, 232);
		System.out.println(ldt2);
		
		System.out.println(ldt1.isAfter(ldt2));
		System.out.println(ldt1.isBefore(ldt2));
		System.out.println(ldt1.isEqual(ldt2));
	}

}