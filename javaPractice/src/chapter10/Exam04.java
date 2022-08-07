package chapter10;

class Student {
	int studentId;
	String studentName;

	public Student(int studentId, String studentName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return studentId + ", " + studentName;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof Student) {
			Student std = (Student) obj;
			if (studentId == std.studentId)
				return true;
			else
				return false;
		}
		return true;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return studentId;
	}

	public String identityHashCode() {
		// TODO Auto-generated method stub
		return null;
	}

}

public class Exam04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student studentLee = new Student(100, "이상원");
		Student studentLee2 = studentLee;
		Student studentSang = new Student(100, "이상원");
		
		//동일한 주소의 두 인스턴스 비교
		if(studentLee == studentLee2) {
			System.out.println("studentLee와 studentLee2의 주소는 같습니다.");
		} else {
			System.out.println("studentLee와 studentLee2의 주소는 다릅니다.");
		}
		
		if(studentLee.equals(studentLee2)) {
			System.out.println("studentLee와 studentLee2는 동일합니다.");
		} else {
			System.out.println("studentLee와 studentLee2는 동일하지 않습니다.");
		}
		
		//동일인이지만 인스턴스의 주소가 다른 경우
		//주소는 다르지만 equals의 결과가 true인 경우
		if(studentLee == studentSang) {
			System.out.println("studentLee와 studentSang의 주소는 같습니다.");
		} else {
			System.out.println("studentLee와 studentSang의 주소는 다릅니다.");
		}
		
		if(studentLee.equals(studentSang)) {
			System.out.println("studentLee와 studentSang은 동일합니다.");
		} else {
			System.out.println("studentLee와 studentSang은 동일하지 않습니다.");
		}
		
		System.out.println("studentLee의 hashCode: " + studentLee.hashCode());
		System.out.println("studentSang의 hashCode: " + studentSang.hashCode());
		
		System.out.println("studentLee의 실제 주소값: " + System.identityHashCode(studentLee));
		System.out.println("studentSang의 실제 주소값: " + System.identityHashCode(studentSang));
	}

}
