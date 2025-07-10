package 배열;

import java.util.Arrays;
import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("설정할 배열 크기 입력 : ");
		int[]arr = new int[sc.nextInt()];
		
		for(int i =0; i<arr.length; i++) {
			System.out.println(i + "번 방에 넣을 값 입력 : ");
			arr[i] = sc.nextInt();
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
