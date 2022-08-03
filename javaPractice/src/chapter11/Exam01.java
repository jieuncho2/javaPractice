package chapter11;

public class Exam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start = System.currentTimeMillis();
		System.out.println("시작 시간: " + start);
		int a = 0;
		for(int i = 0; i < 100000000; i++) {
			a++;
		}
		long end = System.currentTimeMillis();
		System.currentTimeMillis();
		System.out.println("종료 시간: " + end);
		System.out.println("걸린 작업 시간: " + (end - start));
		
	}

}
