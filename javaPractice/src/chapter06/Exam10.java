package chapter06;

public class Exam10 {

	private static final String youngheeAccountNo = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyAccount account1 = new MyAccount();
		account1.name = "철수";
		account1.no = "123456";
		account1.balance = 1000;
		
		MyAccount account2 = new MyAccount();
		account2.name = "영희";
		account2.no = "654321";
		account2.balance = 200;
		
		account1.balance -= 200;
		account2.balance += 100;
		
		System.out.println("철수의 계좌");
		System.out.println("계좌 명의: " + account1.name);
		System.out.println("계좌 번호: " + account1.no);
		System.out.println("예금 잔고: " + account1.balance);
		System.out.println();

		System.out.println("영희의 계좌");
		System.out.println("계좌 명의: " + account2.name);
		System.out.println("계좌 번호: " + account2.no);
		System.out.println("예금 잔고: " + account2.balance);
	}
}
