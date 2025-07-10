package s04인터페이스;

public class Bird implements Animal, Flyable {

	@Override
	public void fly() {
		System.out.println("날아다님");
	}

	@Override
	public void sound() {
		System.out.println("짹짹");
	}

}
