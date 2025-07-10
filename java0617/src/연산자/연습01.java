package 연산자;

import java.util.Scanner;

public class 연습01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int money;
		
		System.out.println("금액을 입력 : ");
		
		money = sc.nextInt();
		
		
		System.out.println("=== 결과 ===");
		System.out.println("5만원 : " + money / 50000 +  "장");
		
		money = money % 50000; // 5만원 제외한 나머지 금액
		
		System.out.println("만원 : " +  money / 10000 + "장");
		
		money %= 10000; //만원 제외 나머지 금액
		System.out.println("5천원 : " + money / 5000 +  "장");
		
		money %= 5000; //오천원 제외 나머지 금액
		System.out.println("천원 : " +  money / 1000 +  "장");
		

	}

}
