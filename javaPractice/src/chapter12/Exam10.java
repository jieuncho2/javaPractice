package chapter12;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Exam10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");
		set.add("iBATIS");
		
		int size = set.size();
		System.out.println("총 객체수 : " + size);
		
		System.out.println("foreach문으로 출력 시작");
		for(String s : set) {
			System.out.println("\t" + s);
		}
		System.out.println();
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		
		set.remove("JDBC");
		set.remove("iBATIS");
		
		System.out.println();
		System.out.println("총 객체수 : " + size);
		
		System.out.println("foreach문으로 출력 시작");
		for(String s : set) {
			System.out.println("\t" + s);
		}
		System.out.println();
		
		set.clear();
		if(set.isEmpty()) {
			System.out.println("비어 있음");
		}
	}

}
