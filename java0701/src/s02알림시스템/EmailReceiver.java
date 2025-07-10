package s02알림시스템;

public class EmailReceiver extends Receiver {

	public EmailReceiver(String name, String contact) {
		super(name, contact);
	}

	@Override
	public void sendAlert() {
//		기존 알림 전송횟수를 1 증가
//		원래 전송횟수를 파악 -> 전송횟수에 1 더해줌 -> 더해준 결과를 다시 전송횟수로 지정
		int alertCount = getAlertCount(); // 기존 전송횟수를 가져옴
		
		alertCount = alertCount + 1; // 기존 전송횟수에 1 더함
		
		setAlertCount(alertCount); // 더한 결과를 다시 전송횟수로 지정
		
		
//		setAlertCount( getAlertCount() + 1 ); 위 3줄 한줄로 처리한 코드임
		
		System.out.println("[EMAIL] - " + getName() + " : 레벨 " + getAlertLevel() + " 알림 전송");
		
	}

	
	
}








