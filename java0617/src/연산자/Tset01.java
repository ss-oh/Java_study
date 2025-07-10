package 연산자;

public class Tset01 {
// 책 80p
	public static void main(String[] args) {
		
		//증감 연산자 ( ++,-- )
		int a = 10;
		
		//a = a + 1;
		
		
		System.out.println(++a); //11
		System.out.println(a); //11
		System.out.println(a++); //11 연산을 처리하고 1증가 (결과가 바로 보이지 않음)
		System.out.println(a); //12
		
		System.out.println(a % 5); // 2 <= % : 나눈 값의 나머지를 구해주는 연산자
		
		int b = 10;
		b +=5; // b = b + 5 와 같음
		System.out.println(b);
		
		b /= 5; // b = b / 5
		System.out.println(b); // 3
		
		b *= 2; // b = b * 2
		System.out.println(b); // 6
		
		

	}

}
