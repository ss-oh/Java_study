package 문제3;

public class Engineer extends Employee {

	public Engineer(String name, int salary) {
		super(name, salary);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int calculateBonus() {
		return (int) (salary * 0.25);	
	}
	
}
