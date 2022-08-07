package chapter11;

import java.text.DecimalFormat;

public class Exam19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] pattern = { "###.###", "000.000", "-###.###", "000000.00%" }; //패턴의 배열
		
		double[] arr = { 1.3, 3.33, 124.243, 242 }; //아직 형식화되지 않은 수들의 배열
		
		for(int p = 0; p < pattern.length; p++) { //패턴마다 반복
			DecimalFormat d = new DecimalFormat(pattern[p]); //패턴을 매개 변수로 DecimalFormat 생성자를 실행
			System.out.println("<<<<<" + pattern[p] + ">>>>>"); //패턴을 보여 줌
			for(int i = 0; i < arr.length; i++) {
				System.out.println(d.format(arr[i])); //패턴에 맞춰 출력
			}
		}
	}

}
