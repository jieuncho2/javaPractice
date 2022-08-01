package test_1st;

public class Member {
	private final String memberId;
	private String password;
	private String name;
	private String address;
	private String email;

	Member(String memberId, String password, String name) {
		this.memberId = memberId;
		this.password = password;
		this.name = name;
	}

	String getMemberId() {
		return memberId;
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
		return "아이디: " + memberId + ", 이름: " + name + ", 주소: " + address + ", 이메일: " + email;
	}

}
