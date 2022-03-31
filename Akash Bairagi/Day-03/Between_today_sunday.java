package Day03;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Between_today_sunday {
	
	public static void main(String[] args) {
		LocalDate DateBefore = LocalDate.of(2022, Month.MARCH, 31);
		
		LocalDate DateAfter = LocalDate.of(2022, Month.APRIL, 3);
		
		long TotalDayBetween = ChronoUnit.DAYS.between(DateBefore, DateAfter);
		
		System.out.println(TotalDayBetween);
		
	   }    
}
	

s
