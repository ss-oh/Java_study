package 입력문;

import java.util.Scanner;

public class Study03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int kor, eng, math;
		int sum; //성적 합계 저장용 변수
		double avg; //성적 평균 저장용 변수
		
		
		
		
		System.out.println("국어 점수를 입력 : ");
		kor = sc.nextInt();
		
		System.out.println("영어 점수를 입력 : ");
		eng = sc.nextInt();
		
		System.out.println("수학 점수를 입력 : ");
		math = sc.nextInt();
		
		sum = kor + eng + math;
		avg = sum / 3.0;
		
		System.out.println("국어 점수 : " + kor);
		System.out.println("영어 점수 : " + eng);
		System.out.println("수학 점수 : " + math);
		
		System.out.println("점수 총합 : " + sum);
		System.out.println("점수 평균 : " +  avg);
		System.out.printf("점수 평균 : %.1f", avg);

	}

}
