package school5;

import java.util.ArrayList;

public class Student5 extends Person{
	private int studentNumber; //학번
	//학생이 듣고 있는 수업의 정보 (자바, 파이썬, C)
	private ArrayList<Integer> classCheck = new ArrayList(); //수강 신청을 하면 true로 변경
	private ArrayList<Integer> classScore = new ArrayList(); //각 과목 성적
	
	//Student의 생성
	public Student5(int studentNumber) {
		//학번을 매개 변수로 받아서 현재 학번을 설정한다
		this.studentNumber = studentNumber;
	}
	public ArrayList<Integer> getClassCheck() {
		return classCheck;
	}
	public void setClassCheck(int index, int classCheck) {
		this.classCheck.set(index, classCheck);
	}
	public ArrayList<Integer> getClassScore() {
		return classScore;
	}
	public void setClassScore(int index, int classScore) {
		this.classScore.set(index, classScore);
	}
	public int getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}
	
	
}
