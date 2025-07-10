package 오버라이딩;

public class Parent {
	String name;
	
	public Parent(String name) {
		this.name = name;
	}
	
	public void showInfo() {
		System.out.println("성함 : " + name);
	}
	
	public static void test() {
		System.out.println("부모 테스트");
	}
	
}
