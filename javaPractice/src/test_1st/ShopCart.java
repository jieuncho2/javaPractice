package test_1st;

import java.util.Scanner;

public class ShopCart {

	static Scanner stdIn = new Scanner(System.in);
	int inputNum;
	int inputAmt;
	
	public void selectProduct() {
		// TODO Auto-generated method stub
		System.out.print("구매할 상품의 번호를 입력해 주십시요.>> ");
		inputNum = stdIn.nextInt();
		System.out.print("상품의 구매 갯수를 입력해 주십시요.>> ");
		inputAmt = stdIn.nextInt();
		System.out.println("상점에서 상품을 더 구매 하시겠습니까?");
		System.out.print("더 구매를 원하시면 Y, 그만 쇼핑하실려면 N을 입력해 주십시요.>>> ");
		String b = stdIn.next();
		if (b.equals("Y")) {
			selectProduct();
		} else if (b.equals("N")) {
			printCart();
		} else {
			selectProduct();
		}
		
	}

	public void printCart() {
		// TODO Auto-generated method stub
		System.out.println("상품번호: " + inputNum + "갯수: " + inputAmt);
	}

}
