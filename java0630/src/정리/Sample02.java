package 정리;

class Person {
	String name;
	
	public void printInfo() {
		System.out.println("이름 : " + name);
	}
}

// 상속받은 클래스는 필요하면 필드와 메서드는 추가 가능함
// 아래 클래스는 math, printScore가 추가 구현됨
class Student extends Person {
	int math;
	
//	메서드 오버라이딩
//	부모 클래스에서 상속받은 메서드는 재정의가 가능함
//	그래서 상속받은 메서드와 동일한 메서드를 새롭게 재정의 함
	public void printInfo() {
//		this는 자기자신, super는 부모를 가리킴
//		여기서 super.printInfo()를 호출한 이유는 어차피 이름은 동일하게 출력할거라서...
//		유지보수성을 높이기 위해 호출해서 사용함
//		오버라이딩을 했다고 해서 무조건 super를 사용해야 하는건 아님
		super.printInfo();
		System.out.println("수학점수 : " + math);
	}
	
	public void printScore() {
		System.out.println("점수 : " + math);
	}
}

public class Sample02 {
	public static void main(String[] args) {

//		업 캐스팅
		Person p = new Student();
		
		p.name = "홍길동";

//		Person클래스의 printInfo메서드는 이름만 출력하도록 구현되어있음
//		실제 아래코드를 실행시키면 이름과 수학점수를 출력하도록 처리됨
//		printInfo는 Student클래스에서 오버라이딩된 메서드이므로
//		처음 생성된 객체에 해당하는 printInfo가 실행됨
		p.printInfo();
		
//		단, math변수는 Person클래스와는 상관없는 Student의 필드이므로 
//		제어가 불가능함
//		printScore 메서드도 같은 개념임
//		p.math = 20;
//		p.printScore();
		
//		결국 Student클래스에 있는 math, printScore를 사용하려면
//		다시 Student타입으로 형변환을 해야함 ( 다운 캐스팅 )
		Student stu = (Student) p;
		
		stu.math = 80;
		stu.printScore();
		
		
	}
}
















