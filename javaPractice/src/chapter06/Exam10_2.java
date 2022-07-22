package chapter06;

public class Exam10_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyAccount2 account1 = new MyAccount2("철수", "123456", 1000);
		
		MyAccount2 account2 = new MyAccount2("영희", "654321", 200);
		
		account1.withdraw(200);
		account2.deposit(100);
		
		System.out.println("철수의 계좌");
		System.out.println("계좌 명의: " + account1.getName());
		System.out.println("계좌 번호: " + account1.getNo());
		System.out.println("예금 잔고: " + account1.getBalance());
		System.out.println();

		System.out.println("영희의 계좌");
		System.out.println("계좌 명의: " + account2.getName());
		System.out.println("계좌 번호: " + account2.getNo());
		System.out.println("예금 잔고: " + account2.getBalance());
	}
}
