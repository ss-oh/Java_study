package IF문;

import java.util.Scanner;

public class 연습02 {

	public static void main(String[] args) {
		// 주문수량을 입력받아서 주문 금액과 배달비를 출력
//		-물건 하나의 가격은 12000원
//		-배달비는 주문금액이 15000원 이하는 3000원
//				주문금액이 30000원 이하는 1500원
//				나머지는 무료
//
//		== 실행화면 ==
//		주문수량 입력 : 3
//		주문금액 : 36000원
//		배달비 : 무료
		
		Scanner sc = new Scanner(System.in);
		
		int oder;
		
		
		System.out.print("수량을 입력하세요 : ");
		oder = sc.nextInt();
		System.out.println("주문수량 입력 : " + oder);
		System.out.println("주문금액 : " + oder * 12000);
		if ( oder*12000 <= 15000) {
			System.out.println("배달비 : 3000원");
		} else if (oder*12000 <= 15000) {
			System.out.println("배달비 : 1500원");
		} else{
			System.out.println("배달비 : 무료");
		}
		
		int count; // 주문 수량을 저장하는 변수
		final int PRICE = 12000; // 상수(final): 중간에 내용 변경 방지를 위해 사용 
								 // 상수의 변수 이름은 언제나 대문자로 사용, 상수로 선언한 변수는 중간에 변경불가
		
		System.out.println("주문수량 입력 : ");
		count = sc.nextInt();
		
		System.out.println("주문금액 : " + PRICE*count);
		
		if ( PRICE* count <= 15000) {
			System.err.println("배달비 : 3000원");
		} else if (PRICE* count <= 30000) {
			System.out.println("배달비 : 1500원");
		} else {
			System.out.println("배달비 : 무료");
		}
		
		
		
	}

}
