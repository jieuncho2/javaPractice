package chapter09;

public class Exam06 {

	// TODO Auto-generated method stub
	public static void methodA() throws Exception {
		methodB();
	}
	
	public static void methodB() throws Exception {
		methodC();
//		try {
//			methodC();
//		} catch(Exception e) {
//			System.out.println("methodB에서 처리");
//		}
	}
	
	public static void methodC() throws Exception {
		Exception e = new Exception();
		throw e;
	}

	public static void main(String[] args) {
		try {
			methodA();
		} catch(Exception e) {
			System.out.println("메인에서 처리");
		}
	}
}
