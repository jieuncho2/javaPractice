package chapter07;

class User {
	public String name;
	public int age;

	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

}

public class Exam05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user1 = new User("철수", 20);
		User user2 = new User("영희", 19);

		System.out.println(user1.name + "의 나이는 " + user1.age);
		System.out.println(user2.name + "의 나이는 " + user2.age);
	}

}
