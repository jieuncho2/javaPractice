package chapter08;

class OuterClass2 {
	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;

	public OuterClass2() {
		inClass = new InClass();
	}

	class InClass {
		int inNum = 100;

		void inTest() {
			System.out.println("OuterClass2 num = " + num + "(외부 클래스의 인스턴스 변수)");
			System.out.println("OuterClass2 sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
		}
//		static void sTest() { //에러 발생 내부 인스턴스 클래스에는 static 을 사용할 수 없음
//			
//		}
	}

	public void usingClass() {
		inClass.inTest();
	}

	static class InstaticClass {

		int inNum = 100;
		static int sInNum = 200;

		void inTest() {
//			num += 10; //외부 클래스의 인스턴스 변수는 사용할 수 없음
			System.out.println("InStaticClass inNum + " + sInNum + "(내부 클래스의 인스턴스 변수 사용)");
			System.out.println("InStaticClass sInNum + " + sNum + "(내부 클래스의 스태틱 변수 사용)");
			System.out.println("OuterClass sNum + " + sNum + "(외부 클래스의 스태틱 변수 사용)");
		}

		static void sTest() {
//			num += 10; //외부 클래스의 인스턴스 변수는 사용할 수 없음
//			inNum += 10; //내부 클래스의 인스턴스 변수는 사용할 수 없음
			System.out.println("OuterClass sNum + " + sNum + "(외부 클래스의 스태틱 변수 사용)");
			System.out.println("InStaticClass sNum + " + sInNum + "(내부 클래스의 스태틱 변수 사용)");
		}
	}
}

public class Exam13 {
	public static void main(String[] args) {
		OuterClass2 outClass = new OuterClass2();
		System.out.println("외부 클래스 이용하여 내부 클래스 기능 호출");
		outClass.usingClass();
		System.out.println();

		OuterClass2.InClass inClass = outClass.new InClass();
		System.out.println("외부 클래스 변수를 이용하여 내부 클래스 생성");
		inClass.inTest();

		System.out.println();

		OuterClass2.InstaticClass sInClass = new OuterClass2.InstaticClass();
		System.out.println("정적 내부 클래스 일반 메서드 호출");
		sInClass.inTest();
		System.out.println();

		System.out.println("정적 내부 클래스의 스태틱 메소드 호출");
		OuterClass2.InstaticClass.sTest();
	}
}
