package s01출석관리시스템;

public class Main {
	public static void main(String[] args) {
		
//		자동 형변환(업 캐스팅)
		Person[] people = {
				new Student("홍길동"),
				new Teacher("유재석"),
				new Teacher("노홍철"),
				new Student("정준하"),
				new Student("하하")
		};
		
		people[1].checkAttendance();
		people[2].checkAttendance();
		people[4].checkAttendance();
		
//		출석 시간이 끝남
		
		int count = countPresent(people);
		
		System.out.println("출석한 인원 수 : " + count);
		
	}
	
	// 출석한 사람 수 리턴해주는 메서드
	public static int countPresent(Person[] people) {
		int cnt = 0;
		
		for( Person p : people ) {
			if(p.isPresent())
				cnt++;
		}
		
		return cnt;
	}
	
	
}



















