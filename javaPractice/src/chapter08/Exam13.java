package chapter08;

class OuterClass2 {
//	인스턴스 내부 클래스
//	인스턴스 변수를 선언할 때와 같은 위치에 선언하며, 외부 클래스 내부에서만 생성하여 사용하는 객체를 말함
//	예를 들어 어떤 클래스 내에 여러 변수가 있고 이들 변수 중 일부를 모아 클래스로 표현할 수있음
//	이 클래스를 다른 외부 클래스에서 사용할 일이 없는 경우 내부 인스턴스 클래스로 정의
//	외부 클래스 객체를 먼저 생성하지 않고 인스턴스의 내부 클래스를 사용할 수 없음
	
	private int num = 10;
	private static int sNum = 20;
	private InClass inClass; //내부 클래스의 참조 변수 선언

	public OuterClass2() {
		inClass = new InClass(); //내부 클래스 생성
	}

	class InClass { //내부 클래스
		
		int inNum = 100;
//		static int sInNum = 200; //에러 발생 내부 인스턴스 클래스에는 static 사용을 할 수 없음

		void inTest() {
			System.out.println("OuterClass2 num = " + num + "(외부 클래스의 인스턴스 변수)");
			System.out.println("OuterClass2 sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
		}
//		static void sTest() { //에러 발생 내부 인스턴스 클래스에는 static 을 사용할 수 없음
//			
//		}
	}

	public void usingClass() {
		inClass.inTest(); //내부 클래스 변수를 사용하여 메서드 호출하기
	}

	static class InstaticClass { //static 내부 클래

		int inNum = 100;
		static int sInNum = 200;

		void inTest() { //정적 클래스의 일반 메서드
//			num += 10; //외부 클래스의 인스턴스 변수는 사용할 수 없음
			System.out.println("InStaticClass inNum + " + inNum + "(내부 클래스의 인스턴스 변수 사용)");
			System.out.println("InStaticClass sInNum + " + sInNum + "(내부 클래스의 스태틱 변수 사용)");
			System.out.println("OuterClass sNum + " + sNum + "(외부 클래스의 스태틱 변수 사용)");
		}

		static void sTest() { //정적 클래스의 static 메서드
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
		outClass.usingClass(); //내부 클래스 기능 호출
		System.out.println();

		OuterClass2.InClass inClass = outClass.new InClass();
		System.out.println("외부 클래스 변수를 이용하여 내부 클래스 생성"); //외부 클래스를 이용하여 내부 클래스 생성
		inClass.inTest();
		System.out.println();

//		외부 클래스 생성하지 않고 바로 정적 내부 클래스 생성
		OuterClass2.InstaticClass sInClass = new OuterClass2.InstaticClass();
		System.out.println("정적 내부 클래스 일반 메서드 호출");
		sInClass.inTest();
		System.out.println();

		System.out.println("정적 내부 클래스의 스태틱 메소드 호출");
		OuterClass2.InstaticClass.sTest();
	}
}
