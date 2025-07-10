package IF문;

import java.util.Scanner;

public class 연습01 {

	public static void main(String[] args) {
		// 점수 3개를 입력받아서 점수들의 평균이 80 이상이면 합격 아니면 불합격
//		추가로 점수들 중 최대값과 최소값도 출력
		
		Scanner sc = new Scanner(System.in);
		
		int num1, num2, num3;
		int max,min;
		double avg;
		
		
		
		System.out.print("점수 3개 입력 : ");
		
		num1 = sc.nextInt();
		max = num1;
		min = num1;
		
		num2 = sc.nextInt();
		if (num2 > max) {
			max = num2;
		}
		if (num2 < min) {
			min = num2;
		}
		
		num3 = sc.nextInt();
		if (num3 > max) {
			max = num3;
		}
		if (num3 < min) {
			min = num3;
		}
		
		System.out.println("최대값 : " + max + "최소값 : " + min);
		
		avg = (num1+num2+num3)/3.0 ;
		
		
		System.out.print(avg + "점 : ");
		if (avg>= 80) {
			System.out.printf("합격");
		} else {
			System.out.printf("불합격");
		}
		
		if ((num1 > num2)) {
			System.out.println(num1);
		} else if(num1> num3) {
			System.out.println(num1);
		} 
		if ((num2 > num1)) {
			System.out.println(num2);
		} else if(num2> num3) {
			System.out.println(num2);
		} 
		if ((num3 > num2)) {
			System.out.println(num3);
		} else if(num3> num1) {
			System.out.println(num3);
		} 
		
		if (num1 > num2 && num1 > num3) {
			System.out.println("최대값 : " + num1);
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("최대값 : " + num2);
		} else {
			System.out.println("최대값 : " + num3);
		}
		
		if (num1 < num2 && num1 < num3) {
			System.out.println("최소값 : " + num1);
		} else if (num2 < num1 && num2 < num3) {
			System.out.println("최소값 : " + num2);
		} else {
			System.out.println("최소값 : " + num3);
		}
		
		
//		입력받은 점수 3개의 평균이 70 이상이면 "합격", 아니면 "불합격" 단, 점수 3개중 하나라도 60미만이면 "과락"으로 출력
		
		
		if (num1<60) {
			System.out.println("과락");
		} else if (num2<60) {
			System.out.println("과락");
		} else if (num3<60) {
			System.out.println("과락");
		} else if (avg>=70) {
			System.out.println("합격");
		} else if (avg<70) {
			System.out.println("불합격");
		}
		
		/* 해석 1.
		
		if ( avg >= 70 && (num1 < 60 || num2 <60 || num3 < 60)) {
			System.out.println("과락");
		} else if ( avg >= 70) {
			System.out.println("합격");
		} else{
			System.out.println("불합격");

		}
		
		*/
		
		/* 해석 2.
		 * 
		if ( avg >= 70) {
			if (num1 < 60 || num2 < 60 || num3 < 60) {
				System.out.println("과락");
			} else {
				System.out.println("합격");
			}
		} else {
			System.out.println("불합격");
		}
		
		*/
		
	}

}
