package chapter05;

public class Exam15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {
						{95, 86},
						{83, 92, 96},
						{78, 83, 93, 87, 88}
					};
		
		int total = 0;
		double average = 0.0;
		int num = 0;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j <arr[i].length; j++) {
				total += arr[i][j];
				num++;
			}
		}
		
		average = (double)total / num; 
		
		System.out.println("total = " + total);
		System.out.println("average = " + average);
	}
}