package chapter07;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buyer b = new Buyer();
		Tv tv = new Tv();
		Computer com = new Computer();
		Audio aud = new Audio();

		b.buy(tv);
		b.buy(com);
		b.buy(aud);
		b.summary();
		System.out.println();

		System.out.println("현재 남은 돈은 " + b.money + "만원입니다.");
		System.out.println("현재 포인트 점수는 " + b.bonusPoint + "점입니다.");
	}

}
