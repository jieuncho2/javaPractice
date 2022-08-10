package school;

public class Student extends Person{
	private int studentNum;
	
	private boolean[] classCheck = {false, false, false};
	private int[] classScore = {0, 0, 0};
	
	public Student(int studentNum) {
		super();
		this.studentNum = studentNum;
	}
	public boolean[] getClassCheck() {
		return classCheck;
	}
	public void setClassCheck(int index, boolean classCheck) {
		this.classCheck[index] = classCheck;
	}
	public int[] getClassScore() {
		return classScore;
	}
	public void setClassScore(int index, int classScore) {
		this.classScore[index] = classScore;
	}
	public int getStudentNum() {
		return studentNum;
	}
	public void setStudentNum(int studentNum) {
		this.studentNum = studentNum;
	}
	
	
}
