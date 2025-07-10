package Switch문;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// 성별을 입력받아서 입력받은 성별이 m, M이면 남자 f, F이면 여자 나머지는 잘못 입력하셨습니다. 를 출력
		
		Scanner sc = new Scanner(System.in);
		
		char gender;
		
		System.out.println("성별을 입력 해 주세요 M 또는 F : ");
		
		gender = sc.next().charAt(0); // 
		
		switch (gender) {
		case 'm','M' -> {
			System.out.println("남자");
		}
		case 'f','F' -> {
			System.out.println("여자");
		}
		default -> {
			System.out.println("잘못 입력하셨습니다.");
		}

		}
	}
}
