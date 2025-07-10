package 싱글톤;

public class SingletonMain {
	public static void main(String[] args) {
//		생성자가 private이므로 생성자 호출 불가능
//		Singleton s1 = new Singleton();
		
		Singleton s2 = Singleton.getSingleton();
		Singleton s3 = Singleton.getSingleton();
		
		System.out.println(s2.name);
		System.out.println(s3.name);
		
		s2.name = "홍길동";
		
		System.out.println(s2.name);
		System.out.println(s3.name);
	}
}
