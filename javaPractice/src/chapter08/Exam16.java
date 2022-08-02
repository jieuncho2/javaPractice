package chapter08;

class Outter1 {
	int outNum = 100;
	static int sNum = 200;

	Runnable getRunnable(int i) {
		int num = 100;

		class MyRunnable implements Runnable {
			int localNum = 10;

			@Override
			public void run() {
//				num = 200; //에러 발생 지역 변수는 상수로 바뀜 값은 변경 못 해도 보는 것은 가능
//				i = 100; //에러 발생 매개 변수 역시 지역 변수처럼 상수로 바뀜 값은 변경 못 해도 보는 것은 가능 
				// TODO Auto-generated method stub
				System.out.println("i = " + i); // 값은 변경 못 해도 보는 것은 가능
				System.out.println("num = " + num); // 값은 변경 못 해도 보는 것은 가능
				System.out.println("localNum = " + localNum);

				System.out.println("outNum = " + outNum + "(외부 클래스 인스턴스 변수)");
				System.out.println("Outter1.sNum = " + Outter1.sNum + "(외부 클래스 정적 변수)");
			}

		}
		return new MyRunnable();
	}
}

public class Exam16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outter1 out = new Outter1();
		Runnable runner = out.getRunnable(10);
		runner.run();
	}

}
