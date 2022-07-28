package chapter07;

public class Mypoly4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car2 car = new Car2();
		Car2 car2 = null;
		FireEngine fe = null;

		car.drive();
		if (car instanceof FireEngine) { // 추가
			fe = (FireEngine) car;
			fe.drive(); // 실행 시 에러 발생
			car2 = fe;
			car2.drive();
		} //
	}

}
