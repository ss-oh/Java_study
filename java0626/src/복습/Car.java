package 복습;

public class Car {
	
	String model;
	String color;
	int price;
	Tire tire;
	
	public void setCar(String model, String color, int price) {	
		this.model = model;
		this.color = color;
		this.price = price;
	} //설정용 메서드
	
	public void showInfo() {
		System.out.println(model);
		System.out.println(color);
		System.out.println(price);
		tire.showInfo();
	}
	
	public void setTire( Tire tire) {
		this.tire = tire;
		System.out.println();
	}
}
