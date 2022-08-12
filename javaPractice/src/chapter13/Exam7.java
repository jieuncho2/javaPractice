package chapter13;

class Account {
	int money = 0;

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

		this.notify();
	}

	public synchronized void getMoney() {
		if (money <= 0) {
			try {
				System.out.println("통장 잔고가 없어서 아들 대기 중");
				this.wait();
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
			account.getMoney();
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
