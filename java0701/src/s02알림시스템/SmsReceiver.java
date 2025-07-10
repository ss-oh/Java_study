package s02알림시스템;

public class SmsReceiver extends Receiver {

	public SmsReceiver(String name, String contact) {
		super(name, contact);
	}

	@Override
	public void sendAlert() {
		setAlertCount(getAlertCount() + 1);
		
		System.out.println("[SMS] - " + getName() + " : 레벨 " + getAlertLevel() + " 알림 전송");
	}

	
	
}
