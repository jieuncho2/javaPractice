package chapter10;

//자바의 모든 클래스와 인터페이스는 컴파일 되고 나면 class 파일로 생성됨
//java 파일이 컴파일되면 class 파일이 생성되고 이 class 파일에는 클래스나 인터페이스에 대한 변수, 메서드, 생성자 등의 정보가 들어 있음
//Class 클래스는 컴파일된 class 파일에 저장된 클래스나 인터페이스의 정보를 가져오는 데 사용
//
//상황에 따라 내가 작업하지 않은 클래스를 사용해야 할 때도 있고 반환받는 클래스가 정확히 어떤 자료형인지 모르는 경우가 생김
//모르는 클래스의 정보를 사용할 경우에는 우리가 클래스의 정보를 직접 찾아야 함

public class Person {
	private String name;
	private int age;

	public Person() {
		super();
	}

	public Person(String name) {
		this.name = name;
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}