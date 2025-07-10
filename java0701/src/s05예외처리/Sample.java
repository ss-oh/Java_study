package s05예외처리;

import java.util.Scanner;

public class Sample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		
		System.out.print("숫자 두개 입력 : ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		try {
			int result = a / b;
			System.out.println("결과 : " + result);
			
		} catch( ArithmeticException e ) {
			System.out.println("잘못된 계산");
		} finally {
			System.out.println("예외발생 여부 상관없이 실행");
			
		}
		
	}
}







