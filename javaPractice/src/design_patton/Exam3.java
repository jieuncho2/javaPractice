package design_patton;

class CarFactory{
	private CarFactory() {}
	
	private static CarFactory singeltonObject;
	
	public static CarFactory getInstance() {
		// TODO Auto-generated method stub
		if(singeltonObject == null) {
			singeltonObject = new CarFactory();
		}
		return singeltonObject;
	}

	int i = 10001;
	public Car createCar() {
		// TODO Auto-generated method stub
		return new Car();
	}
}

class Car{
	private static int serialNum = 10000;
	private int carNum;

	public Car() {
		serialNum++;
		carNum = serialNum;
	}

	public int getCarNum() {
		return carNum;
	}
}

public class Exam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarFactory factory = CarFactory.getInstance();
		Car mySonata = factory.createCar();
		Car yourSonata = factory.createCar();
		
		System.out.println(mySonata.getCarNum());
		System.out.println(yourSonata.getCarNum());
	}

}
