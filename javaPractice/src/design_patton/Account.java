package design_patton;

public class Account {
	private int id;
	private String name;
	private long balance;
	
	public Account() {

	}

	public Account(int id, String name, long balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "id = " + id + ", name = " + name + ", balance = " +balance;
	}
	
}
