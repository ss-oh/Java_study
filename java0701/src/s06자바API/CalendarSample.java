package s06자바API;

import java.util.Calendar;

public class CalendarSample {
	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		
		System.out.println( c.get( Calendar.YEAR ) );
		System.out.println( c.get( Calendar.MONTH ) );
		System.out.println( c.get( Calendar.DAY_OF_WEEK ));
		
	}
}
