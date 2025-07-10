package 배열복사;

import java.util.Arrays;

public class Ex01 {

	public static void main(String[] args) {
		// 배열복사 (배열을 복사해 주는 명령어가 있다)
		
		int[] arr = {1,2,3,4,5,};
		int[] arr2 = new int[10];
		
		// arr배열에 있는걸 그대로 arr2에 넣어주고 싶음
//		for(int i=0; i<arr.length; i++) {
//			arr2[i+3] = arr[i];
//		}
		
		// 복사할 배열 , 붙여넣기 할 배열
		// 몇 번째 부터 복사할건지, 몇번째 부터 붙여넣을건지
		// arraycopy를 사용하려면 
		// -> 무슨 배열을 어디서부터 복사해서 어떤 배열에 어디서부터 붙여넣기 할건지 알려줘야함
		// arraycopy(복사 할 배열, 어디서부터 복사할건지, 붙여넣기 할 배열, 어디서부터 붙여넣기할건지, 복사할 배열 크기)
		System.arraycopy(arr, 0, arr2, 3, 4);
		System.out.println(Arrays.toString(arr2));
		
		int[] arr3 = Arrays.copyOf(arr, 10);
		System.out.println(Arrays.toString(arr3));
		
		arr[4]=100;
		System.out.println("복붙 후 원본 값 수정");
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		
	}

}
