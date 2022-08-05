package chapter11;

import java.util.HashMap;

class Student2 {
	private String studentNum;

	public Student2(String studentNum) {
		this.studentNum = studentNum;
	}

	public String getStudentNum() {
		return studentNum;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Student2) {
			Student2 student = (Student2) obj;
			if(studentNum.equals(student.getStudentNum())) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return studentNum.hashCode();
	}
	

}

public class Exam35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Student2, String> hashMap = new HashMap<Student2, String>();
		
		hashMap.put(new Student2("1"), "95");
		
		String score = hashMap.get(new Student2("1"));
		System.out.println("1번 학생의 총점: " +  score);
	}

}
