package chapter06;

public class Exam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car mycar1 = new Car();
		Car mycar2 = new Car();

		mycar1.color = "red";
		mycar2.color = "black";
		mycar1.speedUp();
		mycar2.wifer();
		System.out.println("myca1의 색: " + mycar1.color);
		System.out.println("myca2의 색: " + mycar2.color);
		System.out.println("myca1의 속도: " + mycar1.speed);
		System.out.println("myca2의 속도: " + mycar2.speed);
		System.out.println("myca1의 와이퍼 작동 여부: " + mycar1.wiferOn);
		System.out.println("myca2의 와이퍼 작동 여부: " + mycar2.wiferOn);
	}
}
