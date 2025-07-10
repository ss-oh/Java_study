package For문;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		
		for(i=1; i<=9; i++) {
			for(j=2; j<=9; j++) {
//				System.out.printf("%2d x %2d = %2d", j, i , j*i);
				System.out.print(j + "x" + i + "=" + (i*j)+" ");
			}
			System.out.println();
		}
	}

}
