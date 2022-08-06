package chapter07;

public class MyPoly3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		instanceof 연산자
//		a instaceof B: a는 B의 객체이다
		FireEngine fe = new FireEngine();

		if (fe instanceof FireEngine) { // fe는 FireEngine의 객체이다
			System.out.println("This is a FireEngine instance");
		}
		if (fe instanceof Car2) { // fe는 Car2의 객체이다
			System.out.println("This is a Car instance");
		}
		if (fe instanceof Object) { // fe는 Object의 객체이다
			System.out.println("This is a Object instance");
		}
		System.out.println();

		Car2 polyFe = new FireEngine(); // 다형성 활용해서 참조 변수 많듦
	}

}
