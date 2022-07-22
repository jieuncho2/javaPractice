package chapter05;

public class Exam17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] a = {"Java", "Hello", "Programming"};
		
		int j = 0;
		for(String i : a) {
			System.out.println(i);
			System.out.println(j);
		}
		
		int[] b = {1, 2, 3, 4, 5};
		for(int i : b) {
			System.out.print(i);
		}
	}
}