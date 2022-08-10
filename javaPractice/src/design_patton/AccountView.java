package design_patton;

import java.util.Scanner;

public class AccountView {
	
	public static void main(String[] args) {
		AccountManage manager = new AccountManage();
		Scanner stdIn = new Scanner(System.in);

		while(true){
			printMenu();
			System.out.print("선택: ");
			int choice = stdIn.nextInt();
			switch (choice) {
			case 1:
				manager.makeAccount();
				break;
			case 2:
				manager.deposit();
				break;
			case 3:
				manager.withdraw();
				break;
			case 4:
				System.out.println("계좌번호\t성명\t잔액");
				manager.inquire();
				break;
			case 5:
				System.out.println("계좌번호\t성명\t금액");
				manager.display();
				break;
			case 6:
				System.out.println("종료합니다.");
				stdIn.close();
				return;
			default:
				System.out.println("잘못 누르셨습니다.\n다시 선택해 주세요.");
				break;
			}
		}
	}


	private static void printMenu() {
		// TODO Auto-generated method stub
		System.out.println("==========Menu==========");
		System.out.println("1. 계좌 개설");
		System.out.println("2. 입금");
		System.out.println("3. 출금");
		System.out.println("4. 잔액 조회");
		System.out.println("5. 전체 출력");
		System.out.println("6. 프로그램 종료");
		System.out.println();
	}

}
