package test_1st;

import java.util.Scanner;

public class ShopCart {

	static Scanner stdIn = new Scanner(System.in);
	int[] arr = new int[4];

	public void selectProduct() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			System.out.print("구매할 상품의 번호를 입력해 주십시요.>> ");
			int b = stdIn.nextInt();
			System.out.print("상품의 구매 갯수를 입력해 주십시요.>> ");
			int c = stdIn.nextInt();
			arr[b] += c;
			if (arr[b] > 10) {
				System.out.println("저장 가능한 개수를 초과했습니다.");
				arr[b] -= c;
			} else {
				
			}
			System.out.println("상점에서 상품을 더 구매 하시겠습니까?");
			System.out.print("더 구매를 원하시면 Y, 그만 쇼핑하실려면 N을 입력해 주십시오.>>> ");
			String a = stdIn.next();
			if (a.equals("Y")) {

			} else if (a.equals("N")) {
				break;
			} else {
				System.out.println("처음부터 시작합니다.");
				selectProduct();
			}
		}

	}

	public void printCart() {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				continue;
			} else {
				System.out.println("상품번호: " + i + ", 갯수: " + arr[i]);
			}
		}
	}

}
