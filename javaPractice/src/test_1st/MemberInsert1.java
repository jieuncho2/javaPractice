package test_1st;

import java.util.Scanner;

public class MemberInsert1 {

	static Scanner stdIn = new Scanner(System.in);

	String memberId, password, name, address, email;

	public MemberInsert1(String memberId, String password, String name) {
		// TODO Auto-generated constructor stub
		Member m = new Member(memberId, password, name);
	}

	public void updateAddInfo() {
		// TODO Auto-generated method stub
		System.out.println("추가 정보를 입력하시겠습니까?");
		System.out.print("추가 정보를 입력하시려면 Y, 그만 하실려면 N을 입력해 주십시요.>>> ");
		String a = stdIn.nextLine();
		if (a.equals("Y")) {
			System.out.print("주소를 입력해 주십시요.>>> ");
			this.address = stdIn.nextLine();
			System.out.print("이메일 입력해 주십시요.>>> ");
			this.email = stdIn.nextLine();
		} else if (a.equals("N")) {
			printMemberInfo();
		} else {
			updateAddInfo();
		}
	}

	public String printMemberInfo() {
		// TODO Auto-generated method stub
		return toString();
	}

	public void login() {
		// TODO Auto-generated method stub
		System.out.print("아이디를 입력해 주세요 >>> ");
		String inputId = stdIn.nextLine();
		System.out.print("비밀번호를 입력해 주세요 >>> ");
		String inputPw = stdIn.nextLine();
		if (inputId.equals(memberId)) {
			if (inputPw.equals(password)) {
				System.out.println("로그인 되었습니다.");
			} else {
				System.out.println("로그인 정보가 정확하지 않습니다.");
				System.out.println();
				login();
			}
		} else {
			System.out.println("로그인 정보가 정확하지 않습니다.");
			System.out.println();
			login();
		}
	}

}
