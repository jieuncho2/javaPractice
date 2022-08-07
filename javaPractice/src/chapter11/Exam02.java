package chapter11;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Exam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar a = Calendar.getInstance(); //싱글턴 패턴
		Calendar b = new GregorianCalendar(); //GregorianCalendar 인스턴스를 생성
		//동일한 결과 값이 나옴
		System.out.println(a.toString());
		System.out.println(b.toString());
	}

}
