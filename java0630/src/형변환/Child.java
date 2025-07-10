package 형변환;

public class Child extends Parent {

	int age;
	
	public void showInfo() {
		super.showInfo();
		System.out.println(age);
	}
	
	public void msg() {
		System.out.println("자식 클래스 메서드");
	}
	
}
