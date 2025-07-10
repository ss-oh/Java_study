package s05예외처리;

class CustomException extends Exception {

	public CustomException(String message) {
		super(message);
	}
	
}

public class Sample04 {
	public static void main(String[] args) {

		try {
			int age = -1;
			check(age);
		} catch (CustomException e) {
			System.out.println( e.getMessage() );
			System.out.println( e );
			e.printStackTrace();
		}
	}
	
	public static void check(int age) throws CustomException {
		
		if( age < 0 ) {
			throw new CustomException("나이는 0보다 작으면 안됩니다");
		}
		
	}
	
}









