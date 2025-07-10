package 연습;

import java.util.Scanner;

public class MovieTicket {
	
	int [] seat = new int[10]; //좌석 상태 저장 배열 (0.빈자리 1. 예매완료)
	int price;
	
	
	MovieTicket(int price) {
		this.price = price;
	}
	
	public void printSeat() {
		for(int i=0; i<seat.length; i++) {
			if(seat[i] == 0)
				System.out.print("[ ]");
			else
				System.out.print("[V]");
		}
		System.out.println();
	}
	
	public void selectSeat() {
		Scanner sc = new Scanner(System.in);
		
		printSeat();
		System.out.println("좌석 번호를 입력하세요 : ");
		int seatNum = sc.nextInt();
		
		if( seat [seatNum-1] == 0) {
			seat[seatNum-1] =1;
		}else {
			System.out.println("이미 예약된 자리입니다.");
		}
		
		printSeat();
	}
	
	public int totalAmount() {
		
		int cnt = 0;
		
		for(int s : seat) {
			if( s == 1 )
				cnt++;
		}
		
		return price * cnt;
	}
	
	
}
