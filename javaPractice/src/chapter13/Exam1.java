package chapter13;
//프로세스: 실행 중인 프로그램 자원(resource)과 쓰레드로 구성
//
//쓰레드: 프로세스 내에서 실제 작업을 수행
//모든 프로세스는 최소한 하나 이상의 쓰레드를 가지고 있다
//
//싱글 쓰레드 프로세스: 자원 + 쓰레드
//멀티 쓰레드 프로세스: 자원 + 쓰레드 + 쓰레드 + ... + 쓰레드


class Mythread extends Thread { //Thread 클래스 상속
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) { //public void run() 메서드를 오버라이딩
			System.out.println("스레드 진행 중 " + i);
		}
	}
}

class Mythread2 implements Runnable {
	@Override
	public void run() { //추상 메서드인  run() 메서드를 오버라이딩
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			System.out.println("러너블 진행 중 " + i);
		}
	}
}

public class Exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//스레드를 호출한 순서에 상관없이 메인 함수, 러너블, 스레드가 골고루 실행
		Mythread myThread = new Mythread();

		Runnable thread2 = new Mythread2(); //Runnable 구현한 클래스
		Thread thread = new Thread(thread2);

		myThread.start();
		thread.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("메인 함수 진행 중 " + i);
		}
	}

}
