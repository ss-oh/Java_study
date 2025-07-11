package TeamProject;

public class Cloth extends Product {

	
	public Cloth(int price, int stock, int productId, String name) {
		this.price = price;
		this.stock = stock;
		this.productId = productId;
		this.name = name;
	}
	Cloth[] cloth = {
			
	new Cloth(1000, 1, 22, "청바지"),
	new Cloth(1000, 2, 23, "반바지"),
	new Cloth(2030, 3, 35, "레깅스")
	};
	
	
	
	
	
}
