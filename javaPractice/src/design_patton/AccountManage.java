package design_patton;

import java.util.ArrayList;
import java.util.Scanner;

public class AccountManage {
	private ArrayList<Account> list;
	private Scanner stdIn;
	
	public AccountManage() {
		list = new ArrayList<Account>();
		stdIn = new Scanner(System.in);
	}

	public void makeAccount() {
		Account account =  new Account();
		
		System.out.println("계좌 번호: ");
		account.setId(stdIn.nextInt());
		
		System.out.println("이름: ");
		account.setName(stdIn.next());
		
		System.out.println("입금액: ");
		account.setBalance(stdIn.nextLong());
		
		list.add(account);
		
		System.out.println("계좌가 개설되었습니다.");
		System.out.println(list.toString() + "\t");
		
	}
	
	public void deposit() { //입금
		System.out.println("계좌 번호: ");
		int id = stdIn.nextInt();
		
		System.out.println("입금액: ");
		long money = stdIn.nextLong();
		
		for(Account account : list) {
			if(account.getId() == id) {
				account.setBalance(money + account.getBalance());
				System.out.println("입금 완료 되었습니다.");
				return;
			}
		}
		System.out.println("해당 계좌 번호가 존재하지 않습니다.");
	}
	
	public void withdraw() { //출금
		System.out.println("계좌 번호: ");
		int id = stdIn.nextInt();
		
		System.out.println("출금액: ");
		long money = stdIn.nextLong();
		
		for(Account account : list) {
			if(account.getId() == id) {
				if(account.getBalance() < money) {
					System.out.println("잔액이 부족합니다.");
				} else{
					account.setBalance(account.getBalance() - money);
					System.out.println("출금 완료 되었습니다.");
				}
				return;
			}
		}
		System.out.println("해당 계좌 번호가 존재하지 않습니다.");
	}
	
	public void inquire() { //잔액 조회
		System.out.println("계좌 번호: ");
		int id = stdIn.nextInt();
		
		for(Account account : list) {
			if(account.getId() == id) {
				System.out.println(account.getId() + "\t" + account.getName() + "\t" + account.getBalance());
				return;
			}
		}
		System.out.println("해당 계좌 번호가 존재하지 않습니다.");
	}
	
	public void display() { //출력
		for(Account account : list) {
			System.out.println(account.getId() + "\t" + account.getName() + "\t" + account.getBalance());
		}
	}
}
