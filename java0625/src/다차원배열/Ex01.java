package 다차원배열;

public class Ex01 {

	public static void main(String[] args) {
		// 다차원배열
		int[][] arr = new int[5][3]; // 5행 3열짜리의 배열이 만들어짐 (2차원배열)
		int[][] arr2 = {
				{1,2,3,4,},
				{5,6,7,8,},
				{9,10,11,12}
		};
		int num = 1;
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = num;
				num++;
			}
		}
		for(int i=0; i<arr.length; i++) {
					
			for(int j=0; j<arr[i].length; j++) {
				System.out.print( arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println(arr2[1][2]);
	}

}
