package 출력문;

public class Test02 {

	public static void main(String[] args) {
		// pirintln은 출력 후 줄바꿈
		System.out.println("Hello World");
		System.out.println("Java");
		// println이 쥴버뀸울 해줌 -> "안녕하세요"는 아랫줄에 출력됨
		// \n <- 줄바꿈
		System.out.print("안녕하세요\n");
		System.out.print("자바 연습 중");
		// printf는 사용법이 좀 더 있긴 하지만 지금은 print와 같음
		System.out.printf("printf도 출력문");
		System.out.printf("줄바꿈 X");
	}

}
