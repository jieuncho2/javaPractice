package chapter08;

abstract class Animal {
	private String name;

	public Animal(String name) {
		super();
		this.name = name;
	}

	public abstract void bark();

	public abstract String toString();

	public String getName() {
		return name;
	}

	public void introduce() {
		System.out.println(toString() + "입니다.");
		bark();
	}
}

class Cat extends Animal {
	private int age;

	public Cat(String name, int age) {
		super(name);
		this.age = age;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void bark() {
		// TODO Auto-generated method stub
		System.out.println("야옹~");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return age + "살 " + getName();
	}

}

class Dog extends Animal {
	private String type;

	public Dog(String name, String type) {
		super(name);
		this.type = type;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void bark() {
		// TODO Auto-generated method stub
		System.out.println("멍멍!!!");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return type + "인 " + getName();
	}

}

public class Exam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal[] animals = { new Dog("바둑이", "삽살개"), new Cat("아롱이", 7), new Dog("백두", "진돗개") };
		for (Animal animal : animals) {
			animal.introduce();
			System.out.println();
		}
	}

}
