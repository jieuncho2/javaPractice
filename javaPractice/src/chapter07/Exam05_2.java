package chapter07;

class User2 {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public User2(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

}

public class Exam05_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User2 user1 = new User2("철수", 20);
		User2 user2 = new User2("영희", 19);

		System.out.println(user1.getName() + "의 나이는 " + user1.getAge());
		System.out.println(user2.getName() + "의 나이는 " + user2.getAge());
	}

}
