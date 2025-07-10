package 클래스01;

public class Animal {
	
	String name;
	int age;
	
	// 이름과 나이를 출력해주는 메서드 구현
	
	//메서드 - 자주 사용될 코드를 클래스에 정의
	//메서드 형식 -> 접근제한자 반환타입 메서드이름(메서드에 필요한 값- 매개변수){
	//실행할 코드
	//return 매서드를 호출한 곳으로 되돌려줄 값; // 반환타입에 따라 있을수도 없을수도 있음
	//}
	
	// 이름과 나이를 출력해주는 메서드
	public void showInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
	
	// 반려동물 나이에서 5곱한 결과를 다시 되돌려주는 메서드
	public int mulAge() {
		
		int x = age*5;
		
		return x;
		
//		return = age*5;
	}
}
