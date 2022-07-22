package chapter04;
import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("월을 입력해 주세요: ");
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		int day = 0;
		
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			day = 31;
			break;
		case 4: case 6: case 9: case 11:
			day = 30;
			break;
		case 2:
			day = 28;
			break;
		default:
			System.out.println("존재하지 않는 달입니다.");
			return;
		}
		System.out.println(month + "월은 " + day + "일까지 있습니다.");
	}

}
