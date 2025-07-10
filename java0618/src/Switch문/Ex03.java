package Switch문;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// 국어, 영어, 수학 점수를 입력받아서 세과목 평균이 90이상이면 A, 80이상이면 B, 나머지는 C로 등급을 지정
//		등급이 A이면 "우수 학생입니다"
//		등급이 B이면 "일반 학생입니다"
//		등급이 C이면 "학생입니다"
		
		Scanner sc = new Scanner(System.in);
		
		int kor, eng, math;
		double avg; // 평균
		char grade; // 등급
		
		System.out.println("국어, 영어, 수학점수 입력 : ");
		kor = sc.nextInt();
		eng = sc.nextInt();
		math = sc.nextInt();
		
		avg = (kor + eng + math) / 3.0;
		
		if (avg>=90) {
			grade = 'A';
		} else if (avg >= 80) {
			grade = 'B';
		} else {
			grade = 'C';
		}
		
		switch (grade) {
			case 'a':
			case 'A':
				System.out.println("우수 학생입니다.");
				break;
			case 'b':	
			case 'B': 
				System.out.println("일반 학생입니다.");
				break;
			default:
				System.out.println("학생입니다.");
			
		
		}

	}

}
