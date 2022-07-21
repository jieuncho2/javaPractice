package chapter06;

public class Exam8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student();
		student1.studentName = "안연수";
		
		Student student2 = new Student();
		student2.studentName = "안승연";
		
		System.out.println(student1);
		System.out.println(student1);
		System.out.println(student1.getStudentName());
		System.out.println(student2.getStudentName());
		System.out.println();
		
		student1 = student2;
		System.out.println(student1);
		System.out.println(student1);
		System.out.println(student1.getStudentName());
		System.out.println(student2.getStudentName());
		
	}
}
