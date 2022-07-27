package chapter07;

class Animal {
	void breath() {
		System.out.println("숨쉬기");
	}
}

class Lion extends Animal {
	public String toString() {
		return "사자";
	}
}

class Rabbit extends Animal {
	public String toString() {
		return "토끼";
	}
}

class Monkey extends Animal {
	public String toString() {
		return "원숭이";
	}
}

class Zookeeper {
//	void feed(Lion lion) {
//		System.out.println(lion + "에게 먹이 주기");
//	}
//
//	void feed(Rabbit rabbit) {
//		System.out.println(rabbit + "에게 먹이 주기");
//	}
//
//	void feed(Monkey monkey) {
//		System.out.println(monkey + "에게 먹이 주기");
//	}
	
	void feed(Animal animal) {
		System.out.println(animal + "에게 먹이 주기");
	}
}

public class Exam10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zookeeper james = new Zookeeper();
		Lion lion1 = new Lion();
		james.feed(lion1);
		Rabbit rabbit1 = new Rabbit();
		james.feed(rabbit1);
		Monkey monkey1 = new Monkey();
		james.feed(monkey1);
		Animal lion2 = new Lion();
		james.feed(lion2);
	}

}
