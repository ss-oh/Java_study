package 오버라이딩;

public class Child extends Parent {

	int age;
	
/*	
 * 생성자를 생략하면 아래 코드처럼 자동으로 만들어짐
 * 부모 클래스의 기본생성자가 없어서 안됨
	Child() {
		super();
	}
*/
	
	Child(String name, int age) {
		super(name);
		this.age = age;
	}

	public void showInfo() {
		super.showInfo();
		System.out.println("나이 : " + age);
	}
	
	public static void test() {
		System.out.println("자식 테스트");
	}
	
}











