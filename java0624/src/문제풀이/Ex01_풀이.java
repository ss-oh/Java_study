package 문제풀이;

import java.util.Scanner;

public class Ex01_풀이 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		// 배열을 사용 할 때
		
//		String[] a = {"어린이","청소년","성인"};
//		int[] b = {1000, 1200, 5000};
//		
//		if(나이 <= 20 ) {
//			배열방 = (나이-1)/10
//			a[배열방]b[배열방]		
//		}else {
//			a[2] b[2]
//		}
//		
		//나이를 입력받음 =>
		// 1~10 : 0번방
		// 11~20 : 1번방
		// 21 ~ : 2번방
		
//		(나이-1)/10
//		1~10 => 0
//		11~20 => 1
		
		String age;
		int max=0;
		
		while(true) {
			System.out.println("나이입력 [0.종료, 01. 최대나이출력] : ");
			age = sc.next();
			
			if( age.equals("0") ) {
				System.out.println("종료");
				break;
			}
//			Integer.parseInt 는 문자취급중인 숫자를 진짜 정수형으로 변환
//			String str = "1234";
//			int num = Integer.parseInt(str);
//			System.out.println(num >= 1000);
			
			if(age.equals("01")) {
				
				if(max == 0) {
					System.out.println("입력된 나이가 없음");
					continue;
				} else {
					System.out.println("최대나이 : " + max);
					break;
				}
			}
//			문자인 age 를 정수로 변환 후 age_변수에 임시저장
			int age_ = Integer.parseInt(age);
			
			if(age_<= 10) {
				System.out.println("어린이 : 1000원");
			}else if(age_ <= 20) {
				System.out.println("청소년 : 1200원");
			}else {
				System.out.println("성인 : 5000원");
			}
			
			if( age_ > max) {
				max = age_;
			}
			
		}
	}

}
