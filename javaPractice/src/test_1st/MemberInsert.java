package test_1st;

import java.util.Scanner;

public class MemberInsert {

	static Scanner stdIn = new Scanner(System.in);

	String memberID, password, name, address, email;

	public MemberInsert(String memberID, String password, String name) {
		// TODO Auto-generated constructor stub
		this.memberID = memberID;
		this.password = password;
		this.name = name;
	}

	public void updateAddInfo() {
		// TODO Auto-generated method stub
		System.out.println("추가 정보를 입력하시겠습니까?");
		System.out.println("추가 정보를 입력하시려면 Y, 그만 하실려면 N을 입력해 주십시요.>>> ");
		String a = stdIn.nextLine();
		if (a.equals("Y")) {
			System.out.print("주소를 입력해 주십시요.>>> ");
			this.address = stdIn.nextLine();
			System.out.print("이메일 입력해 주십시요.>>> ");
			this.email = stdIn.nextLine();
		} else if (a == "N") {
			printMemberInfo();
		}
	}

	public void printMemberInfo() {
		// TODO Auto-generated method stub
		System.out.println("회원가입정보는 아래와 같습니다.");
		System.out.println("아이디: " + memberID + ", 이름: " + name + ", 주소:" + address + ", 이메일: " + email);
	}

	public void login() {
		// TODO Auto-generated method stub
		System.out.println("아이디를 입력해 주세요 >>>");
		String inputID = stdIn.nextLine();
		System.out.println("비밀번호를 입력해 주세요 >>>");
		String inputPW = stdIn.nextLine();
		if (inputID.equals(memberID)) {
			if (inputPW.equals(password)) {
				System.out.println("로그인 되었습니다.");
			} else {
				System.out.println("로그인 정보가 정확하지 않습니다.");
			}
		} else {
			System.out.println("로그인 정보가 정확하지 않습니다.");
		}
	}

}
