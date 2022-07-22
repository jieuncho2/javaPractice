package chapter04;

public class Exam08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int sum = 0;
		
		for(num = 1; num <= 10; num++){
			sum += num;
		}
		System.out.println("1부터 10 까지의 합은 " + sum + "입니다.");
		
		int num2 = 1;
		int sum2 = 0;
		
		while(num2 <=10){
			sum2 += num2;
			num2++;
		}
		System.out.println("1부터 10 까지의 합은 " + sum2 + "입니다.");
	}

}
