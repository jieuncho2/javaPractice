package chapter10;

public class Exam03 {
//	int hashCode(): 객체의 해쉬 코드 값을 반환
//	해시는 정보를 저장하거나 검색할 떄 사용하는 자료 구조
//	정보를 어디 저장할 것인지 해시 함수를 사용하여 구현
//	
//	해시 함수는 객체의 특정 정보(키 값)을 매개 변수 값으로 넣으면 그 객체가 저장되어야 할 위치나
//	저장된 해시 테이블 주소(위치)를 반환
//	따라서 객체 정보를 알면 해당 객체의 위치를 빠르게 검색할 수 있음
//	
//	자바에서는 인스턴스를 힙 메모리에 생성하여 관리할 때 해시 알고리즘을 사용
//	Object 클래스의 toString() 메서드 원형을 다시 살펴보면
//	getClass().getName() + "@" + Integer.toHexString(hashCode())
//	즉 우리가 참조 변수를 출력할 때 본 16진수 숫자 값이 '해시 코드 값'이고
//	이 값은 자바가상머신이 힙 메모리에 저장한 '인스턴스 주소 값'
//	그래서 자바에서는 두 인스턴스가 같다면 hashCode()에서 반환하는 해쉬 코드 값이 같아야 함
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String, Integer 클래스의 hashCode() 메서드 재정의
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1.hashCode()); //96354 abc 문자열의 헤시 코드 값 출력
		System.out.println(str2.hashCode()); //96354 abc 문자열의 헤시 코드 값 출력
		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		
		System.out.println(i1.hashCode()); //100 Integer(100)의 해시 코드 값 출력
		System.out.println(i2.hashCode()); //100 Integer(100)의 해시 코드 값 출력
	}

}
