package chapter06;

import java.util.Scanner;

public class Exam16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("자동차의 테이터를 입력하세요.");
		System.out.println("이름은: ");
		String name = sc.next();
		System.out.println("차 너비는: ");
		int width = sc.nextInt();
		System.out.println("차 높이는: ");
		int height = sc.nextInt();
		System.out.println("차 길이는: ");
		int length = sc.nextInt();
		System.out.println("차 연료량은: ");
		double fuel = sc.nextDouble();

		CarJ myCar = new CarJ(name, width, height, length, fuel);

		while (true) {
			System.out.println("현재 위치 (" + myCar.getX() + ", " + myCar.getY() + ") 남은 연료 " + myCar.getFuel());

			System.out.println("이동합니까? [0-No 1-Yes]");
			if (sc.nextInt() == 0)
				break;

			System.out.println("x방향의 이동 거리: ");
			double dx = sc.nextDouble();
			System.out.println("y방향의 이동 거리: ");
			double dy = sc.nextDouble();

			if (!myCar.move(dx, dy))
				System.out.println("연료가 부족합니다!");
		}

	}

}
