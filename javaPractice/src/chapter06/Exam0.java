package chapter06;

import java.util.Scanner;

public class Exam0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int personNum = 3;
		int[] height = new int[personNum];
		int[] weight = new int[personNum];
		int[] age = new int[personNum];

		for (int i = 0; i < personNum; i++) {
			System.out.print("[" + (i + 1) + "] ");
			System.out.print("신장: ");
			height[i] = sc.nextInt();
			System.out.print("	체중: ");
			weight[i] = sc.nextInt();
			System.out.print("	나이: ");
			age[i] = sc.nextInt();
		}

		int maxHeight = height[0];
		if (height[1] > maxHeight) {
			maxHeight = height[1];
		}
		if (height[2] > maxHeight) {
			maxHeight = height[2];
		}

		int maxWeight = weight[0];
		if (weight[1] > maxWeight) {
			maxWeight = weight[1];
		}
		if (weight[2] > maxWeight) {
			maxWeight = weight[2];
		}

		int maxAge = age[0];
		if (age[1] > maxAge) {
			maxAge = age[1];
		}
		if (age[2] > maxAge) {
			maxAge = age[2];
		}

		System.out.println("신장의 최대값은 " + maxHeight + "입니다.");
		System.out.println("체중의 최대값은 " + maxWeight + "입니다.");
		System.out.println("나이의 최대값은 " + maxAge + "입니다.");
	}

}
