	import java.time.LocalDate;
	import java.time.Month;
	import java.time.temporal.ChronoUnit;
     public class Today_Sun_Assignment3 {
	
		 public static void main(String[] args) {
			LocalDate DateBefore = LocalDate.of(2022, Month.APRIL, 2);
			
			LocalDate DateAfter = LocalDate.of(2022, Month.APRIL, 3);
			
			long TotalDayBetween = ChronoUnit.DAYS.between(DateBefore, DateAfter);
			
			System.out.println(TotalDayBetween);
			
		   }    
	}