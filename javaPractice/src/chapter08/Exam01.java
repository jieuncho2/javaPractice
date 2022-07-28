package chapter08;
abstract class Pocketmon{
	String name;
	
	abstract void attack();
	abstract void sound();
	public String getName() {
		return this.name;
	}
	
}

class Pikachu extends Pocketmon{

	public Pikachu() {
		this.name = "피카츄";
		// TODO Auto-generated constructor stub
	}

	@Override
	void attack() {
		// TODO Auto-generated method stub
		System.out.println("전기 공격");
	}

	@Override
	void sound() {
		// TODO Auto-generated method stub
		System.out.println("피카피카!");
	}
	
}
class Squirtle extends Pocketmon{

	public Squirtle() {
		this.name = "꼬부기";
		// TODO Auto-generated constructor stub
	}

	@Override
	void attack() {
		// TODO Auto-generated method stub
		System.out.println("물 공격");
	}

	@Override
	void sound() {
		// TODO Auto-generated method stub
		System.out.println("꼬북꼬북!");
	}
	
}
public class Exam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pikachu pika1 = new Pikachu();
		System.out.println("이 포켓몬은 " + pika1.getName());
		pika1.attack();
		pika1.sound();
		
		Squirtle squir1 = new Squirtle();
		System.out.println("이 포켓몬은 " + squir1.getName());
		squir1.attack();
		squir1.sound();
	}

}
