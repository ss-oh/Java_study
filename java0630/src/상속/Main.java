package 상속;

public class Main {
	public static void main(String[] args) {
		
		Dog dog = new Dog();
		
		dog.name = "흰둥이";
		dog.age = 10;
		
		dog.getName();
		dog.getAge();
		
		Animal a = new Animal();
		
		a.name = "ㅋㅋㅋ";
		a.getName();
		
//		a.age = 2; age는 자식 클래스가 추가한 변수이므로 부모는 사용 불가능
		
	}
}











