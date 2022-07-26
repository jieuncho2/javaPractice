package chapter07;

class Student2 {
	void learn() {
		System.out.println("배우기");
	}

	void eat() {
		System.out.println("밥먹기");
	}

	void say() {
		System.out.println("선생님 안녕하세요!"); //보통의 학생
	}
}

class Leader extends Student2 {
	void lead() {

	}

	@Override
	void say() {
		// TODO Auto-generated method stub
		System.out.println("선생님께 인사"); //오버라이딩
	}

}

public class Exam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Leader leader1 = new Leader();
		leader1.eat();
		leader1.say();
	}

}
