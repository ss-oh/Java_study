package For문;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// 9부터 250까지 3의 배수이면서 2의 배수가 아닌 수들의 목록, 개수 , 합계를 출력
		
		Scanner sc = new Scanner(System.in);
		
		int num, i, count=0, sum=0;
		
		
		System.out.println("==결과==");

		System.out.print("수들의 목록 : ");
		for(i=9; i<=250; i++) {
			if(i%3 == 0 && i%2 !=0 ) {
				count++;
				sum = sum + i;
				System.out.print(i + " ");
			}

			
			
			
		}
		System.out.println("\n개수 : " + count);
		System.out.println("합계 : " + sum);
		
		
	}

}
