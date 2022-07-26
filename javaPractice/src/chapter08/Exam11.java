package chapter08;

class OuterClass {
	int a = 3;
	static int b = 4;

	class Inner {
		int c = 5;

		public void InnerMethod() {
			System.out.println("<Inner Class>");
		}
	}

	static class StaticInner {
		int d = 6;
		static int stat = 10;

		public static void staticMethod() {
			System.out.println("<Static inner>");
		}
	}
}

public class Exam11 {
	public static void main(String[] args) {
		OuterClass oc = new OuterClass();
		System.out.println("OuterClass의 a값 = " + oc.a);
		
//		static 변수라서 클래스명으로 접근 가능
		System.out.println("OuterClass의 b값 = " + oc.b);
		System.out.println("OuterClass의 StaticInner의 stat값 = " + OuterClass.StaticInner.stat);
//		System.out.println("OuterClass의 d값 = " + OuterClass.StaticInner.d); //접근 불가

		System.out.println("\n======= inner 클래스 접근하기 ========");
		OuterClass oc2 = new OuterClass();
		OuterClass.Inner i = oc2.new Inner(); //객체 생성
		System.out.println("Inner의 c값 = " + i.c);
		i.InnerMethod(); //<Inner Class>

		OuterClass.StaticInner si = new OuterClass.StaticInner(); //객체 생성
		System.out.println("StaicInner의 d값 = " + si.d);
		
//		객체를 사용해 접근
		si.staticMethod(); //<Static Inner>
		
//		클래스명으로도 접근 가능
		OuterClass.StaticInner.staticMethod(); //<Static Inner>
	}
}
