package chapter12;

import java.util.ArrayList;
import java.util.List;

public class Exam03 {

//String 객체를 저장하는 ArrayList
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();

		//String 객체 저장
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("iBATIS");

		int size = list.size(); //저장된 총 객체 수 얻기
		System.out.println("총 객체 수: " + size);
		System.out.println();

		String skill = list.get(2); //2번 인덱스에 저장된 객체 얻기
		System.out.println("2: " + skill);
		System.out.println();

		//저장된 객체 출력
		for (int i = 0; i < list.size(); i++) { //저장된 갯수만큼 반복
			String str = list.get(i);
			System.out.println(i + ": " + str);

		}

		System.out.println();
		for (String str : list) { //foreach로도 출력 가능
			System.out.println(str);
		}
		System.out.println();

		list.remove(2); //2번 인덱스 Database 삭제
		list.remove(2); //2번 인덱스 Servlet/JSP 삭제
		list.remove("iBATIS");

		for (int i = 0; i < list.size(); i++) { //저장된 갯수만큼 반복
			String str = list.get(i);
			System.out.println(i + ": " + str);

		}

	}

}
