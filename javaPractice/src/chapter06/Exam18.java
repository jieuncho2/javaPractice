package chapter06;

public class Exam18 {

	static int abs(int value) {
		// TODO Auto-generated method stub
//		if(value > 0) {
//			return value;
//		} else {
//			return value * -1;
//		}
		return (value > 0) ? value : value * -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value = 5;
		System.out.println(value + "의 절대값: " + abs(value));
		value = -10;
		System.out.println(value + "의 절대값: " + abs(value));
	}

}
