package Switch문;

public class Ex04 {

	public static void main(String[] args) {
		char grade ='a';
		//달라진 작성법 (버전에 따라 java13부터 가능 )
		switch (grade) {
			case 'a', 'A' -> {
				System.out.println("우수");
			}
			case 'b','B' -> {
				System.out.println("일반");
			}
			default -> {
				System.out.println("보통");
			}
		} 
		
		

	}

}
