package chapter06;

public class MyAccount2 {
	private String name;
	private String no;
	private long balance;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNo() {
		return no;
	}

	public long getBalance() {
		return balance;
	}
	
	void deposit(long k) {
		balance += k;
	}

	void withdraw(long k) {
		balance -= k;
	}
	
	public MyAccount2() {
		// TODO Auto-generated constructor stub
	}

	MyAccount2(String n, String num, long z) {
		this.name = n;
		this.no = num;
		this.balance = z;
	}
}
