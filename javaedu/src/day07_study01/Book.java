package day07_study01;

public class Book {
	String title;
	String author;
	int price;
	
	public Book() {
		this("이것이 자바다", "신용건", 36000);
	}
	public Book(String title, String author, int price){
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public String getBookInfo() {
		return "제목 : " + title + "\t" +  "저자 : " + author + "\t" + "가격 : " +price;
	}
	public int getPrice() {
		return price;
	}
}