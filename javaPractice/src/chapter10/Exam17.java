package chapter10;

//Member 클래스를 작성하되 Object의 toString() 메서드를 재정의해서 아래와 같이 나오도록 작성하세요
//실행 결과:
//blue: 이파란

class Member{
	String id;
	String name;
	public Member(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id + ": " + name;
	}
	
}
public class Exam17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member member = new Member("blue", "이파란");
		System.out.println(member);
	}

}
