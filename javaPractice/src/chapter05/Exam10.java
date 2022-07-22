package chapter05;

import java.util.Arrays;

public class Exam10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int range = 6;
		int[] numbers = new int[range];
		for(int i = 0; i < numbers.length; i++) {
			int temp = (int)(Math.random()*45)+1;
			boolean result = true;
			for(int n : numbers) {
				if(n==temp) {
					System.out.println(temp + "은 중복값입니다.");
					result = false;
				}
			}
			if(result) {
				numbers[range-1] = temp;
				range--;
			}
			else {
				i--;
			}
		} 
		System.out.println(Arrays.toString(numbers));
	}
}