package 접근제한자2;

import 접근제한자1.Animal;

public class AnimalMain {
	public static void main(String[] args) {
//		접근제한자1 패키지에 있는 Animal클래스의
//		생성자에 접근제한자가 생략되어있음(default)
//		그래서 다른 패키지에서는 객체 생성을 못함
//		Animal cat = new Animal();
		
//		매개변수가 2개인 생성자는 public이므로 가능
		Animal cat = new Animal("네로", 10);
		
//		private이니까 당연히 접근 못함
//		System.out.println(cat.name);
//		생략(default)이므로 접근 못함
//		System.out.println(cat.age);
		
		
		System.out.println( cat.getName() );
		
//		default이므로 접근 불가( 같은 패키지만 가능 )
//		cat.gender = "남";
		
	}
}












