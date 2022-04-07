package programs.day3;



import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;



public class findday {
	public static void main (String [] args) {
	
		LocalDate today= LocalDate.of(2022, Month.MARCH, 31);
		
		LocalDate sunday= LocalDate.of(2022, Month.APRIL, 3);
		
		long numberofdays =ChronoUnit.DAYS.between(today,sunday);
		System.out.println(numberofdays);
		
	}

}


