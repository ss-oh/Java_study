package s01출석관리시스템;

public class Person {
	private String name;
	private boolean isPresent;
	
	Person(String name) {
		this.name = name;
	}
	
	// 출석 처리해주는 메서드
	public void checkAttendance() {
		isPresent = true;
		System.out.println(name + " 출석 완료!");
	}

	public boolean isPresent() {
		return isPresent;
	}

	public void setPresent(boolean isPresent) {
		this.isPresent = isPresent;
	}

	public String getName() {
		return name;
	}
	
	
	
	
	
}











