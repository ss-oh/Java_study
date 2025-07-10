package while문;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// 인뤈수를 입력받아 입력받은 인원수에 해당하는 학생 성적을 입력 후 
//		학생들 성적의 총 합계와 평균을 출력
		
		Scanner sc = new Scanner(System.in);
		
		int  grade, sum=0, i=1, peopleCount=0;
		double avg=0;
		
		System.out.print("인원수를 입력하세요 : ");
		peopleCount = sc.nextInt();
		
		while(i<=peopleCount) {
			
			System.out.print(i + "번째 학생 성적 입력 : ");
			grade = sc.nextInt();
			i++;

			sum = sum + grade; // 입력한 성적들을 누적
			
		}
		
		avg = sum/peopleCount;
		
		System.out.println(peopleCount+"명 성적의 총 합계 : " + sum);
		System.out.printf(peopleCount+"명 성적의 총 평균 : " + avg);
		

	}

}
