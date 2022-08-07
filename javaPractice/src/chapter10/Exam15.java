package chapter10;

//System 클래스
//자바 프로그램은 운영체제에서 바로 실행되는 것이 아니라 JVM 위에서 실행
//따라서 운영체제의 모든 기능을 직접 이용하기는 힘듦
//하지만 java.lang 패키지에 속하는 System 클래스를 이용하면 운영체제의 일부 기능을 이용할 수 있음
//즉 프로그램 종료, 키보드로부터의 입력, 모니터 출력, 현재 시간 읽기 등이 가능
//System 클래스의 모든 필드와 메서드는 정적 필드와 정적 메소드로 구현

public class Exam15 {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		
//		프로그램 종료 exit()
//		exit() 메서드는 현재 실행되고 있는 프로세스를 강제 종료 시키는 역할
//		int 매개 값을 지정하도록 되어 있는데 이 값을 종료 상태 값이라고 하고 일반적으로 정상 종료의 경우 0 값을 줌 
		
		for(int i = 0; i <=10; i++) {
			if(i == 5) {
				System.exit(0);
			}
		}
		System.out.println("마무리 코드");
	}

}