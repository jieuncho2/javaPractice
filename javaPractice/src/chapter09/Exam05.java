package chapter09;

public class Exam05 {
	public static void main(String[] args) {
		try {
			Exception e = new Exception("고의 예외");
			throw e;
		} catch(Exception e) {
			System.out.println("예외 발생");
			System.out.println(e.getMessage());
		}
	}
}
