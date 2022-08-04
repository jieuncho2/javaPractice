package chapter11;

import java.time.LocalDate;

public class Exam12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate ld = LocalDate.now();
		LocalDate new_ld;
		int count = 0;
		
		for(int i = 1900; i <= 2100; i++) {
			new_ld = ld.withYear(i);
			if(new_ld.isLeapYear()) { //isLeapYear() 메서드는 윤년이면 true 반환
				System.out.println(new_ld.getYear() + "은 윤년입니다.");
				count++;
			}
		}
		System.out.println("1900년부터 2100년까지 윤년은 총 " + count + "번 있습니다.");
	}

}
