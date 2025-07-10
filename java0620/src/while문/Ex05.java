package while문;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// 정수를 입력받아서 1부터 입력받은 정수까지 3의 배수의 개수를 출력
		// 단, 0을 입력받으면 프로그램 종료
		
		Scanner sc = new Scanner(System.in);
		
		int num; //입력받는 수를 저장
		int count = 0; //3의 배수 개수 저장
		int i=1; //반복용 변수
		
		
		
		while(true) {
			System.out.print("정수 입력(종료->0) : ");
			num = sc.nextInt();
			
			if(num == 0)
				break;
				
			
			//1부터 num까지의 배수 개수구하기
			
			while(i <= num) {
				if(i % 3 == 0) {
					count++;
				}
				i++;
			}
			System.out.println("1부터" + num + "까지의 3의 배수 개수 : "+ count);
			//결과 출력이 끝나면 다음 새롭게 처리될 반복문을 위해
			//반복용 변수인 i는 리셋되야함;
			i = 1;
			count=0; //기존 개수가 남아있으면 다음 개수 게산에 문제가 생기므로 count도 리셋시켜야함
		}
		System.out.println("프로그램 종료");
	}

}
