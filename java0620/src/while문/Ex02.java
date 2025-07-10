package while문;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		//정수를 입력받아 1부터 입력받은 정수까지의 홀수 총합과 개수를 출력
		
		int num, i=1, sum=0, count=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요 : ");
		num = sc.nextInt();
		
		while(i<=num) {
			
			
			
			if(i%2!=0) {
				//
				count++;
				sum = sum+i;
			}

			i++;
		}
		System.out.println("1부터" + num + "까지의 홀수의 총합 :" + sum);
		System.out.println("1부터" + num + "까지의 홀수의 개수 : "+ count);

	}

}
