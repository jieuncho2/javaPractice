package chapter13;

/* join() 메서드
 * 특정한 스레드가 작업을 먼저 수행할 때 사용
 * 실행 순서를 지켜야 하는 스레드들을 제어 */

class MyTread8 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			System.out.println("<<<t1 완료>>>");
			Thread.yield(); // 자신에게 주어진 시간 양보
		}
	}

}

class MyTread9 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			System.out.println("<<<t2 완료>>>");
		}
	}

}

public class Exam5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyTread8 myThrea8 = new MyTread8();
		MyTread9 myThrea9 = new MyTread9();
		Thread thread1 = new Thread(myThrea8);
		Thread thread2 = new Thread(myThrea9);

		thread1.start();

		try {
			thread1.join(); //t1을 제외한 다른 스레드 블록(block) t1이 완료될 때까지 기다린다
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println(e.toString());
		}

		thread2.start();
		
	}

}
