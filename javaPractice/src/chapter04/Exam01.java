package chapter04;

public class Exam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int book = 15;
		book = book / 10;
		switch(book) {
		case 0:
			System.out.println("조금 더 노력하세요!");
			break;
		case 1:
			System.out.println("책 읽는 것을 즐기는 분이시네요!");
			break;
		case 2:
			System.out.println("책을 사랑하는 분이시네요!");
			break;
		default:
			System.out.println("당신은 다독왕입니다!");
		}
	}

}
