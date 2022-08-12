package chapter14;

import java.io.IOException;

public class Exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("알파벳 하나를 쓰고 [Enter]를 누르세요.");

		int i;
		try {
			// System.in: 표준 입력 스트림
			i = System.in.read();
			// System.out: 표준 출력 스트림
			System.out.println(i);
			System.out.println((char) i);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
