package chapter12;

import java.util.ArrayList;
//ArrayList: 배열에서 발전된 형태

public class Exam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add("A");
		list.add("C");
		list.add("E");
		list.add("G");
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
