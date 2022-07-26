package chapter07;

class Parent2{
	int x = 10;
}

class Child2 extends Parent2{
	int x = 20;
	void mathod() {
		int x = 30; //지역변수
		System.out.println("x = " + x); //지정된 게 없어서 가장 가까운 곳에서 선언이 된 지역변수를 불러옴
		System.out.println("this.x = " + this.x); //객체 기준
		System.out.println("super.x = " + super.x); //부모 클래스 기준
	}
}

public class Exam04_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child2 c = new Child2();
		c.mathod();
	}
}
