package 문제2;

public class Employee {
	String name;
	int salary;
	String department;
	
	public Employee(String name, int salary, String department) {
		super();
		this.name = name;
		this.salary = salary;
		this.department = department;
	}
	// 직원 연봉 반환용 메서드
	public int getSalary() {
		return salary;
	}
	// 직원 연봉 설정용 메서드
	public void setSalary(int salary) {
		if(salary > 0) {			
		this.salary = salary;
		} else {
			System.out.println("연봉은 음수가 될 수 없음");
		}
	}
	// 직원 부서 반환용 메서드
	public String getDepartment() {
		return department;
	}
	// 직원 부서 설정용 메서드
	public void setDepartment(String department) {
		this.department = department;
	}
	// 직원 보너스 적용 메서드
	public void applyBonus(double percentage) {
		if(percentage < 0) {
			System.out.println("보너스는 음수가 될 수 없음");
			return;
		}
		int bonus = (int) (salary * (percentage * 0.4));
		salary += bonus;
	}
	// 정보 출력용 메서드
	public void printInfo() {
		System.out.println("이름 : " + name);
		System.out.println("연봉 : " + salary);
		System.out.println("부서 : " + department);
		System.out.println("----------");
	}
}
