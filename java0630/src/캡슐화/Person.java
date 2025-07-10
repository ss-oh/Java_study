package 캡슐화;

public class Person {
	private String name;
	private int age;
	String gender;
	
	public Person() {
		
	}
	
	public Person(String name, int age, String gender) {
		this.name = name;
		setAge(age);
		this.gender = gender;
	}



	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	private void setAge(int age) {
		
		if( age >= 0 && age <= 150 )
			this.age = age;
		else
			System.out.println("나이는 0~150까지만 가능");
		
	}
	
	
}










