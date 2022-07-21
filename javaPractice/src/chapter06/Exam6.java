package chapter06;

public class Exam6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		
		System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
		System.out.println("t2의 channel값은 " + t2.channel + "입니다.");
		
		t1.channel = 7;
		System.out.println("t1의 channel값을 7로 변경합니다.");
		System.out.println("t1의 channel값을 " + t1.channel + "입니다.");
		System.out.println("t2의 channel값을 " + t2.channel + "입니다.");
	}
}
