package 입력문;

import java.util.Scanner;

public class Study01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("두개의 숫자의 합과 평균값 계산기");
		System.out.println("두개의 숫자를 입력하세요");
		
		System.out.print("첫번째 숫자 입력: ");
		int a = sc.nextInt();
		
		System.out.print("두번째 숫자 입력: ");
		int b = sc.nextInt();
		
		System.out.println("합은" + (a + b) + "입니다.");
		System.out.println("평균값은" + (a + b) / 2 + "입니다." );

	}

}
