package day07_study01;

public class BookTest {

	public static void main(String[] args) {
		Book book1 = new Book();
		Book book2 = new Book("책1", "저자1", 20000);
		Book book3 = new Book("책2", "저자2", 21000);
		Book book4 = new Book("책3", "저자3", 22000);
		Book book5 = new Book("책4", "저자4", 23000);
		
		System.out.println(book1.getBookInfo());
		System.out.println(book2.getBookInfo());
		System.out.println(book3.getBookInfo());
		System.out.println(book4.getBookInfo());
		System.out.println(book5.getBookInfo());
		
	}

}
