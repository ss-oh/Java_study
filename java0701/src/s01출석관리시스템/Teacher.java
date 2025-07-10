package s01출석관리시스템;

public class Teacher extends Person {

	public Teacher(String name) {
		super(name);
	}

	@Override
	public void checkAttendance() {
		setPresent(true);
		System.out.println("선생 " + getName() + "님 출석 완료!!");
	}
	
}
