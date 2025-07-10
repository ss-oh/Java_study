package s03추상클래스와메서드;

public class Rectangle extends Shape {

	private double width;
	private double height;
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public double calcArea() {
		
		return width * height;
	}
	
	
	
}
