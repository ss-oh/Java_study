package 입력문;

import java.util.Scanner;

public class Study02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String name;
		int age;
		char gender;
		String number;
		
		System.out.println("이름을 입력하세요 : ");
		name = sc.nextLine();
		
		System.out.println("나이를 입력하세요 : ");
		age = sc.nextInt();
		
		System.out.println("성별을 입력하세요 : ");
		gender = sc.next().charAt(0);
		sc.nextLine();
		
		System.out.println("전화번호를 입력하세요 : ");
		number = sc.nextLine();
		
		
		System.out.println("===회원정보===");
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + gender);
		System.out.println("전화번호 : " + number);
		
		
		

	}

}
