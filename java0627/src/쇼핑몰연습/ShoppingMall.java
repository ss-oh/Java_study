package 쇼핑몰연습;

import java.util.Scanner;

public class ShoppingMall {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//쇼핑몰에서 판매중인 상품 목록
		Product[] products = {
			new Product(1, "청바지", 20000, 30),
			new Product(2, "티셔츠", 12000, 80),	
			new Product(3, "모자", 15000, 80)	
		};
		
		ShoppingCart cart = new ShoppingCart(10);
		
		int menu;
		
		while(true) {
			
			System.out.println("=====================================");
			System.out.println("0. 판매상품보기");
			System.out.println("1. 장바구니 전체 조회");
			System.out.println("2. 장바구니 상품 추가");//쇼핑몰에서 파는 상품을 번호로 추가
			System.out.println("3. 장바구니 상품 삭제");
			System.out.println("4. 상품 총 가격 계산");
			System.out.println("9. 종료");
			
			menu = sc.nextInt();
			
			switch (menu) {
			
				case 0 -> {
					System.out.println("======= 쇼핑몰에서 판매중인 상품목록 =======");
					for(Product p : products) {
						p.printProductInfo();
					}
					
				}
				
				case 1 -> {
					cart.getAll();
					
				}
				case 2 -> {
					System.out.println("장바구니에 추가 할 상품의 번호를 입력하세요 : ");
					int productId = sc.nextInt();
					System.out.println("수량을 입력하세요 : ");
					int stock = sc.nextInt();
					
					cart.addProduct(productId, products[productId-1].name, products[productId-1].price, stock);
					
				}
				case 3 -> {
					System.out.println("장바구니에서 제거 할 상품의 번호를 입력하세요 : ");
					int productId = sc.nextInt();
					System.out.println("수량을 입력하세요 : ");
					int stock = sc.nextInt();
					
					cart.deleteProduct(productId, products[productId-1].name, products[productId-1].price, stock);
				}
				case 4 -> {
					cart.calculateTotalPrice();
				}
				
				case 9 -> {
					break;
				}
			
			
			
			
			
			}
			
			
			
			
		}

	}

}
