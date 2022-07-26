package chapter07;

class A {
	void methodA() {
		System.out.println("methodA");
	}
}

class B extends A {
	void methodB() {
		System.out.println("methodB");
	}
}

public class Exam09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj = new B();
		obj.methodA();
//		obj.methodB(); //에러 발생
		
		B obj1 = new B();
		obj1.methodB(); //실행 가능
		
		A obj2 = obj1; //A 데이터 타입인 obj2에 obj1 대입
//		obj2.methodB(); //에러 발생
		
//		B obj2 = new A();
	}

}
