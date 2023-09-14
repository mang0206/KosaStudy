package day15_study01;

import day07_study01.Book;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AnoyInnerLab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Book> book = new ArrayList<>();
		
		book.add(new Book("자바의 정석", "남궁성", 27000));
		book.add(new Book("챗GPT", "반병현", 11700));
		book.add(new Book("스타트 스프링 부트", "남가람", 27000));
		book.add(new Book("Doit! 자바프로그래밍", "박은중", 22500));
		book.add(new Book("이것이 자바다", "신용권,임경균", 36000));
		
		for(Book b: book)
			System.out.println(b.getBookInfo());
		
		Collections.sort(book, new Comparator<Book>() {
			
			public int compare(Book o1, Book o2) {
				if(o1.getPrice() > o2.getPrice()) return 1;
				else if(o1.getPrice() == o2.getPrice()) return 0;
				else return -1;
			}
		});
		
		System.out.println("[소팅 후]");
		
		for(Book b: book)
			System.out.println(b.getBookInfo());
	}

}
