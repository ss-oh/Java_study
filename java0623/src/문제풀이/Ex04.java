package 문제풀이;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// 정수를 입력받아 해당 정수를 2진수로 변환하는 프로그램
		// 10진수를 2진수로 변환하는 과정은
		// 10진수를 2로 나눌 수 없을 때까지 게속 나눔
		// 계속 나누면서 나온 나머지들을 역순으로 읽으면 2진수
		
		Scanner sc = new Scanner(System.in);
		
		String result = ""; //2진수를 저장하는 변수 ( 숫자들을 문자로 취급해서 이어주기 위해)
		
		
		System.out.println("입력값 : ");
		int n = sc.nextInt();
		
		// 아까 파악했을때에는 2로 나누려는 값이 0이되면 반복 종료가 되어야 함
		while(n != 0) { // n이 0이 아닐때 까지 반복 ( 0일때 반복 종료)
			
			result = (n % 2) + result;
			n = n / 2;
			
		}
		
		System.out.println(result);
		
		
	}

}
