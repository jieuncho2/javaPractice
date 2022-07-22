package chapter06;

class Cars {
	static int wheel = 4;
	int speed;
}

public class Exam11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Cars.wheel); // 클래스 변수 접근 가능
		// System.out.println(Cars.speed); //인스턴스 변수 접근 불가!!
		System.out.println();

		Cars myCar1 = new Cars();

		System.out.println(Cars.wheel);
		System.out.println(myCar1.speed);
		System.out.println();

		Cars myCar2 = new Cars();

		System.out.println("<변경 전>");
		System.out.println("myCar1.speed: " + myCar1.speed);
		System.out.println("myCar2.speed: " + myCar2.speed);
		System.out.println("myCar1.wheel: " + myCar1.wheel);
		System.out.println("myCar2.wheel: " + myCar2.wheel);
		System.out.println();

		myCar2.speed = 100;
		myCar2.wheel = 5;
		System.out.println("<변경 후>");
		System.out.println("myCar1.speed: " + myCar1.speed);
		System.out.println("myCar2.speed: " + myCar2.speed);
		System.out.println("myCar1.wheel: " + myCar1.wheel);
		System.out.println("myCar2.wheel: " + myCar2.wheel);
	}

}
