package 참조타입;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name1 = "홍길동"; 
		String name2 = "홍길동"; 
		// name1과2는 동일한 주소를 참조
		String name3 = new String("홍길동");
		// name3은 new 키워드를 통해 새로운 홍길동(주소값)이 생성
		// 새로 생선된 주소를 참조하므로 name1과는 다른 참조 주소를 가짐
		System.out.println(name1 == name3);
		// 단순 ==, !=비교를 하면 주소값을 가지고 비교를 하므로
		// 내용을 비교하고 싶으면 equals 이용
		int i =54150062;
		System.out.println(name1.hashCode() == i);
		
		System.out.println(name1 == name2);
		// true 로 나오는 이유 : name1과 2가 동일한 주소값을 가짐.
		System.out.println(name1.hashCode()); 
		System.out.println(name2.hashCode());
		System.out.println(name1.equals(name3));
		//  <-- 동일한 주소값
		
		
		/*
		  
		== 변수 ==
		
		일반변수 - int a, double b[소문자로 시작하는 것들] - 변수의 값을 바로가짐
		참조변수 - String s, Scanner sc [대문자로 시작하는 것들] - 변수의 "주소값"을 가짐
		
		*/
		
	}

}
