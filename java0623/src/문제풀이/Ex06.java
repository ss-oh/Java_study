package 문제풀이;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// 두 정수를 입력받아 입력한 정수 사이에 합계를 구하고
//		합계가 짝수인지 홀수인지 구하는 프로그램
//		단, 입력받는 수는 작은 수 큰 수 순서 상관없이 입력해도 처리되어야 함
		
		
		Scanner sc = new Scanner(System.in);
		
		int num1, num2, min, max, total=0;
		
		
		
		
		System.out.println("두 정수를 입력하세요 : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		min = num1;
		max = num2;
		
		if(num1>num2) {
			min = num2;
			max = num1;
		}
		
		System.out.println("입력받은 값 : " + min + " , " + max);
		for(int i = min; i<=max; i++) {
			
			total = total+i;
			
		}
		
		
		System.out.println("두 정수 사이의 합게 : " + total);
		if(total%2==0) {
			System.out.println("짝수입니다.");
		}else {
			System.out.println("홀수입니다.");
		}
		

	}

}
