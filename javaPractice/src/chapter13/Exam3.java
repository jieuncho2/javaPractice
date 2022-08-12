package chapter13;

/*스레드의 라이프 사이클이라고 합니다
1. new
스레드가 키워드 new를 통해서 인스턴스화된 상태 Runnable이 될 수 있는 상태이며 아직 대기열에 올라가지 않은 상태
2. Runnable
start() 메서드가 호출되면 new 상태에서 Runnable 상태가 됨 Runnable 상태가 되면 실행할 수 있는 상태로 대기 스케줄러에 의해 선택이 되면 
run()메서드를 바로 수행
3. Blocked
실행 중인 스레드가 sleep(), join() 메서드를 호출하게 되면 Blocked 상태가 됨 Blocked 상태가 되면 스케줄러에 의해서 선택받을 수 없음
4. Dead
run() 메서드의 실행을 모두 완료하게 되면 스레드는 Dead 상태가 됨 할당받은 메모리와 정보가 삭제 

sleep() 메서드
스레드를 지정된 시간 동안 block상태로 만듦 시간은 1000분의l 1초까지 지정
지정된 시간이 지나면 다시 Runnable 상태로 돌아감
*/
class SleepThread extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("카운트다운 5초");
		for (int i = 5; i >= 0; i--) { //5부터 시작
			System.out.println(i);
			if (i != 0) { //0인 경우에는 1초를 기다리지 않음
				try {
					Thread.sleep(1000); //1초 동안 스레드 block
				} catch (InterruptedException ie) {
					// TODO Auto-generated catch block
					System.out.println(ie.toString());
				}
			}
		}
		System.out.println("종료");
	}

}

public class Exam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SleepThread sleepThread = new SleepThread();
		sleepThread.start();
	}

}
