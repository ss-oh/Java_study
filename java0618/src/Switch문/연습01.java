package Switch문;

import java.util.Scanner;

public class 연습01 {

	public static void main(String[] args) {
		//숫자를 입력받아 해당 숫자가 5의 배수인지 아닌지 출력하는 프로그램
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("숫자를 입력하세요 : ");
		num = sc.nextInt();
		
		switch (num % 5) {
		case 0: 
			System.out.println("5의 배수입니다");
			break;
		
		
		default:
			System.out.println("아닙니다.");
		}
	}

}
