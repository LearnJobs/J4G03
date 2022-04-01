package j4g03.day04;

/*
 PROJECT QUESTION:
    In an election in some country the following voters are allowed to cast vote:
        a)  between >=18 year and <=70 year
        b)  <18 can't cast vote
        c)  >70 can't cast vote

    PLAN:
        Throwable
        +- Exception
        |  +- AgeException
        |  |  +- InvalidAgeException
        |  |  |  +- NegativeAgeException
        |  |  |  +- WrongDataInAgeException
        |  |  +- AgeLimitException
        |  |  |  +- TooYoundAgeException
        |  |  |  +- TooOldAgeException

        String ages[] = {"25", "35", "11", "19", "55", "94", "XY", "75", "-3", "22", "12", "10", "45", "75", "51", "13"};

 */

public class ElectionAgeCheck2 {
	int age;
	String ages[] = {"25", "35", "11", "19", "55", "94", "XY", "75", "-3", "22", "12", "10", "45", "75", "51", "13"};

	public ElectionAgeCheck2() {
		for(int i=0; i<ages.length; i++) {
			try {
				age = Integer.parseInt(ages[i]);
				doAgeCheck(age);
				System.out.println("age ["+age+"] is correct");
			} catch(NegativeAgeException e) {
				System.out.println(age + " is negative: "+e.getMessage());
			} catch(NumberFormatException e) {
				System.out.println(ages[i] + " is wrong data: "+e.getMessage());
			} catch(TooYoungAgeException e) {
				System.out.println(age + " is too young: "+e.getMessage());
			} catch(TooOldAgeException e) {
				System.out.println(age + " is too old: "+e.getMessage());
			}
		}
	}

	public void doAgeCheck(int age) throws NegativeAgeException,
										   TooYoungAgeException,
										   TooOldAgeException {
		if(age < 0) 	  throw new NegativeAgeException("The age is less then 0 ["+age+"]");
		else if(age < 18) throw new TooYoungAgeException("The age is less then 18 ["+age+"]");
		else if(age > 70) throw new TooOldAgeException("The age is greater then 70 ["+age+"]");
	}

	public static void main(String[] args) {
		new ElectionAgeCheck2();
	}

}
