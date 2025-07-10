package Switch문;

import java.util.Scanner;

public class 연습03 {

	public static void main(String[] args) {
		/* 
		  카페 키오스크 프로그램
		 
 			<<실행 결과>>
	=== XX카페에 오신 것을 환영합니다 ===
		
		메뉴를 선택해주세요
		1.아이스 아메리카노 -2000원
		2.아샷추 -2500원
		3.라떼 - 2500원
		4.딸기 스무디 - 4000원
		
		선택번호 : [ㅇ]
		ㅇㅇㅇ을 선택 하셨습니다.
		수량을 입력해주세요 : [ㅇ]
		총 주문하신 금액은 ㅇㅇㅇ입니다.
		할인쿠폰을 적용하시겠습니까? [Y/N]
		N -> 할인 적용 안함
		Y -> 할인 적용 총 주문금액의 10%
		최종금액은 ㅇㅇㅇㅇ입니다.
		심심하면 쿠폰 적용 부분에서 Y를 선택하면
		쿠폰번호를 입력하세요 : [ABCDE]
		정확한 쿠폰번호 ABCDE를 입력하면 할인을 적용시키고
		쿠폰을 이상하게 입력하면 '잘못된 쿠폰번호입니다.'
		할인적용 안됨
		
		
		
		*/
		
		
		Scanner sc = new Scanner(System.in);
		
		int menu, count, price, total;
		char choice;
		
		String coupon, coupon2;
		coupon = "ABCDE";
		
		
		
		System.out.println("===카페에 오신것을 환영합니다===");
		for(;;) {
			System.out.println("메뉴를 선택해주세요\r"
					+ "	1.아이스 아메리카노 -2000원\r\n"
					+ "	2.아샷추 -2500원\r\n"
					+ "	3.라떼 - 2500원\r\n"
					+ "	4.딸기 스무디 - 4000원\r\n"
					+ "	5. 프로그램 종료");
			
			menu = sc.nextInt();
			if(menu == 5)
				break;
			
			switch (menu) {
				case 1 -> {
					System.out.println("선택번호 : [1]");
					System.out.println("아이스 아메리카노를 선택하셨습니다.");
					price = 2000;
					
				}
				case 2 -> {
					System.out.println("선택번호 : [2]");
					System.out.println("아샷추를 선택하셨습니다.");
					price = 2500;
				}
				case 3 -> {
					System.out.println("선택번호 : [3]");
					System.out.println("라떼를 선택하셨습니다.");
					price = 2500;
				}
				case 4 -> {
					System.out.println("선택번호 : [4]");
					System.out.println("딸기 스무디를 선택하셨습니다.");
					price = 4000;
				}
				default -> {
					System.out.println("잘못 입력하셨습니다.");
					price = 0;
					continue;
				}
				
			}
			
		
			System.out.println("수량을 입력해주세요 : ");
			count = sc.nextInt();
			total = price*count;
			System.out.println("총 주문하신 금액은" + total + "입니다.");
		
			
			System.out.println("할인쿠폰을 적용하시겠습니까? [Y/N]");
			choice = sc.next().charAt(0);
			
				switch (choice /* sc.next().charAt(0); choice 변수 삭제하고 바로 적용 할 수도 있다. */) {
					case 'Y' , 'y' -> {
						System.out.print("쿠폰번호를 입력하세요 : ");
						coupon2 = sc.next();
						if (coupon.equals(coupon2)) {
				/* ---- coupon == coupon2 가 적용이 안되고 equals사용하는 이유---- 
					    * String <-대문자 int <-소문자 
						변수의 값을 저장하는 방식이 자료형에 따라서 약간씩 다름
						소문자로 시작하는 자료형(int,double,char등등..)
						대문자로 시작하는 자료형 (String, Scanner)
						ex) String str = "ABCD";
						str///"ABCD"//
						주소값 // 주소값 // <- 각각의 주소값을 가짐
						str 안에는 "ABCD"가 아닌 "ABCD"의 주소값을 가짐
						그래서 coupon == "ABCDE"
						     "ABCDE" == "ABCDE" 가 아닌
						      주소값 == "ABCDE"를 비교하게되서 다르다고 나옴
						   */  
							total = total-(total/10); // total = (int)(total * 0.9) 왼쪽 수식과 같음, 0.9때문에 (int)로 형변환
							System.out.println("최종 금액은" + total + "입니다.");
							                     
						} else {
							System.out.println("잘못된 쿠폰번호 입니다.");	
						}
					}
					
					
					
				}
				System.out.println("총 주문하신 금액은" + total + "입니다." );
			}
		
		
		
		
	}

}
