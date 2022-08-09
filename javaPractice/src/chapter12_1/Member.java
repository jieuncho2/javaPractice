package chapter12_1;

public class Member {
	private String memberID;
	private String memberName;

	public Member(String memberID, String memberName) {
		super();
		this.memberID = memberID;
		this.memberName = memberName;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return memberName + " 회원님의 아이디는 " + memberID + "입니다.";
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof Member) {
			Member member = (Member) obj;
			if (this.memberID == member.memberID) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Integer.parseInt(this.memberID);
	}

}