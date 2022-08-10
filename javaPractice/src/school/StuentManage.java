package school;

import java.util.ArrayList;
import java.util.Scanner;

public class StuentManage {
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

	static void addStudent() {
		System.out.println("학생의 학번을 입력하세요. >>>");
		int studentNumber = input.nextInt();
		
		Student newStudent = findStudentInform(studentNumber);
		if(newStudent == null) {
			newStudent = new Student(studentNumber);
//			studentNumber
		}
	}
}
