package chapter11;
class Book{
	int bookNumber;
	String bookTitle;
	public Book(int bookNumber, String bookTitle) {
		super();
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return bookNumber + ", " + bookTitle;
	}
	
}
public class Exam20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book1 = new Book(200, "개미");
		
		System.out.println(book1);
		System.out.println(book1.toString());
	}

}
