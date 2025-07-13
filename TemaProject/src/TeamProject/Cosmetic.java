package TeamProject;

public class Cosmetic extends Product{

	public Cosmetic(int price, int stock, int productId, String name) {
		super(price, stock, productId, name);
		// TODO Auto-generated constructor stub
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

