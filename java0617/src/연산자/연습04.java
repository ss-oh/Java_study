package 연산자;

import java.util.Scanner;

public class 연습04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int math, eng, sum;
		
		System.out.println("수학 점수를 입력하세요 : ");
		math = sc.nextInt();
		
		System.out.println("영어 점수를 입력하세요 : ");
		eng = sc.nextInt();
		
		sum = math + eng;
		
		
		System.out.println( (math >=70 || eng >= 70 ) && sum/2 >= 75 ? "합격" : "불합격" );

	}

}
