package chapter11;

class Member{
	String color;
	String name;
	public Member(String color, String name) {
		super();
		this.color = color;
		this.name = name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return color + ", " + name;
	}
	
}
public class Exam36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member member = new Member("blue", "이파란");
		System.out.println(member);
	}

}
