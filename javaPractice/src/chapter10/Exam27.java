package chapter10;

public class Exam27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String javaStr = new String("java");
		String androidStr = new String("android");
		System.out.println(javaStr);
		System.out.println("처음 문자열 주소 값: " + System.identityHashCode(javaStr));
		
		javaStr = javaStr.concat(androidStr);
		
		System.out.println(javaStr);
		System.out.println("연결된 문자열 주소 값: " + System.identityHashCode(javaStr));
		
		javaStr = "new java";
		System.out.println(javaStr);
		System.out.println("값을 변경한 문자열 주소 값: " + System.identityHashCode(javaStr));
	}

}
