package 정적멤버;

import 싱글톤.Singleton;

public class BankMain {
	public static void main(String[] args) {
		
		// 정적변수 : 같은 클래스로 만든 객체들이 전부 공유하는 변수
		Bank b1 = new Bank();
		Bank b2 = new Bank();
		
		b1.name = "홍길동";
		b2.name = "고길동";
		
		System.out.println(b1.name);
		System.out.println(b2.name);

		
		// count는 정적변수이므로 b1을 통해 변경해도 b2도 따라 바뀜
		// 실제 정적변수 사용은 객체를 통해서 작업하지는 않음
		b1.count = 10;
		
		System.out.println(b1.count);
		System.out.println(b2.count);
		
		// 정적변수는 공용변수이므로 클래스를 통해서 제어를 함
		Bank.count = 20;
		
		System.out.println(Bank.count);
		System.out.println(b1.count);
		System.out.println(b2.count);
		
		
		Bank.test();
		
//		Math클래스의 정적변수와 정적메서드이므로 객체생성없이 사용이 가능함
//		Math.PI;
//		Math.random();
	}
}












