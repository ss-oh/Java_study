package 클래스연습;

import java.util.Scanner;

public class Student {
//	학생 관리 프로그램
//	이름, 학년, 성적, 
	Scanner sc = new Scanner(System.in);
	
	String name;
	int age;
//	오버로딩 - 기능은 같은데 매개변수가 달라서 똑같은걸 여러개 만들 수 있는 것.
	Student(){
		
	}
	
//	생성자 - 생성자는 여러개 만들 수 있는데 매개변수 [oooo()<-- ()이괄호부분]이 무조건 달라야 한다.
	Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
}
