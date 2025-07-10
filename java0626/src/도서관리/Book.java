package 도서관리;

public class Book {
	
	String title;
	String author;
	String publisher;
	int price;
	int stock;
	int count; //도서가 판매된 개수를 저장
	
	Book(String title, int price){
		this.title = title;
		this.price = price;
		this.count = 1;
	}
	
	
	public Book(String title, String author, String publisher, int price, int stock) {

		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
		this.stock = stock;
		
	}
	
	
	
	//책 정보를 출력해주는 메서드 시작-------------
	public void printBookInfo() {
		System.out.println(title + " | " + author + " | " + publisher + " | " + price + " | " + stock);
	}
	
}
