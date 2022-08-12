package interface0;

interface Calc {
	double PI = 3.14;
	int ERROR = -999999999;

	int add(int num1, int num2);

	int substract(int num1, int num2);

	int times(int num1, int num2);

	int divide(int num1, int num2);

	default void description() {
		System.out.println("정수 계산기를 구현합니다.");
		myMethod();
	}

	static int total(int[] arr) {
		int total = 0;
		for (int i : arr) {
			total += i;
		}
		myStaticMethod();
		return total;
	}

	private void myMethod() {
		System.out.println("private 메서드입니다.");
	}

	private static void myStaticMethod() {
		System.out.println("private static 메서드입니다.");
	}
}

abstract class Calculator implements Calc {

	@Override
	public int add(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 + num2;
	}

	@Override
	public int substract(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 - num2;
	}

}

class CompleteCalc extends Calculator {

	@Override
	public int times(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		// TODO Auto-generated method stub
		if (num2 != 0) {
			return num1 / num2;
		} else {
			return Calc.ERROR;
		}
	}

	public void showInfo() {
		System.out.println("Calc 인체페이스를 구현하였습니다.");
	}

}

public class CalcTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 10;

		CompleteCalc calc = new CompleteCalc();
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.substract(num1, num2));
		System.out.println(calc.times(num1, num2));
		System.out.println(calc.divide(num1, num2));
		calc.showInfo();
		calc.description();

		int[] arr = { 1, 2, 3, 4, 5 };
		System.out.println(Calc.total(arr));
	}

}
