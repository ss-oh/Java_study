package 문제풀이;

import java.util.Scanner;

public class Ex07_풀이 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum=0; // 총합
		double avg; // 평균
		int max, min; // 최대값, 최소값
		int odd=0, even=0; // 홀수, 짝수 개수
		
		System.out.println("입력할 개수 : ");
		int count = sc.nextInt();
		
		int[]arr = new int[count];
		
		//==입력한 값을 배열방에 넣어주는 반복문
		for(int i=0; i<arr.length;/* 또는 count */ i++) {
			System.out.println((i+1)+"번째 입력 : ");
			arr[i] = sc.nextInt();
		}
		
		//==숫자들의 합계와 짝수, 홀수 개수 구하는 반복문
		for(int i=0; i<arr.length; i++) {
			sum = sum + arr[i];
			if(arr[i]%2==1) {
				odd++;
			}else {
				even++;
			}
		
		}
//		최대값 최소값 구하기
		max = arr[0];
		min = arr[0];
		
		for(int i=1; i<arr.length; i++) {
			
			if(arr[i]>max) 
				max = arr[i];
			
			if(arr[i]<min) 
				min = arr[i];
			
		}
		
		avg = (double) sum / count;
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println("최댓값 : " + max);
		System.out.println("최솟값 : " + min);
		System.out.println("짝수 개수 : " + even);
		System.out.println("홀수 개수 : " + odd);
	}

}
