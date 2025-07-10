package 제네릭;


class Shape {}
class Circle extends Shape {} //extends를 사용해서 shape와 shape를 상속받는 circle만 사용하게 만듬 
class Rectangle {}

class Box<T extends Shape>{
	
}

public class Main02 {

	public static void main(String[] args) {
		

		Box<String> b = new Box<>(); //사용불가
		Box<Shape> b1 = new Box<>(); //사용가능
		Box<Circle> b2 = new Box<>(); //사용가능
		Box<Rectangle> b3 = new Box<>(); //사용불가
		
	}

}
