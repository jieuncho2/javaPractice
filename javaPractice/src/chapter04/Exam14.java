package chapter04;

import java.util.Scanner;

public class Exam14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int money = 10000;
		System.out.println("현재 가진 돈은 " + money + "원입니다.");
		
		while(true) {
			System.out.print("얼마를 사용하시겠습니까? ");
			int i = sc.nextInt();
			
			if(!(i >= 0 && i <= money)) {
				System.out.println("다시 입력해 주십시오.");
				continue;
			}
			
			money = money - i;
			System.out.printf("이제 %d원이 남았습니다. \n", money);
			if(money == 0) {
				break;
			}
		}
		System.out.println("모든 돈을 사용했습니다. 종료.");


	}
}
