package chapter14;

import java.util.Scanner;

public class Exam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//표준 입출력
		//화면에 출력하고 입력받는 표준 입출력 클래스
		
		//Scanner 테스트 하기
		//표준 입력 System.in을 사용하면 바이트 단위 자료만 처리할 수 있지만
		//Scanner은 다양한 자료형을 입력할 수 있음
		
		//표준 입력을 매개 변수로 Scanner 클래스를 생성
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이름: ");
		String name = scanner.nextLine(); //nextLine():문자열 입력
		System.out.println("직업: ");
		String job = scanner.nextLine(); //nextLine():문자열 입력
		System.out.println("사번: ");
		int num = scanner.nextInt(); //nextInt():정수 입력
		
		System.out.println(name);
		System.out.println(job);
		System.out.println(num);
	}

}
