package design_patton;

class Singleton{
	private static Singleton singeltonObject;
	
	private Singleton() {}
	
	private int page;
	
	public static Singleton getInstance(){
		if(singeltonObject == null) {
			singeltonObject = new Singleton();
		}
		return singeltonObject;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}
	
}

public class Exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Singleton s = new Singleton(); //private 생성자이므로 new를 통해 인스턴스를 생성할 수 없다
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		s1.setPage(10);
		
		System.out.println("s1 :: page: " + s1.getPage());
		System.out.println("s2 :: page: " + s2.getPage());
		System.out.println("s3 :: page: " + s3.getPage());
	}

}
