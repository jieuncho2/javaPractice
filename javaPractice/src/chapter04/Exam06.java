package chapter04;

public class Exam06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 3 == 0) {
				sum += i;
			}
		}
		System.out.println("3의 배수의 합: " + sum);
		
		int num = 1;
		int sum2 = 0;
		while(num <= 100) {
			if(num % 3 == 0) {
				sum2 += num;
			}
			num++;
		}
		System.out.println("3의 배수의 합: " + sum2);
	}

}
