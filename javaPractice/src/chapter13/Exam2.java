package chapter13;
//스레드 우선 순위
//void setPriority(int newPriority); 우선 순위를 설정
//int getPriority();우선 순위를 반환
//기본이 5, 숫자가 높을수록 우선 순위
class MyThread3 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			System.out.println("<" + Thread.currentThread().getName() + ">");
		}
		for (int i = 0; i < 1000; i++) {
			//시간 지연
		}
		System.out.println("-----------------");
	}

}

public class Exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable myThread3 = new MyThread3();
		Thread thread1 = new Thread(myThread3, "thread1");
		thread1.setPriority(1); //우선 순위 1로 지정
		System.out.println("t1의 우선 순위는 " + thread1.getPriority());

		Thread thread2 = new Thread(myThread3, "thread2");
		System.out.println("t2의 우선 순위는 " + thread2.getPriority());
		//아무 우선 순위도 지정하지 않을 경우 우선 순위 5

		Thread thread3 = new Thread(myThread3, "thread3");
		thread3.setPriority(10); //우선 순위 10으로 지정
		System.out.println("t3의 우선 순위는 " + thread3.getPriority());

		thread1.start();
		thread2.start();
		thread3.start();
	}

}
