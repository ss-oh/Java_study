package 입력문;

import java.util.Scanner;

public class Study011 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1, num2; // 입력한 숫자를 저장하는 변수
		
		System.out.print("첫번째 숫자를 입력하세요 : ");
		num1 = sc.nextInt();
		System.out.print("두번째 숫자를 입력하세요 : ");
		num2 = sc.nextInt();
		
		System.out.println("합 : " + (num1 + num2));
		System.out.println("평균 : " + (double) (num1 + num2) / 2);

	}

}
