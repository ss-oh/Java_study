package 문제풀이;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// ==점심 메뉴 선택기 ==
//		메뉴종류 : 돈까스, 김밥, 라면 , 냉면 , 제육 , 햄버거
//		사용자는 메뉴 목록을 알 수 없다
//		사용자가 숫자를 1 ~6 하나를 입력하면
//		해당 메뉴중 하나가 출력되도록 구현
//		
//		>>실행화면<<
//		번호를 입력하세요 : 3
//		라면입니다.
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		String[] menu = {"돈까스","김밥","라면","냉면","제육","햄버거"}; //배열 활용
		
		System.out.println("번호를 입력하세요 : ");
		num = sc.nextInt();
		
		System.out.println(menu[num-1]); // 배열 활용
		
		switch(num) {
		case 1->{
			System.out.println("돈까스");
		}
		case 2->{
			System.out.println("김밥");
		}
		case 3->{
			System.out.println("라면");
		}
		case 4->{
			System.out.println("냉면");
		}
		case 5->{
			System.out.println("제육");
		}
		case 6->{
			System.out.println("햄버거");
		}
		
		
		
		}
		
		
	}

}
