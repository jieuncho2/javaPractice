package chapter11;

import java.util.ArrayList;

class MyBook implements Cloneable{
	String title;

	public MyBook(String title) {
		super();
		this.title = title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return title;
	}
	
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
}
public class Exam25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<MyBook> bookList = new ArrayList<MyBook>();
		
		MyBook book1 = new MyBook("자바");
		MyBook book2 = new MyBook("안드로이드");
		MyBook book3 = new MyBook("파이썬");
		
		bookList.add(book1);
		bookList.add(book2);
		bookList.add(book3);
		
		ArrayList<MyBook> copyList = (ArrayList)bookList.clone();
		copyList.add(new MyBook("c++"));
		System.out.println(bookList);
		System.out.println(copyList);
		
		book3.setTitle("C언어");
		System.out.println(bookList);
		System.out.println(copyList);
	}

}
