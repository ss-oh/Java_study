package 문제풀이;

public class Ex05_풀이 {

	public static void main(String[] args) {
		int count =0; //승리 횟수 저장
		int totalPlayTime = 0; //10판 게임한 시간
		int m = 20, h = 20; // 20분, 20시 초기값
		String[] week = {"월","화","수","목","금","토","일"};
		int weekNum = 4; //게임 시작하는 요일번호
		
		//10판 반복함
		
		for(int i=1; i<=10; i++) {
			//한판당 시간 (15~40)
			int playTime = (int)(Math.random()*26)+15;
			totalPlayTime = totalPlayTime + playTime;
			
			//한판 승패 여부 ( 0:패, 1:승)
			int result = (int)(Math.random()*2);
			
			if(result == 1)
				count++;
		}
		
		//게임 시작 시간은 20:20 (금)
		
		m = m + totalPlayTime; // 현재 분에서 총 게임 시간을 더해줌
		h = h +( m / 60 );
		m = m % 60;
		
		weekNum = weekNum + (h/24);
		weekNum = weekNum % 7 ;
		
		h = h % 24;
		
		System.out.println(h + "시" + m + "분" + week[weekNum] + "요일");
		System.out.println(count + "승");
	}

}
