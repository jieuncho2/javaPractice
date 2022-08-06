package chapter07;

class Car2 {
	String color;
	int door;

	void drive() {
		System.out.println("drive, Brrr~");
	}

	void stop() {
		System.out.println("stop!!!");
	}
}

class FireEngine extends Car2 { // 소방차
	void water() {
		System.out.println("water!!!");
	}
}

public class MyPoly2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		다형성과 형변환
//		자식 타입에서 부모 타입으로는 자동 형변환
//		부모에서 자식 타입으로는 명시적 형변환
		Car2 car;
		FireEngine fe = new FireEngine();
		FireEngine fe2;

		fe.water();
		car = fe; // car = (Car)fe;에서 형변환이 생략된 형태
//		car.water(); //Car 타입의 창조변수로는 water()를 호출할 수 없음
		fe2 = (FireEngine) car; // 부모 타입에서 자식 타입으로 대입할 때는 형변환을 해 줘야 함
		fe2.water();
	}

}
