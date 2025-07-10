package 문제풀이;

import java.util.Scanner;

public class 문제03 {

	public static void main(String[] args) {
//		// 구구단 퀴즈-- 번호 선택으로 퀴즈 시작/종료되게 만들기
//		1.퀴즈시작 2. 종료 그외 . 다시입력 1 선택시 구구단 퀴즈가 댄덤하게 나오게 하기
//		정답을 맞히면 메뉴로 되돌아가고 틀리면 다시 답을 입력할 수 있도록 하기
//		(종료되었을때 몇번 맞췄고 틀렸는지 출력되게 <--하고싶으면)
		
		Scanner sc = new Scanner(System.in);
		
		int answer, menu;
		int num1 = (int)(Math.random()*9)+1;
		int num2 = (int)(Math.random()*9)+1;
		int result;
		boolean start=true;
		int correct=0;
		int wrong=0;
		
		while(true) {
			
			System.out.println("==== 구구단 퀴즈 ====");
			System.out.println("1. 구구단 퀴즈 시작");
			System.out.println("2. 종료");
			System.out.print("번호 선택 : ");
			menu = sc.nextInt();
			
			
			if(menu == 2) {
				System.out.println("종료 합니다.");
				break;
			} else if(menu !=1) {
				System.out.println("다시 입력해 주세요.");
				continue;
			}
			
			num1 = (int)(Math.random()*9)+1;
			num2 = (int)(Math.random()*9)+1;
			
			answer = num1*num2;
			
			result =0;
			
			while(answer != result) {
				System.out.println("문제 : " + num1 + "x" + num2 + "=");
				result = sc.nextInt();
				
				
				if(answer == result) {
					System.out.println("정답입니다!");
					correct++;
				} else {
					System.out.println("오답입니다!");
					wrong++;
				}
			}
			
			
			
//			switch (menu) {
//				case 1 -> {
//					
//				}
//				
//				case 2 -> {
//					
//				}
//				
//				default ->{
//					
//				}
//			}
			
			
			
			
			
		}
		
		System.out.println("맞춘 정답 갯수 : " + correct + "  /" + "  오답 갯수 : " + wrong);
	}

}
