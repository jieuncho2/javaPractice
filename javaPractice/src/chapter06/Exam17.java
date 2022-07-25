package chapter06;

public class Exam17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student2 s = new Student2();
		s.name = "홍길동";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;

		System.out.println("이름: " + s.name);
		System.out.println("총점: " + s.getTotal());
		System.out.println("평균: " + s.getAverage());
	}

}

class Student2 {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;

	int getTotal() {
		// TODO Auto-generated method stub
		return kor + eng + math;
	}

	float getAverage() {
		// TODO Auto-generated method stub
		return (float) getTotal() / 3;
	}
}
