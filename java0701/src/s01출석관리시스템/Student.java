package s01출석관리시스템;

public class Student extends Person {

	Student(String name) {
		super(name);
	}

	@Override
	public void checkAttendance() {
//		super.present = true; 접근제한자로 인해 true변경을 못함
		super.setPresent(true);
		System.out.println("학생 " + getName() + "님 출석 완료!!");
	}
	
}
