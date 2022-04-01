package day3;

public class exc {
	int hours,minutes,seconds;
	Clock(int h, int m, int s)
	{
		hours=h;
		minutes=m;
		seconds=s;
	}
  void isTimeValid()
  {
	  if(hours>=0  && hours<24 && minutes>0 && minutes<60 && seconds>0 && seconds<60)
	  {
		 System.out.println("time is valid"); 
	  }
	  else
	  {
		  System.out.println("time is not valid");
	  }
  }
  void setTimeMode()
  {
	  if(hours<12)
	  {
		  System.out.println("Time = " +hours+ ":"+minutes+":"+seconds+"AM");
	  }
	  else
	  {
		  hours=hours-12;
		  System.out.println("Time = " +hours+ ":"+minutes+":"+seconds+"AM");
      }
  }
}
public class Example_C
{

	public static void main(String[] args) 
	{
	    Clock c1 =  new Clock(19,34,45);
		c1.isTimeValid();
		c1.setTimeMode();

	}

}
