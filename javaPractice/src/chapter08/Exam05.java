package chapter08;

interface MyInterface {
//	아래 코드 모드 public static final이 자동으로 붙음
	int w = 10;
	static int x = 20;
	final int y = 30;
	public static final int z = 40;
}

public class Exam05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		MyInterface mi = new MyInterface(); //인터페이스는 객체 생성이 안 됨 
//		MyInterface.w =50; //상수라서 값 변경도 안 됨
		System.out.println("w = " + MyInterface.w);
		System.out.println("x = " + MyInterface.x);
		System.out.println("y = " + MyInterface.y);
		System.out.println("z = " + MyInterface.z);
	}

}
