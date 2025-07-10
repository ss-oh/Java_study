package 쇼핑몰연습;

public class Product {
	
	int productId;
	String name;
	int price;
	int stock;
	
	Product(int productId, String name, int price, int stock) {
		this.productId = productId;
		this.name = name;
		this.price = price;
		this.stock = stock;
	}
	
	public void printProductInfo() {
		System.out.println("상품ID : " + productId + " | " +  "상품명 : " + name + " | " + "가격 : " + price + " | " + "재고 : " + stock);
	}
	
	
	
}
