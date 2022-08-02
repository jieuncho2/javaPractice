package chapter09;

public class Exam03 {
	public static void main(String[] args) {
		int a = 0;
		int b = 2;
		try {
			System.out.println("외부로 접속");
			int c = b / a;
			System.out.println("연결 해제");
		} catch (/* Arithmetic */Exception e) {
			System.out.println("오류가 발생했습니다.");
		} finally {
			System.out.println("연결 해제");
		}
		System.out.println("여기도 수행됩니다.");
	}
}
