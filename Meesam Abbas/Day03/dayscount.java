import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
public class dayscount {

	public static void main(String[] args){
	LocalDate dateBefore = LocalDate.of(2022, Month.MARCH, 31);
	LocalDate dateAfter = LocalDate.of(2022, Month.APRIL, 3);
	long NoOfDaysBetween = ChronoUnit.DAYS.between(dateBefore, dateAfter);
	System.out.println(NoOfDaysBetween);


	}
}
