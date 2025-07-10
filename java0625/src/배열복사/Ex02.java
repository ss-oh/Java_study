package 배열복사;

import java.util.Arrays;

public class Ex02 {

	public static void main(String[] args) {
		// 깊은복사, 얕은복사
		int[] arr = {1,2,3,4,5};
		int[] arr2 = arr; // 얕은 복사
		
		System.out.println(arr);
		System.out.println(arr2);
		
		System.out.println(Arrays.toString(arr2));
		
		arr[4] = 100;
		System.out.println("원본 변경 후");
		System.out.println(Arrays.toString(arr2));
	}

}
