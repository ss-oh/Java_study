package java0622;

import java.util.Scanner;

public class 숙제_신승오 {
	
	//두개의 숫자를 입력해서 +,-,*,/로 사칙연산이 가능하고 그 결과값이 최근 3개까지 저장되는 계산기 만들기 
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        boolean go = true; //while 반복용

        double[] answer = new double[3]; //소수점 까지 표기하기위해 double 사용 , 배열 3번까지 표기
        int cnt = 0; // 계산 결과 저장용 변수

        while (go) { // true 일때 반복
            System.out.print("첫 번째 숫자: ");
            double num1 = sc.nextDouble();

            
            String operator = ""; //연산자 값 입력받기용 변수
            while (true) {
                System.out.print("연산자 (+ - * /): ");
                operator = sc.next(); // 스캐너로 입력받은 연산자 값 저장

                if (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")) { 
                    break; // 4개의 연산자중 하나라도 맞으면 진행해야 하므로 or로 잘못된 연산부호 입력처리
                } else {
                    System.out.println("잘못된 연산자입니다. 다시 입력하세요.");
                }
            }

            System.out.print("두 번째 숫자: ");
            double num2 = sc.nextDouble();

            double result = 0; // 결과값 저장용 변수
            boolean ok = true; // 나누기 0일때 나오는 상황 처리

            if (operator.equals("+")) {
                result = num1 + num2;
            } else if (operator.equals("-")) {
                result = num1 - num2;
            } else if (operator.equals("*")) {
                result = num1 * num2;
            } else if (operator.equals("/")) {
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("0으로 나눌 수 없습니다.");
                    ok = false; // 나누기 0일때 아래 if 를 실행 시키지 않고 다시 되돌아오기위해 지정함
                }
            }

            if (ok) {
                System.out.println("결과: " + result); //계산결과 프린트

                // 계산결과 3번까지 저장하는 부분
                if (cnt < 3) { //카운트가 3 이하일때
                    answer[cnt] = result; // cut 번째 배열에 result 결과값을 넣음
                    cnt++;  //그리고 카운트 1 증가
                } else { // 아닐때 ( 배열이 3이 넘어갔을때)
                    for (int i = 1; i < 3; i++) { //오래된 값을 지우고 마지막 배열에 최근 계산값을 넣음
                        answer[i - 1] = answer[i]; //마지막 배열에 1을 빼고 그 값을 한칸씩 왼쪽배열로 이동
                    }
                    answer[2] = result; //결과값을 마지막 배열에 저장
                }
            }

            // 계산 결과 목록
            System.out.println("=== 계산 결과 목록 ===");
            for (int i = 0; i < cnt; i++) {
                System.out.println((i + 1) + ": " + answer[i]);
            }

            System.out.print("다음 숫자를 계산 할 건가요? (y/n): "); // 진행여부 [y/n] 부분
            String gostop = sc.next(); // gostop에 y와n 값 체크

            switch (gostop.toLowerCase()) { //y를 입력받았을때 (대소문자 구분없이 toLowerCase사용)
	            case "y"-> {
	            	
	            }
	            	
	            default ->{ //그게 아닐때
	                go = false; //while부분 종료
	                System.out.println("종료합니다.");
	            }
            }
        }

	}

}
