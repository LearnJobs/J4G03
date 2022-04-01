package j4g03day2.j4g03day02;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

  public class daycounter {
	   public static void main(String[] args) {
		LocalDate dateBefore = LocalDate.of(2022, Month.MARCH, 31);
		LocalDate dateAfter = LocalDate.of(2022, Month.APRIL, 3);
		long noOfDaysBetween = ChronoUnit.DAYS.between(dateBefore, dateAfter);
		System.out.println(noOfDaysBetween);
	   }    
	}


