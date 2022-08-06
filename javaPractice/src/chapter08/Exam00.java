package chapter08;

abstract class MyAbsParent {
	protected String name = "MyAbsParents";

//	일반 메서드
	public void show() {
		System.out.println(name);
	}

//	구현부가 없는 추상 메서드
	public abstract void abstractShow();
}

class MyChild extends MyAbsParent {

	@Override
	public void abstractShow() {
		// TODO Auto-generated method stub
		System.out.println("MyChild's abstractShow()");
	}

}

public class Exam00 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyChild child = new MyChild();
		child.show(); // 상속받은 일반 메서드 호출
		child.abstractShow(); // 재정의 된 추상 메서드
	}

}
