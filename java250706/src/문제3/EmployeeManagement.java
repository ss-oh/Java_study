package 문제3;

public class EmployeeManagement {
	
	
	public static void calcSalary(Employee[] person) {
		for(Employee p : person) {
			int bonus = p.calculateBonus();
			p.salary += bonus;
		}
	}
	
	
	public static void main(String[] args) {
		Employee[] person = {
				new Manager("John", 5000),
				new Engineer("Emily", 3000),
				new Manager("David", 2000),
				new Salesperson("Sarah", 4000)		
		};
	}
	
	
}
//보너스 x0.25