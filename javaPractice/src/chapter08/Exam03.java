package chapter08;

abstract class Shape {
	abstract void draw();
}

class Point extends Shape {

	public Point() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	void draw() { // 추상 메서드를 정의
		// TODO Auto-generated method stub
		System.out.print("+");
	}

}

class Ractangle extends Shape {
	private int width;
	private int height;

	public Ractangle(int width, int height) {
		this.width = width;
		this.height = height;
		// TODO Auto-generated constructor stub
	}

	@Override
	void draw() {
		// TODO Auto-generated method stub
		for (int i = 0; i <= height; i++) {
			for (int j = 0; j <= width; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

public class Exam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Shape[] s = new Shape(); // 추상 클래스는 인스턴스로 할 수 없다
		
		Shape[] shapes = new Shape[2]; // 추상 클래스이자 부모 클래스로 데이터 타입을 설정
		shapes[0] = new Point();
		shapes[1] = new Ractangle(4, 3);

		for (Shape shape : shapes) {
			shape.draw();
			System.out.println();
		}
		for (int i = 0; i < shapes.length; i++) {
			shapes[i].draw();
			System.out.println();
		}
	}

}
