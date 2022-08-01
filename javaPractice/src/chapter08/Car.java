package chapter08;

abstract class Car {
	public void run() {
		start();
		drive();
		stop();
		turnOff();
		washCar();
	}
	abstract void start();
	abstract void drive();
	abstract void stop();
	abstract void turnOff();
	public void washCar() {
		System.out.println("세차를 합니다.");
	}
}

class Sonata extends Car{

	@Override
	void start() {
		// TODO Auto-generated method stub
		System.out.println("Sonata 시동을 켭니다.");
	}

	@Override
	void drive() {
		// TODO Auto-generated method stub
		System.out.println("Sonata 달립니다.");
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("Sonata 멈춥니다.");
	}

	@Override
	void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Sonata 시동을 끕니다");
	}
	
}

class Grandeur extends Car{

	@Override
	void start() {
		// TODO Auto-generated method stub
		System.out.println("Grandeur 시동을 켭니다.");
	}

	@Override
	void drive() {
		// TODO Auto-generated method stub
		System.out.println("Grandeur 달립니다.");
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("Grandeur 멈춥니다.");
	}

	@Override
	void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Grandeur 시동을 끕니다");
	}
	
}

class Avante extends Car{

	@Override
	void start() {
		// TODO Auto-generated method stub
		System.out.println("Avante 시동을 켭니다.");
	}

	@Override
	void drive() {
		// TODO Auto-generated method stub
		System.out.println("Avante 달립니다.");
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("Avante 멈춥니다.");
	}

	@Override
	void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("시동을 끕니다");
	}
	
}

class Genesis extends Car{

	@Override
	void start() {
		// TODO Auto-generated method stub
		System.out.println("Genesis 시동을 켭니다.");
	}

	@Override
	void drive() {
		// TODO Auto-generated method stub
		System.out.println("Genesis 달립니다.");
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("Genesis 멈춥니다.");
	}

	@Override
	void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Genesis 시동을 끕니다");
	}
	
}