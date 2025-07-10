package dowhile문;

public class Ex01 {

	public static void main(String[] args) {

		int i = 1;
		
		
		// do-while은 초기 한번 무조건 실행된 후
		// 조건 비교를 함
		do {
			//반복 실행할 코드
			System.out.println(i);
			i++;
			
		} while(i <= 5);

	}

}
