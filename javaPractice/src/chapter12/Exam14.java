package chapter12;

import java.util.HashMap;
import java.util.Map;

class Student {
	public int sno;
	public String name;
	public Student(int sno, String name) {
		super();
		this.sno = sno;
		this.name = name;
	}
	
	@Override
	public int hashCode() { //학번과 이름이 같다면 동일한 값을 리턴
		// TODO Auto-generated method stub
		return sno + name.hashCode();
	}
	@Override
	public boolean equals(Object obj) { //학번과 이름이 같다면 true를 반환
		// TODO Auto-generated method stub
		if(obj instanceof Student) {
			Student student = (Student) obj;
			return (sno == student.sno) && (name.equals(student.name));
		} else {
			return false;
		}
	}
	
}
public class Exam14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Student, Integer> map = new HashMap<Student, Integer>();
		
		//학번과 이름이 동일한 Student를 키로 저장
		map.put(new Student(1, "홍길동"), 95);
		map.put(new Student(1, "홍길동"), 95);
		System.out.println("총 Entry 수: " + map.size());
	}

}
