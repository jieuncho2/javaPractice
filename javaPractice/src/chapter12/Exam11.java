package chapter12;

import java.util.TreeSet;

public class Exam11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> treeSet = new TreeSet<String>();
		
		treeSet.add("홍길동");
		treeSet.add("강감찬");
		treeSet.add("이순신");
		treeSet.add("강감찬");
		
		for(String str : treeSet) {
			System.out.println(str);
		}
	}

}
