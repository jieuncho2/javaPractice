package chapter07;

class Parent{
	int x = 10;
}

class Child extends Parent{
	void mathod() {
		System.out.println("x = " + x);
		System.out.println("this.x = " + this.x);
		System.out.println("super.x = " + super.x);
	}
}

public class Exam04 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();
		c.mathod();
	}
}
