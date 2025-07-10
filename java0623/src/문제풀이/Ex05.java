package 문제풀이;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// 철수는 롤을 좋아한다
//		퇴근 후 금요일 저녁 20시 20분 부터 게임을 시작했는데 
//		칼바람 나락을 하기로 했고
//		10판 플레이 했다  10판 고정진행
//		한판당 15분~40분 걸린다고 했을때
//		게임이 끝나고 난 시간과 요일을 구하시오
//		한판당 시간과 승패여부는 랜덤
//		승리 횟수를 입력하면 ==> 3, 3승을 했을때 몇시 몇요일인지 
//		ex)승패승승패승패패
		
		int oneGame;
		int gameResult;
		int count=0; //승리횟수
		int totalPlayTime=0; //총 플레이타임
		int hour=20, min=20;
		
		Scanner se = new Scanner(System.in);
		
		System.out.println("===게임시작===금요일 20시 20분");
		for(int i=0; i<=10; i++) {
			oneGame = (int)(Math.random()*26)+15; // 게임시간 15분~40분 랜덤설정
			
			gameResult = (int)(Math.random()*2); // 0일때 승리 1 일때 패배
			switch (gameResult) {
				case 0 -> {
					System.out.println("승");
					System.out.println("플레이 타임" + oneGame +"분");
					count++;
					
					
				}
				case 1 -> {
					System.out.println("패");
					System.out.println("플레이 타임" + oneGame +"분");
					
					
				}
				
				
				default ->{
					
				}
				
			}
			
			totalPlayTime= oneGame+totalPlayTime;
			
			
//			if(gameResult==0) {
//				System.out.println("승");
//				System.out.println("플레이 타임" + oneGame +"분");
//				count++;
//				totalPlayTime = (oneGame+oneGame);
//				
//			}else {
//				System.out.println("패");
//				System.out.println("플레이 타임" + oneGame +"분");
//				totalPlayTime = (oneGame+oneGame);
//				
//			}
			
			
		}
		min = min+totalPlayTime;
		hour = hour+(min/60);
		min = min%60;
		
		
		
		System.out.println("===게임 끝===");
		System.out.println("10판 "+count+" 승 "+"시간 : "+ hour +"시간 "+ min+"분"+ min + " 요일 :");

	}

}
