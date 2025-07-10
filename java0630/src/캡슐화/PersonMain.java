package 캡슐화;

public class PersonMain {
	public static void main(String[] args) {
		Person p = new Person();
		Person p2 = new Person("고길동", 20, "여");
		
		p.gender = "ㅁㄴㅇㅁㄴㅇ";
//		p.name = "홍길동"; - private이니까
		p.setName("홍길동");
		
		System.out.println(p.gender);
//		System.out.println(p.name); - private이니까
		System.out.println( p.getName() );
		
//		p.setAge(300);
		System.out.println( p.getAge() );
//		p.setAge(30);
		System.out.println( p.getAge() );
		
		
		
		
	}
}







