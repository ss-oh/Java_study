package s02알림시스템;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Receiver[] receivers = {
			new EmailReceiver("홍길동", "abc@gmail.com"),
			new SmsReceiver("유재석", "010-123-1123"),
			new SmsReceiver("노홍철", "010-9999-1111"),
			new EmailReceiver("하하", "qwer@naver.com"),
			new EmailReceiver("이광수", "lee@kakao.com")
		};
		
		Scanner sc = new Scanner(System.in);
		int menu;
		
		
		System.out.println("===== 알림 전송 시스템 =====");
		while(true) {
			System.out.println("1. 수신자 목록 보기");
			System.out.println("2. 알림 레벨 설정");
			System.out.println("3. 알림 전송");
			System.out.println("4. 전송 이력 보기");
			System.out.println("0. 종료");
			System.out.print("선택 : ");
			menu = sc.nextInt();
			
			if(menu == 0)
				break;
			
			switch( menu ) {
			case 1:
				showReceivers(receivers);
				break;
			case 2:
				setAlertLevel(receivers);
				break;
			case 3:
				sendAlert(receivers);
				break;
			case 4:
				showSendHistory(receivers);
				break;
				
			}
			
		}
		
		
		
		
	}
	
	public static void showReceivers( Receiver[] list ) {
		System.out.println("=== 수신자 목록 ===");
		
		for( Receiver r : list ) {
			System.out.println(r.getName() + " / " + r.getContact() + " / " + r.getAlertLevel());
		}
	}
	
	public static void setAlertLevel( Receiver[] list ) {
		Scanner sc = new Scanner(System.in);
		
		showReceivers(list);
		System.out.print("레벨 변경할 사람 번호 입력 : ");
		int index = sc.nextInt();
		
		if( index >= 1 && index <= list.length ) {
			System.out.print("새 레벨 설정 : ");
			int level = sc.nextInt();
			
			list[index - 1].setAlertLevel(level);
			
			System.out.println("레벨 변경 완료!");
		} else {
			System.out.println("잘못된 번호");
		}
		
	}
	
	public static void sendAlert(Receiver[] list) {
		System.out.println("== 레벨이 2이상인 사람에게 알림 전송 ==");
		int count = 0;
		
		for( Receiver r : list ) {
			if( r.getAlertLevel() >= 2 ) {
				r.sendAlert();
				count++;
			}
		}
		
		if( count == 0 ) {
			System.out.println("전송 대상이 없음");
		} else {
			System.out.println(count + "명에게 알림 전송 성공!!");
		}
		
	}
	
	public static void showSendHistory(Receiver[] list) {
		System.out.println("=== 전송 이력 ===");
		
		for( Receiver r : list ) {
			System.out.println(r.getName() + " : " + r.getAlertCount() + "회");
		}
		
	}
	
}
















