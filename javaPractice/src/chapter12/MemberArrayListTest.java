package chapter12;

public class MemberArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberArrayList memberArrayList = new MemberArrayList();

		//새로운 회원 인스턴스 생성
		Member memberLee = new Member(1001, "이지원");
		Member memberSon = new Member(1002, "손민국");
		Member memberPark = new Member(1003, "박서원");
		Member memberHong = new Member(1004, "홍길동");

		//ArrayList에 회원 추가
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberSon);
		memberArrayList.addMember(memberPark);
		memberArrayList.addMember(memberHong);

		//전체 회원 출력
		memberArrayList.showAllMember();

		memberArrayList.removeMember(memberHong.getMemberID()); //홍길동 회원 삭제
		memberArrayList.showAllMember();
	}

}
