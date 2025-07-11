package TeamProject;

public class Cosmetic extends Product{
	
	public Cosmetic(int price, int stock, int productId, String name) {
		this.price = price;
		this.stock = stock;
		this.productId = productId;
		this.name = name;
	}
	Cosmetic[] cosmetic = {
			
	new Cosmetic(10000, 1, 22, "아이라이너"),
	new Cosmetic(106600, 2, 23, "썬크림"),
	new Cosmetic(2030, 3, 35, "립스틱")
	};
}

