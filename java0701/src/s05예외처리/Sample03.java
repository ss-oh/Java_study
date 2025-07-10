package s05예외처리;

public class Sample03 {
	public static void main(String[] args) {

		System.out.println("메인 실행");
		
		try {
			test();
		} catch(Exception e) {
			System.out.println("메인 예외발생");
			e.printStackTrace();
		}
		
		
	}

	public static void test() throws Exception {
		
		try {
			System.out.println("테스트 메서드 실행");
			int a = 10/0;
		} catch(Exception e) {
			System.out.println("test메서드 예외 발생");
			throw new Exception("0나누기 안됨!!");
		}
		
	}
	
}




