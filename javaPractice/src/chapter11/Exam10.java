package chapter11;

import java.util.Scanner;

class LoginException extends Exception {

	public LoginException(String msg) {
		// TODO Auto-generated constructor stub
		super(msg);
	}

}

class MemberInsert1 {

	Scanner stdIn = new Scanner(System.in);
	String memberID = "abc";
	String password = "1234";

	public void login() throws LoginException {
		// TODO Auto-generated method stub
		System.out.print("아이디를 입력해 주세요 >>> ");
		String inputID = stdIn.nextLine();
		System.out.print("비밀번호를 입력해 주세요 >>> ");
		String inputPW = stdIn.nextLine();
		if (inputID.equals(memberID)) {
			if (inputPW.equals(password)) {
				System.out.println("로그인 되었습니다.");
			} else {
				throw new LoginException("로그인 정보가 정확하지 않습니다.");
			}
		} else {
			throw new LoginException("로그인 정보가 정확하지 않습니다.");
		}
	}

}

public class Exam10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberInsert1 m = new MemberInsert1();

		System.out.println("02. 로그인 시작");
		try {
			m.login();
		} catch (LoginException e) {
			e.printStackTrace();
//			System.out.println(e.getMessage());
		}
		System.out.println("02. 로그인 종료");
	}

}
