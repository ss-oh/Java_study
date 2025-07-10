package For문;

//==for문==
//
//초기값: 반복 실행시 처음 시작하는 값 (몇부터 시작할건지를 정함)
//조건식: 해당 값이 true 일때만 반복시켜 줌 (true/false 검사)
//증감식: 초기값을 증가 / 감소 게산식 (초기값을 몇씩 증가,감소 할 건지)
//for(초기값;조건식;증감식) {
//	
//	반복 실행할 코드

public class Ex01 {

	public static void main(String[] args) {
//		반복을 하려면 반복용 변수가 필요하다
		int i;
		
//		for(i=1; i <= 100; i++) {
////			반복실행
//			
//			if( i % 2 == 0) {
//				System.out.println(i);
//			} 
//			
//		}
//		
//		for(i=2; i <= 100; i= i+2) {
//			System.out.println(i);
//		}
		
		for(i=100; i >=1; i--) {
			System.out.println(i);
		}
		
		System.out.println("==반복종료==");
		System.out.println(i);

	}

}
