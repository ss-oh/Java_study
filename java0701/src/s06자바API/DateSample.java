package s06자바API;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateSample {
	public static void main(String[] args) {

		Date now = new Date();
		System.out.println( now );
		
		SimpleDateFormat sdf = 
				new SimpleDateFormat("yyyy-MM-dd");
		
		String date = sdf.format(now);
		System.out.println(date);
		
	}
}







