package test_1st;

import java.util.Scanner;

public class ShopCart3 {

	static Scanner stdIn = new Scanner(System.in);
	int[][] arr = new int[10][2];
	
	public void selectProduct() {
		// TODO Auto-generated method stub
		for(int i = 0; i < 10; i++) {
				System.out.print("구매할 상품의 번호를 입력해 주십시요.>> ");
				arr[i][0] = stdIn.nextInt();
				System.out.print("상품의 구매 갯수를 입력해 주십시요.>> ");
				arr[i][1] = stdIn.nextInt();
				
				System.out.println("상점에서 상품을 더 구매 하시겠습니까?");
				System.out.print("더 구매를 원하시면 Y, 그만 쇼핑하실려면 N을 입력해 주십시요.>>> ");
				String b = stdIn.next();
				if(b.equals("Y")) {
					continue;
				} else if (b.equals("N")) {
					break;
				}
		}
		
	}

	public void printCart() {
		// TODO Auto-generated method stub
		for(int i = 0; i < arr.length; i++) {
				System.out.println("상품번호: " + arr[i][0] + ", 갯수: " + arr[i][1]);
		}
	}

}
