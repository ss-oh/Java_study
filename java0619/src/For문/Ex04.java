package For문;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// 숫자를 입력받아 해당 숫자가 소수인지 아닌지를 출력(소수: 1 과 자기자신으로만 나누어 떨어지는 수) ex)3:소수 12:소수아님 13:소수
		Scanner sc = new Scanner(System.in);
		
		int num, i;
		int count=0; //나누어 떨어지는 경우의 개수를 저장
		System.out.println("정수 입력 : ");
		num = sc.nextInt();
		
		for(i=1; i<=num; i++) {
			
			if(num%i == 0) {
				count++;
			}
			
		}
		if(count == 2) {
			System.out.println("소수임");
		}else {
			System.out.println("소수아님");
		}
	}

}
