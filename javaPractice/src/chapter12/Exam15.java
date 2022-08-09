package chapter12;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Exam15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new HashMap<>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("while", 92);
		
		String name = null;
		int maxScore = 0;
		int totalScore = 0;
		
		Iterator<String> ir = map.keySet().iterator();
		while(ir.hasNext()) {
			String key = ir.next();
			totalScore += map.get(key);
			if(map.get(key)>maxScore) {
				maxScore = map.get(key);
				name = key;
			}
		}
		
		System.out.println("평균 점수: " + totalScore/map.size());
		System.out.println("최고 점수: " + maxScore);
		System.out.println("최고 점수를 받은 아이디: " + name);
	} 

}
