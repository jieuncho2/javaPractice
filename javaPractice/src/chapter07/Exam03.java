package chapter07;

class Car {
	int wheel;
	int speed;
	String color;

	public Car(String color) {
		this.color = color;
	}

}

class SportsCar extends Car {

	int speedLimit;

	public SportsCar(String color, int speedLimit) {
		super(color);
//		this.color = color;
		this.speedLimit = speedLimit;
	}

}

public class Exam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SportsCar sportscar1 = new SportsCar("red", 330);
		System.out.println(sportscar1.color);
		System.out.println(sportscar1.speedLimit);
	}

}
