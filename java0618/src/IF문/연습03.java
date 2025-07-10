package IF문;

import java.util.Scanner;

public class 연습03 {

	public static void main(String[] args) {
//		45분 일찍 알람 설정하기
		
		Scanner sc = new Scanner(System.in);
		
		int hour;
		int min;
		
		
		
		System.out.println("== 45분 일찍 알람 설정하기 ==");
		
		System.out.print("알람 설정 시간 입력 : ");
		hour = sc.nextInt();
		System.out.print("알람 설정 분 입력 : ");
		min = sc.nextInt();
		
		min = min - 45;
		
		if (min < 0) {
			hour = hour - 1;
			min = min + 60;
		}
		if (hour < 0 ) {
			hour = 23;
		}
		
		System.out.println("설정된 알람 시간은" + hour + "시" + min + "분 입니다.");
		
	}

}
