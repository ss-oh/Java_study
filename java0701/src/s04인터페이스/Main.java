package s04인터페이스;

public class Main {
	public static void main(String[] args) {

		Animal dog = new Dog();
		Animal bird = new Bird();
		
		dog.sound();
		bird.sound();
		
		Flyable b = (Flyable) bird; 
//		Flyable c = (Flyable) dog;
		
		b.fly();
		
	}
}
