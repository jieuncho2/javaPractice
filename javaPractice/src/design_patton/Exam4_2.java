package design_patton;
//어댑터를 번역하면 변환기 converter라고 할 수 있음
//변환기의 역할은 서로 다른 두 인터페이스 사이에 통신이 가능하게 하는 것

class AdaterServiceA {
	ServiceA service = new ServiceA();
	void runService() {
		service.runServiceA();
	}
}

class AdaterServiceB {
	ServiceB service = new ServiceB();
	void runService() {
		service.runServiceB();
	}
}

public class Exam4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdaterServiceA asa1 = new AdaterServiceA();
		AdaterServiceB asb1 = new AdaterServiceB();

		asa1.runService();
		asb1.runService();
	}

}
