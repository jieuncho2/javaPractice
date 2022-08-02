package chapter09;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class Exam08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintStream ps = null;
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream(".\\output_file\\error.log");
			ps = new PrintStream(fos);
			
			System.out.println(1);
			System.out.println(2);
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);
		} catch(Exception ae) {
			ae.printStackTrace(ps);
			ps.println("예외 메세지 : " + ae.getMessage());
		}
		System.out.println(6);
	}

}
