package chapter04;
import java.util.Scanner;

public class hw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력해 주세요: ");
		int score = sc.nextInt();
		int num = score / 10;
		
		switch(num) {
			case 10: case 9:
				System.out.println("입력하신 점수는 " + score + "점이고, 학점은 A 입니다.");
				break;
			case 8:
				System.out.println("입력하신 점수는 " + score + "점이고, 학점은 B 입니다.");
				break;
			case 7:
				System.out.println("입력하신 점수는 " + score + "점이고, 학점은 C 입니다.");
				break;
			case 6:
				System.out.println("입력하신 점수는 " + score + "점이고, 학점은 D 입니다.");
				break;
			default:
				System.out.println("입력하신 점수는 " + score + "점이고, 학점은 F 입니다.");
		}
	}

}
