package design_patton;
//어댑터를 번역하면 변환기 converter라고 할 수 있음
//변환기의 역할은 서로 다른 두 인터페이스 사이에 통신이 가능하게 하는 것

class ServiceA {
	void runServiceA() {
		System.out.println("ServiceA");
	}
}

class ServiceB {
	void runServiceB() {
		System.out.println("ServiceB");
	}
}

public class Exam4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServiceA serviceA = new ServiceA();
		ServiceB serviceB = new ServiceB();

		serviceA.runServiceA();
		serviceB.runServiceB();
	}

}
