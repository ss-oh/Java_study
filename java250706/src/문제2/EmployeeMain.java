package 문제2;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee[] people = {
				new Man("유재석", 3000, "개발팀"),
				new Man("노홍철", 2400, "인사팀"),
				new Man("정준하", 2000, "영업팀")
		};
		for(Employee e : people) {
			e.applyBonus(0.5);
			e.printInfo();
		}
	}
	}
