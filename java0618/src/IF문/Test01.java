package IF문;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sec, min, hour;
		
		
		
		System.out.print("초를 입력하세요 : ");
		sec = sc.nextInt();
		if (sec>60) {
			sec= sec%60;
			
		}
		

	}

}
