package chapter05;

import java.util.Scanner;

public class Exam0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		System.out.println("좌하변이 직각인 정삼각형을 표시합니다.");
		System.out.print("몇 단: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			putStars(i);
			System.out.println();
		}
		
	}  

	private static void putStars(int n) {
		// TODO Auto-generated method stub
		for(int j = n; j > n; j--) {
			System.out.print(" ");
		}
		for(int j = 1; j <=n; j++) {
			System.out.print("*");
		}
	}

}
