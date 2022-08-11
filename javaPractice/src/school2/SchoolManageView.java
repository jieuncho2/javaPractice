package school2;

import java.util.Scanner;

public class SchoolManageView {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("학생 관리 프로그램을 시작합니다.");
		
		while(true) {
			System.out.println("메뉴를 선택하세요. >>> 1. 학생 추가 / 2. 학생 삭제 / 3. 수강 신청 / 4. 성적 입력 / 5. 정보 조회 / 6. 프로그램 종료");
			int menu = input.nextInt();
			switch(menu) {
			case 1: 
				System.out.println("학생 추가 및 수정 메뉴입니다.");
				StudentManage2.addStudent();
				break;
			case 2: 
				System.out.println("학생 삭제 메뉴입니다.");
				StudentManage2.removeStudent();
				break;
			case 3: 
				System.out.println("수강 신청 메뉴입니다.");
				StudentManage2.addClass();
				break;
			case 4: 
				System.out.println("성적 입력 메뉴입니다.");
				StudentManage2.setScore();
				break;
			case 5: 
				System.out.println("정보 조회 메뉴입니다.");
				StudentManage2.informStudent();
				break;
			case 6: 
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("없는 메뉴를 선택하였습니다.");
			}
		}
	}
}
