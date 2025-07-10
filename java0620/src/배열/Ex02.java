package 배열;

public class Ex02 {

	public static void main(String[] args) {
//		배열은 값을 설정하지 않아도 자동으로 초기값을 넣어줌
//		자료형에 따라 설정되는 초기값은 다름      174p.
		int[] arr = new int[10];
		
		for(int n : arr) {
			System.out.println(n);
		}

	}

}
