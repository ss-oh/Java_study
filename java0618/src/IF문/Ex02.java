package IF문;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
//		점수를 입력받아 해당 점수가 90 이상이면 A, 80이상이면 B, 70이상이면 C, 나머지는 F로 출력
		
		Scanner sc= new Scanner(System.in);
		
		int score;
		
		System.out.println("점수를 입력하세요");
		score = sc.nextInt();
		
		if ( score >= 90) {
			System.out.println("A");
		} else if( score >= 80){
			System.out.println("B");
		} else if (score >= 70) {
			System.out.println("C");
		} else if (score < 70) {
			System.out.println("F");
		}

	}

}
