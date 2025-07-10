package 연산자;

import java.util.Scanner;

public class 연습02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.println("두 자연수를 입력 : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		System.out.println( num1 * (num2 % 10) ); // 일의 자리 곱한거
		System.err.println( num1 * (num2 / 10 % 10) ); // 십의 자리 곱한거
		System.out.println( num1 * (num2 / 100) ); // 백의 자리 곱한거
		System.out.println( num1 * num2 ); // 다 곱한거

	}

}
