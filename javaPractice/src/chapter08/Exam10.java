package chapter08;
class A {
	static class StaticInner{
		
	}
	class InstanceInner{
		
	}
	StaticInner st1 = new StaticInner();
	
	InstanceInner ii1 = new InstanceInner();
	
	static void StaticMethod() {
		StaticInner st2 = new StaticInner();
		
//		스태틱 멤버는 인스턴스 멤버에 접근 불가
//		InstanceInner ii2 = new InstanceInner(); //에러 발생
	}
	void instanceMethod() {
		StaticInner st3 = new StaticInner();
		
		InstanceInner ii3 = new InstanceInner();
	}
}
public class Exam10 {
	public static void main(String[] args) {
		
	}
}
