package chapter06;

public class Exam17_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student3 s = new Student3("홍길동", 1, 1);
		s.updateRecord(100, 60, 76);

		System.out.println("이름: " + s.getName());
		System.out.println("총점: " + s.getTotal());
		System.out.println("평균: " + s.getAverage());
	}

}

class Student3 {
	private String name;
	private int ban, no, kor, eng, math;
	
	public String getName() {
		return name;
	}
	
	int getTotal() {
		// TODO Auto-generated method stub
		return kor + eng + math;
	}


	float getAverage() {
		// TODO Auto-generated method stub
		return (float) getTotal() / 3;
	}
	
	public void updateRecord(int kor, int eng, int math) {
		// TODO Auto-generated method stub
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	Student3(String name, int ban, int no){
		this.name = name;
		this.ban = ban;
		this.no = no;
	}

	@Override
	public String toString() {
		return "Student3 [ban=" + ban + ", no=" + no + ", kor=" + kor + ", eng=" + eng + ", math=" + math + "]";
	}
	
}
