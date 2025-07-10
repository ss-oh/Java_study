package For문;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
// 		숫자 두개를 입력받아서 두 수 사이 숫자들의 합계를 출력
//		단, 입력하는 숫자는 뭐가 더 큰 숫자인지 알 수 없음
//		ex) 5 10  // 5~10까지 합
//		ex) 10 5  // 5~10까지 합
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, sum, i; //for 문에서 i변수를 활용해서 사용
		int min, max;
		int temp; //교환 시 임시 저장용 변수
		sum = 0;
		
		System.out.println(" 두 개의 숫자를 입력하세요 : ");
		a = sc.nextInt();
		b = sc.nextInt();
		
//		a에는 작은값, b에는 큰값이 있도록 처리할 예정
		
//		==== *** 방법 1 *** =================================
//		if(a>b) {
////			의도와는 다르게 a에 큰 값이 있으므로 두 변수의 숫자를 교환
//			temp = a;
//			a = b;
//			b = temp;
//		}
//		
//		for(i=a; i<=b; i++) {
//			sum = sum +i;
//			System.out.println(i);
//			System.out.println(sum);
//		}
		
		/*
		==== *** 방법 2 *** ===================================
		
		if(a<b) {
			min = a;
			max = b;
		} else {
			min = b;
			max = a;
		}
		
		
		// 위 if가 처리되면 항상 min에는 작은 값이 max에는 큰값이 들어가게됨
		// 그래서 for문은 min부터 max까지 반복하면 끝
		
		
		*/
		
		if(a<b) {
//			a가 작고 b가 큰것 - a부터 b까지 반복
			for(i=a; i<=b; i++) {
				sum= sum+i;
				System.out.println(i);
				System.out.println(sum);
			} 
		} else {
			for(i=b; i<=a; i++) {
				sum= sum+i;
				System.out.println(i);
				System.out.println(sum);
			}
			
		}
	}

}
