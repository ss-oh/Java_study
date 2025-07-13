package TeamProject;

public class Drink extends Product{

	public Drink(int price, int stock, int productId, String name) {
		super(price, stock, productId, name);
		
	}

	@Override
	public void showInfo() {
		System.out.println("상품번호: " + getProductId());
	    System.out.println("상품명: " + getName());
	    System.out.println("가격: " + getPrice() + "원");
	    System.out.println("재고: " + getStock() + "개");
	    System.out.println("---------------------------");
	}

	
	
	
}
