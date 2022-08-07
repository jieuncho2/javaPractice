package chapter10;

public class Exam10 {

	public static void main(String[] args) {
//		문자열 찾기
//		indexOf() 메서드는 매개값으로 주어진 문자열이 시작되는 인덱스를 리턴
//		만약에 주어진 문자열이 포함되어 있지 않으면 -1 반환
		// TODO Auto-generated method stub
		
		//문자열 포함 여부 조사
		String subject = "자바 프로그램";
		
		int location = subject.indexOf("프로그래밍");
		System.out.println(location);
		
		if(subject.indexOf("자바") != -1) {
			System.out.println("자바와 관련된 책이군요.");
		} else {
			System.out.println("자바와 관련 없는 책이군요.");
		}
	}

}
