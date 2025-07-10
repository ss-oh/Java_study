package 문제풀이;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// 구매한 물건의 개수와 물건 하나당 가격을 입력받아서 할인을 적용한 최종 결제 금액을 계산
		// (물건 5미만 할인 x , 5~9개 10%할인, 10개 이상이면 20%)
		
		int item_count, item_price, total_price;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("물건의 개수를 입력하세요 : ");
		
		item_count = sc.nextInt();
		
		System.out.println("물건의 가격을 입력하세요 : ");
		
		item_price = sc.nextInt();
		
		total_price = item_count * item_price;
		
		if(item_count>=10) {
			System.out.println("최종 결제 금액은 : " + total_price*0.8 + "입니다.");
		}else if(item_count<5) {
			System.out.println("최종 결제 금액은 : " + total_price + "입니다.");
		}else {
			System.out.println("최종 결제 금액은 : " + total_price*0.9 + "입니다.");
		}
		

	}

}
