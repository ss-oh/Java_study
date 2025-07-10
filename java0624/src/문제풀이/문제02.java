package 문제풀이;

import java.util.Scanner;

public class 문제02 {

	public static void main(String[] args) {
		// KBO야구 팀 (5구단)의 승,패 입력 후
		// 10개구단의 승, 패, 승률, 순위를 출력
		// LG, KIA, 두산, 롯데, 삼성
		
		Scanner sc = new Scanner(System.in);
		
		
		double[] winRate = new double[5]; //
		int[] win = new int[5];
		int[] lose = new int[5];
		int[] rank = new int[5];
		
		String[] team = {"LG","KIA","두산","롯데","삼성"};
		
		
		
		
		for(int i = 0; i < team.length; i++ ) {
			System.out.println(team[i] + " 승 입력 :");
			win[i] = sc.nextInt();
			System.out.println(team[i] + " 패 입력 :");
			lose[i] =  sc.nextInt();
			winRate[i] = (double)win[i]/(win[i]+lose[i]);
			
			// Math.round는 반올림할 자리수 설정이 안됨 - 무조건 소수 첫째자리에서 반올림
			// 만약 소수 둘째자리까지 표현을 하려면?
			double winRate_ = (double)win[i]/(win[i]+lose[i]);
			winRate_ = Math.round(winRate_*100)/100.0;
			//ex)Math.round = 87.12345 먼저 100을 곱합 =>8712.345 그 후 round 처리 => 8712 그다음 100.0을 나눔 => 87.12
			winRate[i] = winRate_;
		}
		
		//순위계산 (배열비교)
		for(int i =0; i<5; i++) {
			rank[i] =1;
			for(int j=0; j<5; j++) {
				if(winRate[i] < winRate[j]) {
					//나보다 크면 순위가 밀려남
					rank[i]++;
				}
			}
		}
		
		
			
		System.out.println("================");
		System.out.println("최종결과");
		System.out.printf("%5s%n","구단명");
		for(int i =0; i < 5; i++) {
			System.out.printf("%4s 승 : %4d 패 : %4d 승률 : %4.3f  순위 : %4d%n",team[i],win[i],lose[i],winRate[i],rank[i]);
		}
		
	}

}
