package 싱글톤;

public class Singleton {
	String name;
	int id;
	private static Singleton singleton = new Singleton();
	
	private Singleton() {
		name = "test";
		id = 123;
	}
	
	public static Singleton getSingleton() {
		
		return singleton;
	}
	
	
	
}









