package chapter08;

interface Wearable {
	void putOn();

	void putOff();
}

interface Color {
	int RED = 1;
	int GREEN = 2;
	int BLUE = 3;

	void changeColor(int color);
}

class WearableComputer implements Wearable {
	private String name;

	@Override
	public void putOn() {
		// TODO Auto-generated method stub
		System.out.println(name + " On!");
	}

	@Override
	public void putOff() {
		// TODO Auto-generated method stub
		System.out.println(name + " Off!");
	}

	public WearableComputer(String name) {
		this.name = name;
		// TODO Auto-generated constructor stub
	}

}

class WearableRobot implements Color, Wearable {
	private int color;

	public String toString() {
		switch (color) {
		case RED:
			return "빨강 로봇";
		case GREEN:
			return "녹색 로봇";
		case BLUE:
			return "파랑 로봇";
		}
		return "로봇";
	}

	@Override
	public void putOn() {
		// TODO Auto-generated method stub
		System.out.println(toString() + " 장착!");
	}

	@Override
	public void putOff() {
		// TODO Auto-generated method stub
		System.out.println(toString() + " 해제!");
	}

	@Override
	public void changeColor(int color) {
		// TODO Auto-generated method stub
		this.color = color;
	}

	public WearableRobot(int color) {
		changeColor(color);
		// TODO Auto-generated constructor stub
	}

}

public class Exam08 {
	public static void main(String[] args) {
		Wearable[] wearables = { new WearableComputer("HAL"), new WearableRobot(Color.RED),
				new WearableRobot(Color.GREEN), };
		for (Wearable wearable : wearables) {
			wearable.putOn();
			wearable.putOff();
			if (wearable instanceof Color) {
				((Color) wearable).changeColor(Color.BLUE);
			}
			System.out.println();
		}
		System.out.println(wearables[2]);
	}
}
