package 배열;

import java.util.Arrays;

public class Ex04 {

	public static void main(String[] args) {
		// 배열 활용
		
//		정수를 보관하는 5칸짜리 배열을 만들고 해당 배열의 순서대로 5, 10, 15, 20, 25를 넣은 후 출력
		
		int[]arr = new int[5];
		
		for(int i=0; i<arr.length; i++) {
			arr[i]= (i+1)*5;
			
		}
		for(int i : arr) {
			System.out.println(i);
		}
		
		System.out.println(Arrays.toString(arr));
		

	}

}
