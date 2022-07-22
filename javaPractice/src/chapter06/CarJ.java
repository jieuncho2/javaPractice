package chapter06;

public class CarJ {
	private String name;
	private int width;
	private int height;
	private int length;
	private double x;
	private double y;
	private double fuel; // 남은 연료

	CarJ(String name, int width, int height, int length, double fuel) {
		this.name = name;
		this.width = width;
		this.height = height;
		this.length = length;
		this.fuel = fuel;
		x = y = 0.0;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double getFuel() {
		return fuel;
	}

	void putSpec() { // 사양 표시
		System.out.println("이름: " + name);
		System.out.println("차 너비: " + width + "mm");
		System.out.println("차 높이: " + height + "mm");
		System.out.println("차 길이: " + length + "mm");
	}

	boolean move(double dx, double dy) {
		double dist = Math.sqrt(dx * dx + dy * dy);
		if (dist > fuel)
			return false;
		else {
			fuel -= dist;
			x += dx;
			y += dy;
			return true;
		}
	}
}
