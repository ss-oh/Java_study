package 쇼핑몰연습;

public class ShoppingCart {

	Product[] products;
	int productCount;
	
	ShoppingCart(int maxSize){
		this.products = new Product[maxSize];
		this.productCount = 0;
		
		products[0] = new Product(1, "청바지", 20000 , 20);
		products[1] = new Product(2, "티셔츠", 12000 , 50);
		this.productCount = 2;
	}
	
	public void getAll() {
		if(productCount == 0) {
			System.out.println("장바구니가 비어있습니다.");
			return;
		}
		for(int i = 0; i<productCount; i++) {
			products[i].printProductInfo();
		}
	}
	
	public void addProduct(int productId, String name, int price, int stock) {
		
		int cnt = 0;
		
		for(int i=0; i<productCount; i++) {
			if( productId == products[i].productId) {
				products[i].stock += stock;
				cnt++;
				break; // 어차피 같은건 하나만 있으므로 뒤는 비교 안해도 되니까 반복종료
			}
		}
		
		if(cnt == 0 && productCount == products.length) {
			System.out.println("상품을 더 이상 추가할 수 없습니다.");
			return;
		}
		
		if( cnt == 0 ) {
			products[productCount] = new Product(productId, name, price, stock);
			productCount++;
		}
		System.out.println("장바구니 추가 완료");
		
	}
	
	public void deleteProduct(int productId, String name, int price, int stock) {
		int cnt =0;
		for(int i =0; i <productCount; i++) {
			products[i].stock -= stock;
			cnt++;
			break;
		}
		if(cnt < 0 && productCount == products.length) {
			System.out.println("상품을 더 이상 삭제 할 수 없습니다.");
			return;
		}
		if( cnt == 0 ) {
			products[productCount] = new Product(productId, name, price, stock);
			productCount--;
		}
		System.out.println("장바구니 제거 완료");
	}
	
	public void calculateTotalPrice() {
		
		for(int i = 0; i <productCount; i++) {
			int sum =0;
			int productsPrice = products[i].price*products[i].stock;
			System.out.println("총 금액은"+productsPrice);
			sum = productsPrice+sum;
		}
		
	}
	
	
	
	
	
	
}
