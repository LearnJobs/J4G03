package day_3;
import java.util.Scanner;
public class DayOfSunday {

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        System.out.println("Enter weekday number : ");
		        int weekday = scanner.nextInt();

		        if(weekday == 1) {

		            System.out.println("Monday");

		        } else if(weekday == 2) {

		            System.out.println("Tuesday");

		        } else if(weekday == 3) {

		            System.out.println("Wednesday");

		        } else if(weekday == 4) {

		            System.out.println("Thursday");

		        } else if(weekday == 5) {

		            System.out.println("Friday");

		        } else if(weekday == 6) {

		            System.out.println("Saturday");

		        } else if(weekday == 7) {

		            System.out.println("Sunday");

		        } else {

		            System.out.println("Please enter weekday number between 1-7.");
		     }
	}

}
