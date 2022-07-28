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
	void draw() {
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
			for (int j = 0; j <= height; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

public class Exam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape[] shapes = new Shape[2];
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
