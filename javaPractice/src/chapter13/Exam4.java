package chapter13;
/* yield 메서드
 * 자신의 시간을 양보하는 메서드
 * 스레드가 작업을 수행하던 중에 yield()를 만나게 되면 자신에게 할당된 실행 시간을 다음 차례의 스레드에게 양보
 * yield() 메서드를 활용하면 급하지 않은 작업의 시간을 양보하여 다른 작업부터 수행 */

class MyTread6 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 30; i++) {
			System.out.println("+");
			Thread.yield(); //자신에게 주어진 시간 양보
		}
	}

}

class MyTread7 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 30; i++) {
			System.out.println("*");
		}
	}

}

public class Exam4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyTread6 myThrea6 = new MyTread6();
		MyTread7 myThrea7 = new MyTread7();
		Thread thread1 = new Thread(myThrea6);
		Thread thread2 = new Thread(myThrea7);
		thread2.start();
		thread1.start();
	}

}
