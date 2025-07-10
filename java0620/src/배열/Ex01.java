package 배열;

public class Ex01 {

	public static void main(String[] args) {
		// 배열 - 168p.
		
//		일반 변수에는 값을 몇개 저장 ? -> 1개
//		배열 -> 변수 하나에 여러개의 값을 저장
		
//		배열 변수 [참조 변수] -> 주소를 보관
//		자료형 []변수명
//		
//		int a:변수 a
//		int [] a: 배열변수 a
//		-하나의 배열변수에 다양한 타입의 값을 넣을 수 없다.
//		ex) int [] a: 5,6,7,8,9,10; : 가능
//			int [] a: 5,da5,si2,5,3 : 불가능
//		int[] a = new int[5]; // 5개까지만 저장 ㅁㅁㅁㅁㅁ <-5개의 배열을 가지고 있는데 첫번째의 주소를 a라는 변수가 가지고있다.
		
		int[]arr = new int[5];
		arr[0] = 20;
		arr[1] = 51;
		arr[2] = 52;
		arr[3] = 53;
		arr[4] = 54;
		
		System.out.println(arr.length);//변수명.length : 배열 크기
		
		for(int i =0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("==============");
		//향상된 for문
//		자료형은 반복할 배열의 자료형과 일치
//		반복 할 배열에 있는 값을 순서대로 반복용 변수에 넣어서 실행
//		for(자료형 반복용변수명 : 반복할 배열) ->> 구조
		
		for(int n : arr) {
			
			System.out.println(n);
		}

	}

}
