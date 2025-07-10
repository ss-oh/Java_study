package 변수;

public class TypeETC {

	public static void main(String[] args) {
		int a = 10;
		double b = 3.14;
		char c = 'A';
		String d = "Hello World"; 
		boolean e = true;
		
		System.out.println("=== 기본 출력 ===");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
		System.out.println("=== printf로 출력하기 ===");
		System.out.printf("정수형 변수 a : %d\n", a);
		System.out.printf("실수형 변수 b : %f\n", b);
		System.out.printf("문자 변수 c : %c\n", c);
		System.out.printf("문자열 변수 d : %s\n", d);
		System.out.printf("bool 변수 e : %b\n", e);
		
		
		int a1 = 10;
		int a2 = 123;
		int a3 = 123456;
		
		double b1 = 123.4567;
		double b2 = 25.987;
		
		System.out.println("=== 자리수 설정 ===");
		System.out.printf("%d\n", a1);
		System.out.printf("%6d\n", a1);
		System.out.printf("%6d\n", a2);
		System.out.printf("%6d\n", a3);
		
		System.out.printf("%.2f\n", b1);
		System.out.printf("%.1f\n", b2);
	}

}
