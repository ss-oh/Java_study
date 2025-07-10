package s03추상클래스와메서드;

public class Circle extends Shape {

	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double calcArea() {
		return radius * radius * Math.PI;
	}
	
}
