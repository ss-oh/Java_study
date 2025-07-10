package 연산자;

public class logic {

	public static void main(String[] args) {
		// 비교 / 논리 연산자
		
//		> 	초과 / 크다
//		>=	이상 / 크거나 같다
//		<	미만 / 작다
//		<=	이하 / 작거나 같다
//		== 	같다
//		!=	같지 않다
//		&&	and -> 조건식이 모두 참이면 참, 하나라도 거짓이면 거짓
//		||	or -> 조건식이 하나라도 참이면 참, 모두 거짓이면 거짓
//		!	not -> 참은 거짓으로 거짓은 참으로
//		^	Xor -> 서로 다르면 참, 같으면 거짓
//    	결과값은 항상 ture, false
		
		System.out.println( 5 >= 10 );
		System.out.println("abc" == "ABC");
		
		int a = 100, b = 80;
		boolean result = a > b;
		
		System.out.println( result );
		
		int math = 80, eng = 50;
		//수학과 영어점수가 80 이상인지..?
		System.out.println( math >= 80 && eng >= 80 );
		
		boolean r =  math >= 80 || eng >= 80;
		
		System.out.println(r); // ture
		
		System.out.println(!r); // false
		
//		삼항 연산자
//		조건식 결과에 따라 참 또는 거짓의 값을 실핼 할 수 있음
//		삼항연산자 조건식 ? 참일때 처리할 값 : 거짓일때 처리할 값 ( ex) score >= 80 ? "A" : "F" )
//		ex)점수가 90이상이면 A 아니면 F <- 이런걸 처리함
		
		int score = 90;
		System.out.println( score >= 80 ? "A" : "F" );
		
		String re = score >= 80 ? "A" : "F";
		
		System.out.println(re);
		
		
	}

}
