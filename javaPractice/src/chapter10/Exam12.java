package chapter10;

public class Exam12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		StringBuffer와 StringBuilder 클래스 활용
//		프로그램을 만들다 보면 문자열을 변경하거나 연결해야 하는 경우가 많음
//		하지만 String 클래스는 한번 생성되면 그 내부의 문자열이 변경되지 않기 때문에
//		String 클래스를 사용하여 계속 문자열을 연결하거나 변경하는 프로그램을 작성하면 메모리가 많이 낭비
//		이 문제를 해결하는 것이 StringBuffer와 StringBuilder 클래스
		
		String javaStr = new String("Java");
		System.out.println("javaStr 문자열 주소: " + System.identityHashCode(javaStr)); //처음 생성된 메모리 주소
		
		//String으로부터 StringBuilder 생성
		StringBuilder buffer = new StringBuilder(javaStr);
		System.out.println("연산 전 buffer 메모리 주소: " + System.identityHashCode(buffer)); //buffer 메모리 주소
		
		buffer.append(" and"); //문자열 추가
		buffer.append(" android"); //문자열 추가
		buffer.append(" programming is fun!!"); //문자열 추가
		System.out.println("연산 후 buffer 메모리 주소: " + System.identityHashCode(buffer)); //buffer 메모리 주소
		
		javaStr = buffer.toString(); //String 클래스로 반환
		System.out.println(javaStr); //Java and android programming is fun!!
		System.out.println("새로 만들어진 javaStr 문자열 주소: " + System.identityHashCode(javaStr)); //새로 생성된 메모리 주소
	}

}