package chapter13;
/*
스레드의 동기화
스레드의 동기화란 멀티 스레드로 작업을 할 때, 스레드간의 작업이 간섭되지 않도록 하는 것

단일 스레드로 작업할 때는 프로세스의 자원을 사용하는 데 아무런 문제가 없음
하지만 멀티 프로세스의 경우 여러 스레드가 같은 자원을 공유하게 되기 때문에 예기치 못한 결과를 불러올 수 있음
예를 들어 A와 B가 같은 메서드를 사용할 경우 A가 메서드의 사용을 완료하고
그 결과를 반영하기 전에 B가 메서드를 사용한다면 B의 메서드 사용이 A의 결과에 영향을 미치게 됨

자바에서는 스레드의 동기화(syncronized)라는 키워드를 사용
스레드의 동기화란 공통의 메서드에 대해 한 스레드가 먼저 작업을 하고 있을 때 다른 스레드의 접근을 막는 것
스레드의 동기화를 사용하기 위해서는 메서드의 선언부에 syncronized 키워드만 붙여 주면 됨

다른 스레드의 접근을 막는 방법은 sycronized 처리가 된 메서드가 자신에게 접근한 스레드에게
자신을 자용할 수 있는 권한인 록(lock)을 부여
스레드가 작업을 완료하면 록(lock)을 다시 가져옴
그러므로 이 록(lock)을 가지지 못한 스레드는 메서드를 사용할 수 없음
*/
class MyTreadB implements Runnable {
	Ticketing ticket = new Ticketing();
	@Override
	public void run() {
		// TODO Auto-generated method stub
		ticket.ticketing();
	}

}
class Ticketing{
	int ticketNumber = 1;

	public synchronized void ticketing() {
		// TODO Auto-generated method stub
		if(ticketNumber > 0) {
			System.out.println(Thread.currentThread().getName() +"가 티켓팅 성공");
			ticketNumber = ticketNumber - 1;
		} else {
			System.out.println();
			System.out.println(Thread.currentThread().getName() +"가 티켓팅 실패");
		}
		System.out.println(Thread.currentThread().getName() +"가 티켓팅 시도 후 티켓 수: " + ticketNumber);
	}
	
}
public class Exam6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyTreadB s1 = new MyTreadB();
		Thread t1 = new Thread(s1, "A");
		Thread t2 = new Thread(s1, "B");
		Thread t3 = new Thread(s1, "C");
		t1.start();
		t2.start();
		t3.start();
	}

}
