package while문;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// 정수를 입력받아서 1부터 입력받은 정수까지 3의 배수의 개수를 출력
		// 단, 0을 입력받으면 프로그램 종료
		Scanner sc = new Scanner(System.in);
		
		int num1, num2 ,min, max, count=0;
		
		
		
		
		
		while(true) {
			System.out.println("정수 입력 (종료[0]) : ");
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			
			if (num1<num2) {
				min = num1;
				max = num2;
			} else {
				min = num2;
				max = num1;
			}
			
			if(min == 0 || max ==0)
				break;
			
				count=0;
				
				int tempMin = min;
				
				
				
				while(tempMin<=max) {
					
					if(tempMin%3==0) {
						count++;
					}
					
					tempMin++;
					
				}
				
				System.out.println(min+ "부터" + max + "까지의 3의 배수 개수 : " + count);
			
			
		}
		System.out.println("프로그램 종료");
	}

}
