package chapter06;

class MyMath2 {
	
	static int add(int a, int b) {
		System.out.println("static add() 실행");
		return a + b;
	}

	static int substract(int a, int b) {
		return a - b;
	}

	static int multiply(int a, int b) {
		return a * b;
	}

	static double divide(double a, double b) {
		return a / b;
	}
}

public class Exam13_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyMath mm = new MyMath();
		int result1 = mm.add(200, 100);
		int result2 = mm.substract(200, 100);
		int result3 = mm.multiply(200, 100);
		double result4 = mm.divide(200.0, 100.0);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
	}

}
