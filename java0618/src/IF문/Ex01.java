package IF문;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
//		조건문 - if (112p.)
//		조건식의 결과 (T/F)에 따라 해당 코드가 실행
//		
//		if(조건식) {
//			조건식이 true일때 실행할 코드
//		} else {
//			조건식이 false일때 실행할 코드
//		}
		
//		점수를 입력받아서 점수가 80이상이면 합격, 아니면 불합격
		
		Scanner sc = new Scanner(System.in);
		
		int score;
		
		System.out.println("점수를 입력하세요 : ");
		score = sc.nextInt();		
		
		if (score >= 80) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
		
//		참, 거짓일때 실행할 코드가 1줄이면 {}괄호 생략가능
//		if (score >= 80) 
//			System.out.println("합격");
//		else 
//			System.out.println("불합격");
		
//		if문에 else는 필요없으면 생략가능
//		ex) 80이 넘은 점수에게만 "참 잘했어요"라고 해주고 싶음
//		if(score >=80) {
//			System.out.println("참 잘했어요");
//		}
		
		
	}
}
