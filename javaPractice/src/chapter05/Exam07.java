package chapter05;

public class Exam07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] number = new int[10];
		for(int i = 0; i< number.length; i++) {
			number[i] = i;
			System.out.println(number[i] + " ");
		}
		System.out.println();
		
		for(int i = 0; i< 10000; i++) {
			int n = (int)(Math.random() * 10);
			int temp = number[0];
			number[0] = number[n];
			number[n] = temp;
		}
		for(int i = 0; i< number.length; i++) {
			System.out.println(number[i] + " ");
		}
	}

}
