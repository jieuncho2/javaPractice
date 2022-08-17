package chapter13;

/*
wait()와 notify()
wait() 메서드
스레드가 일단 lock을 반납하고 기다리게 하는 메서드
notify()메서드
작업을 중단했던 스레드가 다시 록(lock)을 얻을 수 있도록 꺠우는 메서드

스레드 동기화를 통해서 객체의 록(lock)을 한 스레드의 작업이 완료될 때까지 제공함으로써 공유하는 데이터를 보호
하지만 현재 (lock)을 가지고 있는 스레드의 작업이 특정한 조건 때문에 왼료되지 못하는 상태라면 계속해서 록(lock)을 반납하지 못하게 됨
*/

class Account {
	int money = 0;
	//입금, 출금
	public int showMoney() {
		return money;
	}

	public synchronized void setMoney() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
			// TODO: handle exception
			System.out.println(ie.toString());
		}
		this.money += 2000;

		System.out.println("어머니가 용돈을 입금했습니다. 현재 잔액" + this.showMoney());

		this.notify(); //작업을 중단했던 스레드가 다시 록(lock)을 얻을 수 있도록 꺠우는 메서드
	}

	public synchronized void getMoney() {
		if (money <= 0) {
			try {
				System.out.println("통장 잔고가 없어서 아들 대기 중");
				this.wait(); //메서드를 호출한 스레드가 잔다
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
			this.money -= 2000;
			System.out.println("아들이 용돈을 출금했습니다. 현재 잔액" + this.showMoney());

		}
	}
}

class Son extends Thread {
	private Account account;

	Son(Account account) {
		this.account = account;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			account.getMoney();
		}
	}

}

class Mom extends Thread {
	private Account account;

	Mom(Account account) {
		this.account = account;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			account.setMoney();
		}
	}

}

public class Exam7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account();
		Son son = new Son(account);
		Mom mom = new Mom(account);
		son.start();
		mom.start();
	}

}
