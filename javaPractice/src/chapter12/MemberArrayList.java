package chapter12;

import java.util.ArrayList;

public class MemberArrayList {
	private ArrayList<Member> arrayList; //ArrayList 선언

	public MemberArrayList() {
		this.arrayList = new ArrayList<Member>(); //Member형으로 선언한 ArrayList 생성
	}

	public void addMember(Member member) {
		arrayList.add(member); //회원을 추가
	}

	public boolean removeMember(int memberID) {
		for (int i = 0; i < arrayList.size(); i++) {
			Member member = arrayList.get(i); //get() 메서드로 회원을 순차적으로 가져옴
			int tmpID = member.getMemberID();
			if (tmpID == memberID) { //회원 아이디와 매개변수가 일치하면
				arrayList.remove(i); //해당 회원을 삭제
				return true;
			}
		}
		System.out.println(memberID + "가 존재하지 않습니다."); //반복문을 돌려서 해당 아이디를 찾지 못한 경우
		return false;
	}

	public void showAllMember() { //전체 회원을 출력하는 메소드
		for (Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}

}
