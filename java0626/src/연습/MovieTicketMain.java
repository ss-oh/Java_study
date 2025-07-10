package 연습;

import java.util.Scanner;

public class MovieTicketMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		MovieTicket ticket = new MovieTicket(12000);
		
		boolean ty = true;
		
		
		while(ty) {
			
			System.out.println("[1] 예매하기");
			System.out.println("[2] 종료하기");
			
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				ticket.selectSeat();
				break;
				
			case 2:
				int tot = ticket.totalAmount();
				System.out.println("최종금액 : " + tot);
				ty = false;
//				System.exit(0);// 종료하는 코드
				System.out.println("예매가 완료되었습니다.");
				break;
				
			}
			
			
		}
		
		
	}

}
