package 입력문;

import java.util.Scanner;

public class Input03 {

	public static void main(String[] args) {
		//nextLine은 다른것과 조금 다름
		Scanner sc = new Scanner(System.in);
		
		int a;
		String b, c;
		
		System.out.println("첫번째 숫자 입력 : ");
		a = sc.nextInt();
		sc.nextLine(); //엔터키 입력한거 처리
		System.out.println("두번째 문자열 입력 : ");
		c = sc.nextLine();
		
		//엔터를 누른것도 '입력'으로 들어감 ex)abcde[엔터] 
		//next들은 [엔터]를 감지 못함
		//순수 입력한 내용만 처리를 해줌 (abcde까지만 처리)
		//입력한 [엔터]는 소멸되는게 아니라 아래코드로 내려감(처리될때까지 유지)
		//그러다가 [엔터]를 감지 할 수 있는 nextLine을 만나게 되면 이미 입력한 [엔터]가 처리되서 다른 입력을 하지 못하고 넘어감
		//nextLine을 제외한 나머지들은 엔터, 공백 같은 건 인식을 못함
		
		System.out.println("===입력 결과===");
		System.out.println(a);
		System.out.println(c);
		

	}

}
