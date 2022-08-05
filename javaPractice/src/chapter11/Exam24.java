package chapter11;

class Point {
	int x;
	int y;

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "X = " + x + ", " + "y = " + y;
	}

}

class Circle implements Cloneable {
	Point point;
	int radius;

	public Circle(int x, int y, int radius) {
		point = new Point(x, y);
		this.radius = radius;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "원점은 " + point + "이고, 반지름은 " + radius + "입니다.";
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class Exam24 {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		Circle c = new Circle(10, 20, 30);
		Circle copyc = (Circle)c.clone();
		
		System.out.println(c);
		System.out.println(System.identityHashCode(c));
		System.out.println(copyc);
		System.out.println(System.identityHashCode(copyc));
	}

}
