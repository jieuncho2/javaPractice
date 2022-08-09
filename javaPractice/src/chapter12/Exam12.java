package chapter12;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

//두 매개 변수를 비교하는 Comparator 인터페이스
//Comparator 역시 정렬을 구현하는 데 사용하는 인터페이스
//Comparator 인터페이스는 compare() 메서드를 구현해야 함
//compare() 메서드에는 매개 변수가 2개 전달
//compareTo() 메서드는 this와 전달된 매개변수를 비교했다면 compare() 메서드는 전달되는 두 매개 변수를 비교
//첫 번째 매개 변수가 더 클 떄 양수를 반환하여 오름차순으로 정렬
//
//일반적으로 Comparator 인터페이스보다는 Comparable 인터페이스를 더 많이 사용
//다만 어떤 클래스가 이미 Comparable 인터페이스를 구현한 경우에 이 클래스의 정렬 방식을 정의할 때 Comparator 인터페이스를 사용
//String 클래스가 Comparable 인터페이스를 구현했고 compareTo() 메서드는 오름차순을 구현

class MyCompare implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		// TODO Auto-generated method stub
		return (s1.compareTo(s2)) * (-1); //String 클래스의 compareTo() 메서드를 반대로
	}
	
}
public class Exam12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Set<String> set = new TreeSet<String>();
//		TreeSet 생성자에 Comparator을 구현한 객체를 매개 변수로 전달함
		Set<String> set = new TreeSet<String>(new MyCompare());
		
		set.add("aaa");
		set.add("bbb");
		set.add("ccc");
		
		System.out.println(set);
	}

}
