package 문제3;

public class Employee {
	
	String name;
	int salary;
	
	// 직원 메서드
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	// 보너스 계산 메서드
	public int calculateBonus() {
		return 0; // Q. 리턴값이 어디로 가는지 확인
	}
	// 직원 정보 출력 메서드
	public void printInfo() {
		System.out.println("이름 : " + name + " " + "급여 : " + salary);
	}
}
