package chapter11;

import java.util.Timer;
import java.util.TimerTask;

class Work1 extends TimerTask {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("work1 실행");
	}

}

class Work2 extends TimerTask {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("work2 실행");
	}

}

public class Exam16 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Timer t = new Timer(true);
		TimerTask w1 = new Work1();
		TimerTask w2 = new Work2();
		t.schedule(w1, 3000); //3초 뒤 실행
		t.schedule(w2, 1000); //1초 뒤 실행
		System.out.println("delay 종료");
		
		//원하는 작업이 실행되기까지 기다리는 동안 프로그램이 종료될 수 있기 때문에 4초를 기다림
		Thread.sleep(4000); //종료하지 않고 스레드 기다리기
		System.out.println("모든 작업 종료");
	}

}
