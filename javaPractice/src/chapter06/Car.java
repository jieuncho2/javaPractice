package chapter06;

class Car {
	boolean powerOn;
	String color;
	int wheel;
	int speed;
	boolean wiferOn;

	void power() {
		powerOn = !powerOn;
	}

	void speedUp() {
		speed++;
	}

	void speedDown() {
		speed--;
	}

	void wifer() {
		wiferOn = !wiferOn;
	}

}
