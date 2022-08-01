package chapter08;
class OuterClass1{
	void a() {
		System.out.println("method a");
	}
	void b() {
		
	}
}
public class Exam12 {
	public static void main(String[] args) {
		OuterClass1 o = new OuterClass1() {
			void a() {
				System.out.println("새롭게 정의된 익명 클래스의 메서드입니다.");
			}
		};
		o.a();
		OuterClass1 ok = new OuterClass1();
		o.a();
		ok.a();
	}
}
