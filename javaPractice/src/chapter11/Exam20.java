package chapter11;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Exam20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date now = new Date();
		SimpleDateFormat p = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 HH시 mm분");
		System.out.println(p.format(now));
	}

}
