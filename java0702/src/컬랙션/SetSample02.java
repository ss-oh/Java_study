package 컬랙션;

import java.util.HashSet;

public class SetSample02 {

	public static void main(String[] args) {

		HashSet<Person> set = new HashSet<>();
		
		set.add(new Person("홍길동",20));
		set.add(new Person("고길동",30));
		set.add(new Person("김자바",25));
		
		set.add(new Person("고길동",30));

		
		for(Person p : set) {
			System.out.println( p.getName());
		}
	}

}
