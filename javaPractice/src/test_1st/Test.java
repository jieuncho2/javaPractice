package test_1st;

import java.util.Scanner;

public class Test {

	static Scanner stdIn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ShopProduct sp = new ShopProduct();
		ShopCart sc = new ShopCart();

		System.out.println("01. 회원 가입 시작");
		System.out.println("아이디: ");
		String memberID = stdIn.nextLine();
		System.out.println("비밀 번호: ");
		String password = stdIn.nextLine();
		System.out.println("이름: ");
		String name = stdIn.nextLine();

		MemberInsert m = new MemberInsert(memberID, password, name);
		m.updateAddInfo();
		m.printMemberInfo();
		System.out.println("회원 가입해 주셔서 감사합니다.");
		System.out.println("01. 회원 가입 종료");
		System.out.println("");

		System.out.println("02. 로그인 시작");
		System.out.println("로그인 정보를 입력해 주세요.");
		m.login();
		System.out.println("02. 로그인 종료");
	}

}
