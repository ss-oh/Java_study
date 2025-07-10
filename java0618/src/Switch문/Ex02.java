package Switch문;

public class Ex02 {

	public static void main(String[] args) {
		int num = (int)( Math.random()*10)+1;
		
		System.out.println("num : " + num);
		
		switch (num) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 9:
				System.out.println("홀수");
				break; // break : 어디에 있던 {} 영역을 탈출 
				
			default:
				System.out.println("짝수");
		}
		
		switch (num % 2) {
		case 0: {
			System.out.println("짝수");
			break;
		}
		case 1:
			System.out.println("홀수");
		}

	}

}
