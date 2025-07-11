package TeamProject;

import java.util.Scanner;

import TeamProject.Product;
import TeamProject.Drink;
import TeamProject.Cloth;
import TeamProject.Cosmetic;

public class ShoppingMallMain {

	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		int num;
		Product gangdong = new Product("강동지점", "123-456", 10);
		Product gangnam = new Product("강남지점", "123-456", 10);
		
		
		Library selectedLibrary = null;
		
		while(true) {
			System.out.println("교보문고 통합 관리 시스템");
			System.out.println("지점 목록");
			System.out.println("1. 강남지점");
			System.out.println("2. 강동지점");
			System.out.println("0. 종료");
			num = sc.nextInt();
			
			if(num == 1) {
				 selectedLibrary = gangnam;
			}else if(num ==2){
				 selectedLibrary = gangdong;
			}else if (num == 0) {
				break;
			}else {
				System.out.println("잘못 입력하셨습니다.");
			}
		
		
		System.out.println("=== " + selectedLibrary.name + " 도서관리 프로그램 ===");
		
		while(true) {
			System.out.println("1. 상품 전체 조회");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 삭제");
			System.out.println("5. 도서 판매");
			System.out.println("6. 판매 내역 조회");
			System.out.println("7. 종료");
			System.out.println("메뉴를 입력하세요 : ");
			
			int menu = sc.nextInt();
			
			if(menu ==1) {
				System.out.println("도서명 : ");
				String title = sc.next();
				System.out.println("저자 : ");
				String author = sc.next();
				System.out.println("출판사 : ");
				String publisher = sc.next();
				System.out.println("가격 : ");
				int price = sc.nextInt();
				System.out.println("재고 : ");
				int stock = sc.nextInt();
				
				Book book = new Book(title, author, publisher, price, stock);
				
				selectedLibrary.addBook(book);
				
			}else if(menu == 2) {
				selectedLibrary.searchAll();
			}else if(menu == 3) {
				System.out.print("조회 할 도서명을 입력하세요 : ");
				String searchWord = sc.next();
				selectedLibrary.searchBook(searchWord);
			}else if(menu == 4) {
				sc.nextLine();
				System.out.print("삭제 할 도서명을 입력하세요 : ");
				String name =sc.nextLine().trim();
				selectedLibrary.deleteBook(name);
			}else if(menu == 5) {
				sc.nextLine();
				System.out.print("판매할 도서명 입력 : ");
				String name = sc.nextLine();
				
				selectedLibrary.sellBook(name);
			}else if( menu == 6){
				selectedLibrary.printSellBook();
			}else {
				System.out.println("종료합니다.");
				System.exit(menu);
			}
		  }
		}

}

}
