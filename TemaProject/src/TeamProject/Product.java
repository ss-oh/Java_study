package TeamProject;

public abstract class Product {
	private int price;
	private int stock;
	private int productId;
	private String name;
	
	public Product(int price, int stock, int productId, String name) {
		super();
		this.price = price;
		this.stock = stock;
		this.productId = productId;
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public abstract void showInfo();
	
}
