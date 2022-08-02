package chapter08;
class Outter2{
	Runnable getRunnable(int i) {
		int num = 100;
		return new Runnable() { //1)메서드를 호출할 떄 생성
//			익명 내부 클래스 리턴 용도로만 사용할 것이라서 익명 내부 함수 사용 클래스를 바로 생성
			@Override
			public void run() {
				// TODO Auto-generated method stub
//				num = 200; //에러 발생
//				i = 10; //에러 발생
				System.out.println(i);
				System.out.println(num);
			}
		};
	}
	
	Runnable runner  = new Runnable() { //2)참조 변수에 대입할 때 new 예약어를 사용하여 생성
//		익명 내부 클래스 객체 생성시 run() 메소드만 오버라이딩 해서 사용
		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("Runnable이 구현될 익명 클래스 변수");
		}
	};
}
public class Exam17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outter2 out = new Outter2();
		
		Runnable runnable = out.getRunnable(10);
		runnable.run();
		
		out.runner.run(); //Runnable이 구현된 익명 클래스 변수 객체.내부.메서드() 형식으로 접근
	}

}
