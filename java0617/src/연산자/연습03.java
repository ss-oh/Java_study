package 연산자;

import java.util.Scanner;

public class 연습03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int score;
		
		System.out.println("점수를 입력하세요 : ");
		score = sc.nextInt();
		
		System.out.println( score >= 70 ? "합격" : "불합격" );

	}

}
