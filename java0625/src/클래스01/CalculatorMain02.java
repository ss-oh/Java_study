package 클래스01;

import java.util.Arrays;

public class CalculatorMain02 {

	public static void main(String[] args) {
		
		Calculator c = new Calculator();
		
		
		System.out.println(c.sum(1));
		System.out.println(c.sum(1,2,35,5));
		System.out.println(c.sum(1));
		
		int[] arr = {10,20,30,40,50,};
		
		System.out.println(c.average(arr));
		System.out.println(arr);
		c.test(arr);
		System.out.println(Arrays.toString(arr));

	}

}
