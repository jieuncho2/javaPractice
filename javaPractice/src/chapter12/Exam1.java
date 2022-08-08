package chapter12;

import java.util.HashMap;

//Student 클래스를 작성하되 Object의 equals()와 hashCode()를 재정의해서
//Student의 학번 studenNum이 같으면 동등 객체가 될 수 있도록 해 보세요
//Student 클래스의 필드는 다음과 같습니다
//hashCode()의 리턴 값은 studentNum 필드 값의 해시코드를 리턴하도록 하세요

//실행 결과:
//1번 학생의 총점: 95

class Student2 {
	private String studentNum;

	public Student2(String studentNum) {
		this.studentNum = studentNum;
	}

	public String getStudentNum() {
		return studentNum;
	}

	//여기에 코드를 작성하세요
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

public class Exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Student 키로 총점을 저장하는 HashMap 객체 생성
		HashMap<Student2, String> hashMap = new HashMap<Student2, String>();
		
		//new Student("1")의 점수 95를 저장
		hashMap.put(new Student2("1"), "95");
		
		String score = hashMap.get(new Student2("1"));
		System.out.println("1번 학생의 총점: " +  score);
	}

}
