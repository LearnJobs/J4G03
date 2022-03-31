package j4g03.day03;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class DateExample {
	public static void main(String[] args) {
		Date today = new Date();
		System.out.println(today);
		SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE, dd-MM-yyyy (HH:mm a)");
		System.out.println(dateFormat.format(today));

		LocalDate lDate = LocalDate.now();
		lDate = lDate.plusDays(3);
		System.out.println(lDate);

		LocalTime lTime = LocalTime.now();
		System.out.println(lTime);
	}
}
