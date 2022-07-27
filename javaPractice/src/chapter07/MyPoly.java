package chapter07;

class X {
	public String toString() {
		return "Class X";
	}
}

class Y extends X {
	public String toString() {
		return "Class Y";
	}
}

public class MyPoly {
	static void print(Object obj) {
		System.out.println(obj);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		X x = new X();
		Y y = new Y();
		int[] c = new int[5];
		double[] d = new double[5];

		print(x);
		print(y);
		print(c);
		print(d);
	}

}