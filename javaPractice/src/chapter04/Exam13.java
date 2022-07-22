package chapter04;

import java.util.Scanner;

public class Exam13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int  i;
		
		while(true) {
			System.out.print("더할 숫자를 입력하세요 (종료하려면 0입력) : ");
			i = sc.nextInt();
			if(i == 0) {
				break;
			}
			sum += i;
		}
		System.out.println("현재까지의 총합 : " + sum);
	}

}
