package chapter06;

class Cellphone {
	String model = "Galaxy 8";
	String color;
	int capacity;

	Cellphone(String color, int capacity) {
		this.color = color;
		this.capacity = capacity;
	}
}

public class Exam14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Cellphone myphone = new Cellphone(); //생성자를 정의하면 자바가 제공하는 기본 void 생성자가 사라짐
		Cellphone myphone = new Cellphone("Silver", 64);

		System.out.println(myphone.model);
		System.out.println(myphone.color);
		System.out.println(myphone.capacity);
	}

}
