package chapter09;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Date;

public class Exam09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintStream ps = null;
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream(".\\output_file\\error.log", true);
			ps = new PrintStream(fos);
			System.setErr(ps);
			
			System.out.println(1);
			System.out.println(2);
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);
		} catch(Exception ae) {
			System.err.println("-----------------------");
			System.err.println("예외 발생 시간: " + new Date());
			ae.printStackTrace(System.err);
			System.err.println("예외 메세지 : " + ae.getMessage());
			System.err.println("-----------------------");
		}
		System.out.println(6);
	}

}
