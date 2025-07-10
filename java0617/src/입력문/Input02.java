package 입력문;

import java.util.Scanner;

public class Input02 {

	public static void main(String[] args) {
		// 정수말고 다른 자료형 입력받는 방법
		
		Scanner sc = new Scanner(System.in);
		
		double a;
		char b;
		String c;
		
		System.out.print("실수 입력 : ");
		a = sc.nextDouble();
		
		System.out.print("문자열 입력 : ");
		c = sc.next();
//		c = sc.nextLine(); 이것도 가능함
		
		System.out.print("문자 입력 : ");
		b = sc.next().charAt(0); //charAt(0) <= 첫번째 글자만 가져옴
		
		System.out.println("==========");
		System.out.println("입력한 실수 : " + a);
		System.out.println("입력한 문자열 : " + c);
		System.out.println("입력한 문자 : " + b);
		
		

	}

}
