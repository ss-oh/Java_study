package 클래스연습;

import java.util.Scanner;

public class StudentMain {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// 학생 5명의 정보를 이용해서 뭔가 하는 프로그램
		
		String name = "홍길동";
		
		Student s = new Student();
		Student s2 = new Student(name,20);
		Student s3 = new Student("홍길동",20);
		Student s4 = new Student();
		
//		객체 생성을 하려면 그걸 만들어주는 코드가 있어야 함
		
		
	}

}
