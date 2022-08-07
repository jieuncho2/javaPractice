package chapter10;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Exam33 {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Class strClass = Class.forName("java.lang.String");
		System.out.println(strClass.getName());
		
		
		Constructor[] constructors = strClass.getConstructors();
		System.out.println("모든 생성자 가져오기");
		for(Constructor c : constructors) {
			System.out.println(c);
		}
		
		System.out.println();
		System.out.println("모든 멤버 변수 가져오기");
		Field[] fields = strClass.getFields();
		for(Field f : fields) {
			System.out.println(f);
		}
		
		System.out.println();
		System.out.println("모든 메서드 가져오기");
		Method[] methods = strClass.getMethods();
		for(Method m : methods) {
			System.out.println(m);
		}
	}

}
