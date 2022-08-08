package chapter12;

import java.util.LinkedList;

public class MemberLinkedList {
	private LinkedList<Member> linkedList;

	public MemberLinkedList() {
		this.linkedList = new LinkedList<Member>();
	}

	public void addMember(Member member) {
		linkedList.add(member);
	}

	public boolean removeMember(int memberID) {
		for (int i = 0; i < linkedList.size(); i++) {
			Member member = linkedList.get(i);
			int tmpID = member.getMemberID();
			if (tmpID == memberID) {
				linkedList.remove(i);
				return true;
			}
		}
		System.out.println(memberID + "가 존재하지 않습니다.");
		return false;
	}

	public void showAllMember() {
		for (Member member : linkedList) {
			System.out.println(member);
		}
		System.out.println();
	}

}
