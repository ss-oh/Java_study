package 연산자;

import java.util.Scanner;

public class 연습05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("숫자를 입력하세요 : ");
		num = sc.nextInt();
		
		boolean result = ( num % 2 != 0 );
		
				
		
		System.out.println( result ? "홀수" : "짝수");
		

	}

}
