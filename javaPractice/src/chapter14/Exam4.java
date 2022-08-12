package chapter14;

import java.io.Console;

public class Exam4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Console console = System.console();
		
		System.out.println("이름: ");
		String name = console.readLine();
		System.out.println("이름: ");
		String job = console.readLine();
		System.out.println("이름: ");
		char[] pass = console.readPassword();
		String strPass = new String(pass);
		
		System.out.println(name);
		System.out.println(job);
		System.out.println(strPass);
	}

}
