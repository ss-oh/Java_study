package 문제3;

public class Manager extends Employee {

	public Manager(String name, int salary) {
		super(name, salary);
	}

	@Override
	public int calculateBonus() {
		return (int) (salary * 0.25);
	}
}
