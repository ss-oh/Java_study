package 문제3;

public class Salesperson extends Employee {

	public Salesperson(String name, int salary) {
		super(name, salary);
	}

	@Override
	public int calculateBonus() {
		return (int) (salary * 0.25);
	}
}
