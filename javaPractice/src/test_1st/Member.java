package test_1st;

public class Member {
	private final String memberID;
	private String password;
	private String name;
	private String address;
	private String email;

	Member(String memberID, String password, String name) {
		this.memberID = memberID;
		this.password = password;
		this.name = name;
	}

	String getMemberID() {
		return memberID;
	}

	String getPassword() {
		return password;
	}

	void setAddress(String address) {
		this.address = address;
	}

	void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		System.out.println("회원 가입 정보는 다음과 같습니다.");
		return "아이디: " + memberID + ", 이름: " + name + ", 주소: " + address + ", 이메일: " + email;
	}

}
