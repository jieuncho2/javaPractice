package test_1st;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner stdIn = new Scanner(System.in);
		ShopProduct sp = new ShopProduct();
		ShopCart sc = new ShopCart();

		System.out.println("01. 회원 가입 시작");
		System.out.println("회원 가입 정보를 입력하세요.");
		
		System.out.print("아이디: ");
		String memberID = stdIn.nextLine();
		System.out.print("비밀 번호: ");
		String password = stdIn.nextLine();
		System.out.print("이름: ");
		String name = stdIn.nextLine();

		MemberInsert m = new MemberInsert(memberID, password, name);
		m.updateAddInfo();
		m.printMemberInfo();
		System.out.println("회원 가입해 주셔서 감사합니다.");
		System.out.println("01. 회원 가입 종료");
		System.out.println();

		System.out.println("02. 로그인 시작");
		m.login();
		System.out.println("02. 로그인 종료");
		System.out.println();
		
		System.out.println("03. 장바구니 시작");
		System.out.println("상점에서 구매 가능한 상품입니다.");
		sp.printProduct();
		sc.selectProduct();
		System.out.println("장바구니에 담은 상품은 아래와 같습니다.");
		sc.printCart();
		System.out.println("03. 장바구니 종료");
		System.out.println();
		
	}

}
