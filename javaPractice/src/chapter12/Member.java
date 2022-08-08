package chapter12;

public class Member implements Comparable<Member> {
	private int memberID;
	private String memberName;

	public Member(int memberID, String memberName) {
		super();
		this.memberID = memberID;
		this.memberName = memberName;
	}

	public int getMemberID() {
		return memberID;
	}

	public void setMemberID(int memberID) {
		this.memberID = memberID;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return memberName + " 회원님의 아이디는 " + memberID + "입니다.";
	}

	@Override
	public int compareTo(Member member) {
		// TODO Auto-generated method stub
		return (this.memberID - member.memberID);
	}

}