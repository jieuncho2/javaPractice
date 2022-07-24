package chapter05;

import java.util.Scanner;

public class Exam00 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		System.out.println("우하변이 직각인 정삼각형을 표시합니다.");
		System.out.print("몇 단: ");
		int n = sc.nextInt();
		int total = n;
		
		for(int i = 1; i <= n; i++) {
			putStars(i, total);
			System.out.println();
		}
		
	}

	private static void putStars(int n, int total) {
		// TODO Auto-generated method stub
		for(int i = 1; i <= total; i++) {
			if(i <= total - n) {
				System.out.print(" ");
			}
			else {
				System.out.print("*");
			}
		}
	}
}
