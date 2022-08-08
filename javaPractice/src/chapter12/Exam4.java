package chapter12;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Exam4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		
		long startTime;
		long endTime;
		
		System.out.println("1. 중간에 추가하는 경우");
		startTime = System.nanoTime();
		for(int i = 0; i <10000; i++) {
			list1.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("  ArrayList 걸린 시간: " + (endTime - startTime) + "ns");
		
		startTime = System.nanoTime();
		for(int i = 0; i <10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println(" LinkedList 걸린 시간: " + (endTime - startTime) + "ns");
		
		System.out.println("2. 끝에 순차적으로 추가하는 경우");
		startTime = System.nanoTime();
		for(int i = 0; i <10000; i++) {
			list1.add(String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("  ArrayList 걸린 시간: " + (endTime - startTime) + "ns");
		
		startTime = System.nanoTime();
		for(int i = 0; i <10000; i++) {
			list2.add(String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println(" LinkedList 걸린 시간: " + (endTime - startTime) + "ns");
	}

}
