package 배열;

import java.util.Arrays;

public class Ex06 {

	public static void main(String[] args) {
		// 정수를 보관하는 배열 100칸생성
//		각 배열방에 랜덤한 값의 숫자을 넣어라
//		단, 랜덤 숫자의 범위는 1~1000
		
		
		
		System.out.println((int)(Math.random()*1000)+1);
		
		
		
		int[]arr = new int[100];
		
		int max = 0; //max 를 왜 0으로 하냐?-> 배열에 있는 숫자들의 범위는 1~1000, 
		//가장 첫번째 배열에 있는 숫자와 max를 비교해서 무조건 첫번째 숫자가 max로 지정되도록 처리할 예정
		//결국 max와 배열방의 숫자와 비교해서 배열방 숫자가 더 크면 max가 되도록 처리
		int min = 1001; //초기값이 1~1000이니까 min은 무조건 1000보다 작아야 하므로 초기값을 1001로 지정
//		int max = arr[0], min = arr[0]; <----이렇게도 할 수 있다.
		int maxIndex = 0, minIndex = 0; // 최대 , 최소값의 인덱스(위치) 를 저장
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*1000) + 1;
		}
		//=====랜덤값이 배열에 다 들어가 있음 ===
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
				maxIndex = i;
			}
			if(arr[i]<min) {
				min = arr[i];
				minIndex = i;
			}
		}
		System.out.println("최대값 : " + max + "   위치 : " + maxIndex);
		System.out.println("최소값 : " + min + "   위치 : " + minIndex);
		//최대값과 최소값이 있는 배열방 위치와 해당 값을 출력
		
		
		
		
		
		System.out.println(Arrays.toString(arr));
		
	}

}
