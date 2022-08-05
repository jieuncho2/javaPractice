package chapter11;

public class Exam32 {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Person person = new Person();
		
		Class pClass1 = person.getClass();
		System.out.println(pClass1.getName());
		
		Class pClass2 = Person.class;
		System.out.println(pClass2.getName());
		
		Class pClass3 = Class.forName("chapter11.Person");
		System.out.println(pClass3.getName());
		System.out.println(1);
	}

}
