package 도서관리;

public class Library {
	
	String name;
	String tel;
	Book[] books; //서점이 보유하고 있는 책들
	int numBook; // 현재 서점이 가지고 있는 책 권수
	Book[] sellBooks; //판매된 책 목록을 저장하는 배열
	int numSellBook; //판매된 책 종류 갯수를 저장 (ex)1번 배열방 1개 팔림)
	
	Library(String name, String tel, int maxSize){
		this.name = name;
		this.tel = tel;
		this.books = new Book[maxSize];
		this.sellBooks = new Book[maxSize];
		this.numBook = 0;
		this.numSellBook = 0;
		
		books[0] = new Book("자바의 정석", "남궁성", "한빛미디어", 15000, 1);
		books[1] = new Book("혼자 공부하는 파이썬", "윤인성", "길벗", 17000, 8);
		books[2] = new Book("모두의 알고리즘", "박정민", "위키북스", 12000, 20);
		
		
		
		this.numBook = 3;
	}
	
	//도서 등록기능 시작 ------------
//	=> 도서정보를 (5개)입력하고 엔터를 누르면 book객체를 만들어 줌 => 메서드로 보낼것임. => 도서등록끝
	
	public void addBook(Book book){
		
		if(numBook == books.length) {
			System.out.println("도서를 더 추가할 수 없습니다.");
			return; // 밑에 코드가 더이상 실행되지 않고 메서드 종료 ,break랑 비슷함
		}
		
		books[numBook] = book;
		numBook++;
		
		System.out.println("도서가 추가되었습니다.");
	}
	
	//도서등록기능 끝
	
	//도서 조회기능 시작 -------------------
	
	public void searchBook(String name) {
		// 도서를 찾았는지 못 찾았는지 여부를 나타내는 변수
		boolean isFound = false;
		
		for(int i=0; i<numBook; i++) {
			if(books[i].title.trim().contains(name)) {
				books[i].printBookInfo();
				isFound = true;
			}
		}
		
		if(!isFound)
			System.out.println("검색 결과가 없습니다.");
		
	}
	
	public void searchAll() {
		if(numBook ==0) {
			System.out.println("등록된 도서가 없습니다.");
			return;
		}
		
		for(int i=0; i<numBook; i++) {
			books[i].printBookInfo();
			
		}
	}
	public void deleteBook(String name) {
		
		int index = findBookIndex(name);
		
		if(index == -1) {
			System.out.println("삭제할 도서가 없습니다.");
			return;
		}
		
		for(int i = index; i<numBook-1; i++) {
			books[i] = books[i+1];
		}
		
		numBook--;
		
		System.out.println("삭제 완료!");
		
	}
	
	
	//도서판매 메서드 시작 --------------
	public void sellBook(String name) {
		
		int index = findBookIndex(name);
		
		if(index == -1) {
			System.out.println("해당 도서가 없습니다.");
			return;
		}
		 // 판매된 도서 정보를 판매된 목록에 추가하기위한 메서드
		addSellBook(books[index]);
		
		 //판매되어서 재고를 -1해줌
		books[index].stock --;
		System.out.println("판매금액 : " + books[index].price);
		System.out.println("판매 후 재고 : " + books[index].stock);
		if(books[index].stock == 0) {
			System.out.println("목록에서 제거합니다-----");
			deleteBook(name);
		}
		
	}
	
	
	//도서명과 일치하는 데이터의 배열방 번호를 찾아주는 메서드
	public int findBookIndex(String name) {
		int index = -1; // 배열방 번호를 저장하는 변수, 도서가 없으면 -1
		
		//도서명과 일치하는 배열방 번호를 알기위한 반복문시작 --------------
			for(int i = 0; i<numBook; i++) {
				if(books[i].title.trim().equals(name)) {
					index = i; // i : 해당 도서면이 있는 배열방 번호
				}
			}
			
			return index;
	}
	
	public void addSellBook(Book book) {
		Book sellBook = new Book( book.title, book.price );
		int index = -1;
		
		for(int i =0; i<numSellBook; i++) {
			if(sellBooks[i].title.equals(sellBook.title)) {
				index = i;
			}
		}
		
		if( index == -1) {
			sellBooks[numSellBook] = sellBook;
			numSellBook++;
		}else {
			sellBooks[index].count++;
		}
	}
	
	public void printSellBook() {
		
		for(int i = 0; i<numSellBook; i++) {
			System.out.println(sellBooks[i].title + " | " + sellBooks[i].price + " | " + sellBooks[i].count);
		}
		
	}
	
}
