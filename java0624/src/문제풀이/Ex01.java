package 문제풀이;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// 목욕탕 결제 프로그램 이용자의 나이를 입력받아서 입력한 나이와
		// 나이에 따른 결제 금액이 출력되며 결제 여부를 확인하고 결제 취소시 처음으로 
		// 되돌아가기 그리고 "0" 입력시 프로그램 종료하고
		// "01" 입력시 프로그램이 반복되는 동안 가장 나이가 많은 이용자의 나이를 알려주기
		// 결제금액 : 10살 이하는 어린이 1000원, 20살 이하는 청소년1200원, 나머지는 성인 5000원
		
		Scanner sc = new Scanner(System.in);
		
		int age, price;
		int count=0;
		int min,max;
		char yesno;
		System.out.println("===목욕탕 결제 프로그램===");
		
		for(;;) {
			
			System.out.println("나이를 입력하세요 [프로그램 종료 : 0],[나이가 가장 많은 이용자 : 01] : ");
			
			age = sc.nextInt();
			
			if(age==0) {
				System.out.println("프로그램이 종료되었습니다.");
				break;
			}
			
			if(age<=10) {
				System.out.println(age+"살 어린이 입니다.");
				System.out.println("금액은 1000원");
			}else if(age<=20) {
				System.out.println(age+"살 청소년 입니다.");
				System.out.println("금액은 1200원");
			}else {
				System.out.println(age+"살 성인 입니다.");
				System.out.println("금액은 5000원");
			}
			
			
			int[] arr = new int[count];
			count++;
			
			System.out.println("결제 하시겠습니까? [Y/N]");
			yesno = sc.next().charAt(0);
			
			switch (yesno) {
				case 'y','Y' -> {
					System.out.println("결제가 완료되었습니다.");
				}
			
			
			
				default -> {
					
				}
			}
			
			
			if(age==01) {
				System.out.println("나이가 가장 많은 이용자는 oo살입니다.");
			}
			
			
		}
		
		
		
	}

}
