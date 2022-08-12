package chapter13;

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
