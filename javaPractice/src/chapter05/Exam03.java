package chapter05;

public class Exam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[] {10, 20, 4, 25, 18};
		int[] b = {1, 2, 3, 4, 5, 6, 7};
		int[] c = new int[10];
		for(int i = 0; i < c.length; i++) {
			c[i] = i;
		}
		System.out.println(c.length);
		for(int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
		System.out.println();
		for(int d: c) {
			System.out.println(d);
		}
	}

}
