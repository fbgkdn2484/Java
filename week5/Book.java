package week5;

public class Book {
	String title, author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	public Book(String title) {
		this.author = "���ڹ̻�";
		this.title = title;
	}
	public static void main(String[] args) {
		
		Book littlePrince = new Book("�����", "�������丮");
		Book lovestory = new Book("������");
		System.out.println(littlePrince.title + " " + littlePrince.author);
		System.out.println(lovestory.title + " " + lovestory.author);
		
	}
}
