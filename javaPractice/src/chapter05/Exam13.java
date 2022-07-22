package chapter05;

public class Exam13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {
						{1, 2, 3},
						{4, 5, 6}
					};
		
		System.out.println("행: " + arr.length);
		System.out.println("열: " + arr[0].length);
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j <arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}