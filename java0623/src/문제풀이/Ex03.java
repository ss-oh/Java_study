package 문제풀이;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
//		여행을 가기 위한 항공사 선택
//		===항공사 선택===
//		1. 진에어 : 624300원
//		2. 아시아나 : 650000원
//		3. 에어서울 : 612800원
//		===원하시는 항공사를 선택하세요=== : [] xxxx를 선택하셨습니다.
//		===수량을 입력하세요 === : [x] ->
//		가격 1,300,000원 이상 시 10% 할인적용
//		주문하신 총 금액은 xxxx원 입니다.

		
		Scanner sc = new Scanner(System.in);
//		int count, num, total , price=0;
//		
//		String [] menu = {"진에어","아시아나","에어서울"};
//		
//		System.out.println("===원하시는 항공사를 선택하세요=== : ");
//		System.out.println("1. 진에어 : 624300원");
//		System.out.println("2. 아시아나 : 650000원");
//		System.out.println("3. 에어서울 : 612800원");
//		num = sc.nextInt();
//		System.out.println(menu[num-1]+"을 선택하셨습니다.");
//		System.out.println("===수량을 입력하세요=== : ");
//		count = sc.nextInt();
//		switch(num) {
//			case 1 ->{
//				price = 624300;
//			}
//			case 2 ->{
//				price = 650000;
//			}
//			case 3 ->{
//				price = 612800;
//			}
//			
//		}
//		
//		total = price*count;
//		
//		if(total>=1300000) {
//			System.out.printf("주문하신 총 금액은 %.0f원 입니다", total*0.9);
//		}else {
//			System.out.println("주문하신 총 금액은" + total + "원 입니다");
//		}
		
// ================  배열을 이용해서 작업 =========
		
		String [] menu = {"진에어","아시아나","에어서울"};//항공사 이름을 저장하는 배열
		int[] price = {624300, 650000, 612800};// 항공사별 항공권 금액을 저장하는 배열
		int num; // 선택한 항공사 번호를 저장
		int count; // 항공권 수량 저장
		int total; // 총 금액 저장
		System.out.println("=== 원하시는 항공사를 선택하세요 ===");
		
		for(int i=0; i<menu.length; i ++) {
			System.out.println((i+1) + ". " + menu[i]+ " - " + price[i] + "원");
		}
		
		System.out.println("원하시는 항공사를 선택하세요 : ");
		num = sc.nextInt();
		System.out.println(menu[num-1] + "를 선택하셨습니다.");
		
		System.out.println("수량을 입력하세요 : ");
		count = sc.nextInt();
		
		total = price[num-1]*count; //총 금액 계산
		
		if(total >= 1300000) {
			total = (int)(total*0.9);// (정수로 바꿔라)(곱한 결과를)
		}
		System.out.println("총 금액 : " + total);
		
		
		
		
		
		
		
		
	}

}
