package chapter06;

public class Exam19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentRecord sr = new StudentRecord();
		sr.insertStudent("철수", 1, 1, 90, 80, 90);
		sr.insertStudent("영수", 1, 2, 100, 70, 70);
		sr.insertStudent("영희", 1, 3, 80, 70, 100);
		sr.printTotal();
	}
	
}

class StudentRecord {
	StudentData[] students = new StudentData[3];
	int index = 0;
	
	void insertStudent(String name, int ban, int no, int kor, int eng, int math) {
		students[index] = new StudentData(name, ban, no);
		students[index].setKor(kor);
		students[index].setEng(eng);
		students[index].setMath(math);
		index++;
	}

	void printTotal() {
		// TODO Auto-generated method stub
		for(StudentData s : students) {
			System.out.println(s.getName() + "총점: " + (s.getKor() + s.getEng() + s.getMath()));
		}
	}
}

class StudentData{
	private String name;
	private int ban, no, kor, eng, math;
	public StudentData(String name, int ban, int no) {
		this.name = name;
		this.ban = ban;
		this.no = no;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public String getName() {
		return name;
	}
	
}
