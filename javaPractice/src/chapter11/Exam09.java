package chapter11;

import java.time.LocalDate;

public class Exam09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		
		LocalDate new_ld = ld.withYear(1999).withMonth(8).withDayOfYear(23);
		System.out.println(new_ld);
	}

}
