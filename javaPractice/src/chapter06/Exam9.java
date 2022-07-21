package chapter06;

public class Exam9 {

	private static final String youngheeAccountNo = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String chulsooAccountName = "철수";
		String chulsooAccountNo = "123456";
		long chulsooAccountBalance = 1000;
		
		String youngheeAccountName = "영희";
		String youngheeAccountNo = "654321";
		long youngheeAccountBalance = 200;
		
		chulsooAccountBalance -= 200;
		youngheeAccountBalance += 100;
		
		System.out.println("철수의 계좌");
		System.out.println("계좌 명의: " + chulsooAccountName);
		System.out.println("계좌 번호: " + chulsooAccountNo);
		System.out.println("예금 잔고: " + chulsooAccountBalance);
		System.out.println();

		System.out.println("영희의 계좌");
		System.out.println("계좌 명의: " + youngheeAccountName);
		System.out.println("계좌 번호: " + youngheeAccountNo);
		System.out.println("예금 잔고: " + youngheeAccountBalance);
	}
}
