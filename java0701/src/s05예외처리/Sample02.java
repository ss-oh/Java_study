package s05예외처리;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Sample02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = {1,2,3};
		
		try {
			System.out.print("숫자 입력 : ");
			int num = sc.nextInt();
			
			int result;
			
			result = 10 / num;
			System.out.println("나눈 결과 : " + result);
			
			arr[num] = 100;
			System.out.println(Arrays.toString(arr));
		} catch(InputMismatchException e) {
			System.out.println( e.toString() );
			System.out.println("숫자만 입력가능합니다.");
			
		} catch(ArithmeticException e) {
			System.out.println( e.getMessage() );
			System.out.println( e.toString() );
			e.printStackTrace();
			System.out.println("0으로 나눌수 없습니다.");
			
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("해당 배열방이 존재하지 않습니다");
			
		} catch(Exception e) {
			System.out.println("알수없는 오류발생");
		
		}
		
		
	}
}





