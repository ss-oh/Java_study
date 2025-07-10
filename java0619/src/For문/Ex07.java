package For문;

public class Ex07 {

	public static void main(String[] args) {
		// 구구단 출력
		
		int i, j;
		
		for(i=2; i<=9; i++) {
			for(j=1; j<=9; j++) {
				System.out.print(i + "x" + j + "=" + (i*j)+" ");
				
			}System.out.println();
			
		}

	}

}
