package 복습;

public class Tire {
	
	String brand;
	int size;
	
	public void setTire(String brand, int size) {
		this.brand = brand;
		this.size = size;
	}
	
	public void showInfo() {
		System.out.println(brand);
		System.out.println(size);
	}
	
}
