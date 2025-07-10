package 문제풀이;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// 정수를 입력하여 해당 정수의 값만큼 숫자를 입력할 수 있게 하고
		// 각 입력한 숫자의 총합, 평균, 최댓값, 최솟값, 짝수 개수 , 홀수 개수 구하기
		
		Scanner sc = new Scanner(System.in);
		
		int input = 0;
		int sum = 0;
		int avg = 0;
		int isEven, isOdd;
		int evenCount = 0;
		int oddCount = 0;
		int temp;
		
		
		System.out.print("입력하고자 하는 숫자를 입력하세요. : ");
		input = sc.nextInt();
		int[] num = new int[input];
		
		for(int i=0; i<input; i++) {
			System.out.println("입력"+(i+1)+" : ");
			num[i] = sc.nextInt();
			sum = sum+num[i];
			avg = sum/input;
			if(num[i]%2==0) {
				evenCount++;
			}else {
				oddCount++;
			}
			
			
		}
		
		System.out.println("입력한 숫자들의 총합 : " + sum);
		System.out.println("입력한 숫자들의 평균 : " + avg);
		System.out.println("입력한 숫자들의 최댓값 : " );
		System.out.println("입력한 숫자들의 최솟값 : ");
		System.out.println("입력한 숫자들의 짝수 개수 : " + evenCount);
		System.out.println("입력한 숫자들의 홀수 개수 : " + oddCount);
		
		

	}

}
