package 클래스01;

public class ExMain01 {

	public static void main(String[] args) {
		
		Animal cat = new Animal();
		Animal dog = new Animal();
		Animal dog2 = new Animal();
		
//		클래스로 만들어진 객체 : 인스턴스
//		cat:객체 / cat 객체는 Animal의 인스턴스
//		cat은 인스턴스다 X -> cat은 객체다
//		cat은 Animal의 객체 X -> cat은 Animal의 인스턴스
		
		cat.name = "나비";
		cat.age = 1;
		
		dog.name = "밤비";
		dog.age = 8;
	
		dog2.name = "초코";
		dog2.age = 10;
	
		cat.showInfo();
		dog.showInfo();
		dog2.showInfo();
		
		//해당 반려동물의 나이를 사람나이로 환산하면 몇살이다를 출력
		int a = cat.mulAge();
		System.out.println(a);
		
		a = dog.mulAge();
		System.out.println(a);
		
		a = dog2.mulAge();
		System.out.println(a);
		
		
		//메서드 - 자주 사용될 코드를 클래스에 정의
		//메서드 형식 -> 접근제한자 반환타입 메서드이름(메서드에 필요한 값- 매개변수){
		//실행할 코드
		//return 매서드를 호출한 곳으로 되돌려줄 값; // 반환타입에 따라 있을수도 없을수도 있음
		//}

	}

}
