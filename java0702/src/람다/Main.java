package 람다;

public class Main {

	public static void main(String[] args) {
		
		Calc calc = (int a, int b) -> {
			return a+b;
		};
		
		System.out.println( calc.sum(10, 20));
		
		Calc calc2 = (int a, int b) -> {
			System.out.println(a);
			System.out.println(b);
			return a+b/2;
		};
		
		System.out.println(calc2.sum(30, 40));
	}

}
