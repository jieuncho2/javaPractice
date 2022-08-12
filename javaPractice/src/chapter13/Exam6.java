package chapter13;
//스레드의 동기화
//스레드의 동기화란 멀티 스레드로 작업을 할 때, 스레드간의 작업이 간섭되지 않도록 하는 것
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
