package s03추상클래스와메서드;

public class Main {
	public static void main(String[] args) {

//		Shape shape = new Shape(); 추상 클래스는 객체생성 불가능
		
		Rectangle r = new Rectangle(3.5, 10);
		System.out.println( r.calcArea() );
		
		Shape circle = new Circle(6);
		System.out.println( circle.calcArea() );
		
		
	}
}
