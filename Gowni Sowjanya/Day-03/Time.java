package clocK;

class Clock
{
	int Hours,Min,Sec;
	Clock(int h, int m, int s)
	{
		Hours=h;
		Min=m;
		Sec=s;
	}
  void isTimeValid()
  {
	  if(Hours>=0  && Hours<24 && Min>0 && Min<60 && Sec>0 && Sec<60)
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
	  if(Hours<12)
	  {
		  System.out.println("Time = " +Hours+ ":"+Min+":"+Sec+"AM");
	  }
	  else
	  {
		  Hours=Hours-12;
		  System.out.println("Time = " +Hours+ ":"+Min+":"+Sec+"AM");
      }
  }
}
public class Time
{

	public static void main(String[] args) 
	{
	    Clock c1 =  new Clock(21,55,12);
		c1.isTimeValid();
		c1.setTimeMode();

	}

}

