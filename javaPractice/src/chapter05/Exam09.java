package chapter05;

public class Exam09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] number = new int[10];
		for(int i = 0; i < number.length; i++) {
			System.out.println(number[i] = (int)(Math.random() * 10));
		}
		System.out.println();
		
		for(int i = 0; i < number.length; i++) {
			boolean changed = false;
			for(int j = 0; j < number.length - 1 - i; j++) {
				int temp = number[j];
				number[j] = number[j+1];
				number[j+1] = temp;
				changed = true;
			}
		}
		//if(!changed) break;
		
	}
}