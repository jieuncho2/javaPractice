package chapter09;

public class Exam10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[10];

		for (int i = 0; i < 10; i++) {
			arr[i] = i;
		}
		try {
			for (int i = 0; i < 11; i++) {
				System.out.println(arr[i]);
			}
		} catch (IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("종료");
	}

}
