package 열거타입;

import java.util.Arrays;

public class WeekMain {
	public static void main(String[] args) {
		Week week = null;
		int num=2;
		
		switch( num ) {
		case 1:
			week = Week.MONDAY;
			break;
		case 2:
			week = Week.TUESDAY;
			break;
		}
		
		System.out.println("요일 : " + week);
		
		System.out.println( Arrays.toString( Week.values() ) );
//		.values() : 열거타입의 상수들을 배열로 리턴
		for( Week w : Week.values() ) {
			System.out.println(w);
		}
		
		System.out.println("--------------------------");
//		valueOf : 해당 이름의 상수값을 리턴
		System.out.println( Week.valueOf("SUNDAY") );
		
		
		System.out.println( Week.MONDAY.getValue() );
		
		
	}
}










