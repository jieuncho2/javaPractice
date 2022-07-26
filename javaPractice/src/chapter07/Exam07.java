package chapter07;

final class FinalClass {
	final int number = 4;
}

class Parents /* extends FinalClass //에러 발생 */ {
	final void finalMathod() {
		System.out.println("상속 불가한 메서드");
	}
}

class Son extends Parents {
//	void finalMathod(); //에러 발생
}

public class Exam07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalClass member1 = new FinalClass();
		System.out.println(member1.number);
//		member1.number = 5; //상수는 변경 불가
	}

}
