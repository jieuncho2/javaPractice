package chapter10;

import java.util.ArrayList;

public class Exam37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		System.out.print("초기 상태: ");
		System.out.println(list);
		
		System.out.print("인덱스 1 위치에 B 추가");
		list.add(1, "B");
		System.out.println(list);
		
		System.out.print("인덱스 2 위치에 값 삭제: ");
		list.remove(2);
		System.out.println(list);
		
		System.out.println("인덱스 2번 위치의 값 반황: " + list.get(2));
	}

}
