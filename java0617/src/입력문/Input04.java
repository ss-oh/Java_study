package 입력문;

import java.util.Scanner;

public class Input04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a,b,c,d;
		// 여러개 입력받기
		System.out.println("숫자 4개를 입력해주세요");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);

	}

}
