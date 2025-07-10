package 입력문;

import java.util.Scanner;

// 코드를 다 입력했는데 import가 없으면 => ctrl + shift + o 자동완성


public class Input {

	public static void main(String[] args) {
		//sc변수에 Scanner기능 저장
		Scanner sc = new Scanner(System.in);
		
		
		int num; //입력받은 정수를 보관 할 변수
		
		System.out.print("정수를 입력해주세요 : ");
		num = sc.nextInt();
		
		System.out.println("입력하신 값은 : " + num);
		System.out.println("프로그램 종료");
		
		
	}

}
