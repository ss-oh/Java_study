package s02알림시스템;

public class Receiver {

	private String name;
	private String contact;
	private int alertLevel;
	private int alertCount;
	
	public Receiver(String name, String contact) {
		this.name = name;
		this.contact = contact;
		this.alertLevel = 1;
		this.alertCount = 0;
	}
	
	public void sendAlert() {
		alertCount++;
		System.out.println(name + "에게 알림 전송");
	}

	public int getAlertLevel() {
		return alertLevel;
	}

	public void setAlertLevel(int alertLevel) {
		this.alertLevel = alertLevel;
	}

	public int getAlertCount() {
		return alertCount;
	}

	public void setAlertCount(int alertCount) {
		this.alertCount = alertCount;
	}

	public String getName() {
		return name;
	}

	public String getContact() {
		return contact;
	}
	
	
	
}
