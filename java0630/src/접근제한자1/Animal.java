package 접근제한자1;

public class Animal {
	private String name;
	int age;
	protected String gender;
	
	Animal() {
		this.name = "나비";
		this.age = 5;
	}
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return this.name;
	}
	
	
}
