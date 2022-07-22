package chapter05;

import java.util.Arrays;

public class Exam16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1, 2, 3, 4, 5, 6};
		int[] b = {0, 0, 0, 0, 0, 0, 0};
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
		System.arraycopy(a, 2, b, 3, 4);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
		for(int i = 0; i < b.length; i++) {
			if(b[i] != 0) {
				b[i] = 0;
			}
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
	}
}