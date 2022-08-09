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
//	Comparable을 구현하기 때문에 오버라이딩
//	비교하는 두 값 중 this 값이 더 크면 양수를 반환하여 오름차순으로 정렬
//	메서드를 호출하는 객체가 인자로 넘어온 객체보다 작을 경우에는 음수, 크기가 동일하다면 0, 클 경우에는 양수를 리턴
//	return (this.memberID - member.memberID);
	public int compareTo(Member member) {
		// TODO Auto-generated method stub
		return (this.memberID - member.memberID) * (-1); //내림차순으로 정렬하기 위해 반환값을 음수로 만듦
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Member) {
			Member member = (Member)obj;
			if(this.memberID == member.memberID) { //매개변수로 받은 회원 아이디가 자신의 회원 아이디와 같다면 true 반환
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
		return memberID;
	}
	
}