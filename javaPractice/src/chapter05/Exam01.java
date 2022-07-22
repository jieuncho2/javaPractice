package chapter05;

public class Exam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score_001= 95;
		int score_002= 76;
		int score_003= 67;
		int score_004= 56;
		int score_005= 87;
		int total = score_001 + score_002 + score_003 + score_004 + score_005;
		double avg = (double) total / 5;
		System.out.println("총점: " + total + " 평균: " + avg);
		
		total = 0;
		int[] score = {95, 76, 67, 56, 87};
		for(int i = 0; i < score.length; i++) {
			total += score[i];
		}
		avg = (double) total / 5;
		System.out.println("총점: " + total + " 평균: " + avg);
	}

}
