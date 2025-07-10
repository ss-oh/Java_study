package s06자바API;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimePackageSample {
	public static void main(String[] args) {

		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		LocalDateTime now = LocalDateTime.now();
		
		System.out.println(date);
		System.out.println(time);
		System.out.println(now);
		
		DateTimeFormatter dtf = 
				DateTimeFormatter.ofPattern("yy년 MM월 dd일 HH시 mm분 ss초");
		
		String str = dtf.format(now);
		
		System.out.println(str);
	}
}








