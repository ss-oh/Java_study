package 클래스01;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {
		// 게산기 만들기
		Scanner sc = new Scanner(System.in);
		Calculator calc = new Calculator();
		
		while(true) {
			System.out.println("=== 메뉴 ===");
			System.out.println("1. 전원 ON / OFF");
			System.out.println("2. 더하기 계산하기");
			System.out.println("3. 나누기 계산하기");
			
			switch(sc.nextInt()) {
			
			case 1 -> {
				calc.powerOnOff();
			}
			case 2 -> {
				System.out.println("더할 두 수를 입력하세요");
				int num1 = sc.nextInt();
				int num2 = sc.nextInt();
				
				int result = calc.plus(num1, num2);
				System.out.println(result);
			}
			case 3 -> {
				System.out.println("나눌 두 수를 입력하세요");
				int num1 = sc.nextInt();
				int num2 = sc.nextInt();
				double result = calc.divide(num1, num2);
				System.out.printf("%.2f\n",result);
			}
			
			
			}
		}

	}

}
