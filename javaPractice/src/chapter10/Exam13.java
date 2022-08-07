package chapter10;


public class Exam13 {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		
//		Class 클래스를 선언하고 클래스 정보를 가져오는 방법은 3가지
//		
//		1. Object 클래스의 getClass() 메서드 사용하기
//		String s = new String();
//		Class c = s.getClass(); //getClass() 메서드 반환형은 Class
//		
//		2. 클래스 파일 이름은 Class 변수에 직접 대입하기
//		Class c = String.class;
//		
//		3. Class.forName("클래스 이름") 메서드 사용하기
//		Class c = Class.forName("java.lang.String");
		
		
		Person person = new Person();
		
		Class pClass1 = person.getClass(); //Object의 getClass() 메서드 사용하기
		System.out.println(pClass1.getName());
		
		Class pClass2 = Person.class; //직접 class 파일 대입하기
		System.out.println(pClass2.getName());
		
		Class pClass3 = Class.forName("chapter10.Person"); //클래스 이름으로 가져오기
		System.out.println(pClass3.getName());
	}

}
