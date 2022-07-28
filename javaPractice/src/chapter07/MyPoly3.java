package chapter07;

public class MyPoly3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		instanceof 연산자
//		a instaceof B a는 B의 객체이다
		FireEngine fe = new FireEngine();

		if (fe instanceof FireEngine) {
			System.out.println("This is a FireEngine instance");
		}
		if (fe instanceof Car2) {
			System.out.println("This is a Car instance");
		}
		if (fe instanceof Object) {
			System.out.println("This is a Object instance");
		}
		System.out.println();

		Car2 polyFe = new FireEngine();
	}

}
