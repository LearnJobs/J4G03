package day03;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Example_day {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        //31-March-2022, change this to your desired Start Date
	LocalDate dateBefore = LocalDate.of(2022, Month.MARCH, 31);
        //3-april-2022, change this to your desired End Date
	LocalDate dateAfter = LocalDate.of(2022, Month.APRIL, 3);
	long noOfDaysBetween = ChronoUnit.DAYS.between(dateBefore, dateAfter);
	System.out.println(noOfDaysBetween);


	}

}
