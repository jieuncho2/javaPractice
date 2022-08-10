package school;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManage {
	static Scanner input = new Scanner(System.in);
	static ArrayList<Student> students = new ArrayList();
	static String[] className = { "JAVA", "PHYTHON", "C" };

	static Student findStudentInform(int studentNumber) {
		for (Student student : students) {
			if (student.getStudentNum() == studentNumber) {
				System.out.println("해당 학생의 정보는 다음과 같습니다.");
				System.out.println("이름:" + student.getName());
				System.out.println("전화번호:" + student.getPhoneNumber());
				System.out.println("메모:" + student.getMemo());
				return student;
			}
		}
		return null;
	}

	// 학생 추가 및 수정
	static void addStudent() {
		System.out.println("학생의 학번을 입력하세요. >>>");
		int studentNumber = input.nextInt(); // 학번 입력받음

		// 입력한 학번으로 새로운 학생을 생성
		Student newStudent = findStudentInform(studentNumber);
		if (newStudent == null) {
			newStudent = new Student(studentNumber);
			students.add(newStudent); // 학생 객체를 ArrayList에 저
		}
		System.out.println("이름을 입력하세요. >>>");
		newStudent.setName(input.next()); // 문자열을 입력받아서 setName에 전달
		System.out.println("이름을 입력하세요. >>>");
		newStudent.setMemo(input.next());
		System.out.println("이름을 입력하세요. >>>");
		newStudent.setPhoneNumber(input.next());
	}
}
