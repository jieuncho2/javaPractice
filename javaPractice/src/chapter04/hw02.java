package chapter04;
import java.util.Scanner;

public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("월를 입력해 주세요: ");
		int month = sc.nextInt();
		
		switch(month) {
			case 3: case 4: case 5:
				System.out.println("입력하신 " + month + "월의 계절은 봄입니다.");
				break;
			case 6: case 7: case 8:
				System.out.println("입력하신 " + month + "월의 계절은 여름입니다.");
				break;
			case 9: case 10: case 11:
				System.out.println("입력하신 " + month + "월의 계절은 가을입니다.");
				break;
			case 12: case 1: case 2:
				System.out.println("입력하신 " + month + "월의 계절은 겨울입니다.");
				break;
			default:
				System.out.println("입력하신 " + month + "월은 존재하지 않는 달입니다.");
		}
	}

}
