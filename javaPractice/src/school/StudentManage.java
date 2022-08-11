package school;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManage {
	
	private static StudentManage singeltonManage;
	private StudentManage() {}
	public static StudentManage getInstance() {
		if(singeltonManage == null) {
			singeltonManage = new StudentManage();
		}
		return singeltonManage;
	}
	private static String strErr = "해당 학번의 학생은 존재하지 않습니다.";
	
	Scanner input = new Scanner(System.in);
	ArrayList<Student> students = new ArrayList();
	String[] className = { "JAVA", "C++", "C", "DATABASE"};

	Student findStudentInform(int studentNumber) {
		for (Student student : students) {
			if (student.getStudentNumber() == studentNumber) {
				System.out.println("해당 학생의 정보는 다음과 같습니다.");
				System.out.println("이름:" + student.getName());
				System.out.println("전화번호:" + student.getPhoneNumber());
				System.out.println("메모:" + student.getMemo());
				return student;
			}
		}
		return null;
	}

	//1. 학생 추가 및 수정
	void addStudent() {
		System.out.println("학생의 학번을 입력하세요. >>>");
		int studentNumber = input.nextInt(); // 학번 입력받음

		// 입력한 학번으로 새로운 학생을 생성
		Student newStudent = findStudentInform(studentNumber);
		if (newStudent == null) { //만약 기존에 학생의 정보가 없다면
			newStudent = new Student(studentNumber);
			students.add(newStudent); // 학생 객체를 ArrayList에 저장
		}
		System.out.println("이름을 입력하세요. >>>");
		newStudent.setName(input.next()); // 문자열을 입력받아서 setName에 전달
		System.out.println("전화번호를 입력하세요. >>>");
		newStudent.setPhoneNumber(input.next());
		System.out.println("메모를 입력하세요. >>>");
		newStudent.setMemo(input.next());
		
		System.out.println("학생 추가가 완료되었습니다." + "\n");
	}
	
	//2. 학생 삭제 메뉴
	void removeStudent() {
		System.out.println("학생의 학번을 입력하세요. >>>");
		int studentNumber = input.nextInt(); // 학번 입력받음

		// 입력한 학번으로 새로운 학생을 생성
		Student newStudent = findStudentInform(studentNumber);
		if (newStudent == null) { //만약 기존에 학생의 정보가 없다면
			System.out.println(strErr);
			return; //메소드 종료
		}
		students.remove(newStudent);
		
		System.out.println("학생 삭제가 완료되었습니다.");
	}
	
	//3. 수강 신청 메뉴
	void addClass() {
		System.out.println("학생의 학번을 입력하세요. >>>");
		int studentNumber = input.nextInt(); // 학번 입력받음

		// 입력한 학번으로 새로운 학생을 생성
		Student newStudent = findStudentInform(studentNumber);
		if (newStudent == null) { //만약 기존에 학생의 정보가 없다면
			System.out.println(strErr);
			return; //메소드 종료
		}

		while(true) {
			System.out.println("메뉴를 선택하세요: 1. 수강 신청 / 2. 수강 포기 / 3.종료");
			int classMenu = input.nextInt();
			switch(classMenu) {
			case 1:
				setClass("수강 신청할 과목을 선택하세요", newStudent, 0);
				break;
			case 2:
				setClass("수강 포기할 과목을 선택하세요", newStudent, 1);
				break;
			case 3:
				return;
			}
		}
	}

	void setClass(String message, Student newStudent, int check) {
		// TODO Auto-generated method stub
		System.out.println(message);
		for(int i = 0; i < className.length; i++) {
			if(i == className.length - 1) {
				System.out.print((i + 1) + ". " + className[i]);
			} else {
				System.out.print((i + 1) + ". " + className[i] + " / ");
			}
		}
		System.out.println();
		int index = input.nextInt() -1;
		newStudent.setClassCheck(index, check);
		
		if(check == 0) {
			newStudent.setClassCheck(index, check);
		}
	}
	
	
	//4.
	void setScore() {
		System.out.println("학생의 학번을 입력하세요. >>>");
		int studentNumber = input.nextInt(); // 학번 입력받음

		// 입력한 학번으로 새로운 학생을 생성
		Student newStudent = findStudentInform(studentNumber);
		if (newStudent == null) { //만약 기존에 학생의 정보가 없다면
			System.out.println(strErr);
			return; //메소드 종료
		}
		
		while(true) {
			for(int i = 0; i < className.length + 1; i++) {
				if(i == className.length) {
					System.out.print((i + 1) + ". 종료");
				} else {
					System.out.print((i + 1) + ". " + className[i] + " / ");
				}
			}
			System.out.println();
			int classMenu = input.nextInt();
			if(classMenu == className.length) {
				break;
			}
			if(newStudent.getClassCheck().get(classMenu-1) == 1) {
				System.out.println(className[classMenu-1] + " 과목은 미신청 과목입니다.");
				continue;
			}
			System.out.println("성적 입력");
			int score = input.nextInt();
			if(score < 0 || score >100) {
				System.out.println("Error: 성적은 0~100 사이의 숫자만 입력해 주세요.");
				continue;
			}
			//
			newStudent.setClassScore(classMenu - 1, score);
			System.out.println(className[classMenu-1] + " 성적 입력이 완료되었습니다.");
		}
	}
	
	//5.
	void informStudent() {
		System.out.println("메뉴를 선택 해 주세요. 1. 특정 학생만 / 2. 전체 학생");
		int menu = input.nextInt();
		switch(menu) {
		case 1: 
			Inform(1);
			break;
		case 2:
			Inform(0);
			break;
		}
	}

	@SuppressWarnings("unused")
	void Inform(int num) {
		// TODO Auto-generated method stub
		if(num==1) {
			System.out.println("학생의 학번을 입력하세요. >>>");
			int studentNumber = input.nextInt(); // 학번 입력받음
			
			// 입력한 학번으로 새로운 학생을 생성
			Student[] students = new Student[1];
			students[0] = findStudentInform(studentNumber);
			if (students == null) { //만약 기존에 학생의 정보가 없다면
				System.out.println(strErr);
				return; //메소드 종료
			}
		}
		for(Student student : students) {
			System.out.println("학번: " + student.getStudentNumber());
			System.out.println("이름: " + student.getName());
			System.out.println("전화번호: " + student.getPhoneNumber());
			System.out.println("메모: " + student.getMemo());
			System.out.println("현재 수강 중인 과목과 성적 >>>");
			ArrayList<Integer> classCheck = student.getClassCheck();
			ArrayList<Integer> classScore = student.getClassScore();
			for(int i = 0; i <classCheck.size(); i++) {
				System.out.println("과목명: " + className[i] + " 성적: " + classScore.get(i));
			}	
		}
	}
	
}
