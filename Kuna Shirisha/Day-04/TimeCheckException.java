package DAY4;

public class TimeCheckException {

	int h = 26;
	int m = 70;
	int s = 80;
	
	public TimeCheckException(){
		for(int i=0;i<3;i++) {
			try {
				if(h>24 || h<1)throw new InvalidHourException("Your entered invalid value 1 to 24, i.e ["+h+"]");
				else if(m>60 || m<1)throw new InvalidMinuteException("Your entered invalid value 1 to 60, i.e ["+m+"]");
				else if(s>60 || s<1)throw new InvalidSecondException ("Your entered invalid value 1 to 60, i.e ["+s+"]");
				System.out.println( h + " is correct.");
				System.out.println( m + " is correct.");
				System.out.println( s + " is correct.");
			}catch(InvalidHourException e) {System.out.println(h+" is invalid. " + e.getMessage());
			}catch(InvalidMinuteException e) {System.out.println(m+" is invalid. " + e.getMessage());
			}catch(InvalidSecondException e) {System.out.println(s+" is invalid. " + e.getMessage());
			}
		}
	}
	public static void main(String[] args) {
		new TimeCheckException();
	}
}

class TimeException extends Exception{
	private static final long serialVersionUID = 1L;
	public TimeException() {super();}
	public TimeException(String mes) {super(mes);}
}

class InvalidHourException extends TimeException{
	private static final long serialVersionUID = 1L;
	public InvalidHourException() {super();}
	public InvalidHourException(String mes) {super(mes);}
}

class InvalidMinuteException extends TimeException{
	private static final long serialVersionUID = 1L;
	public InvalidMinuteException() {super();}
	public InvalidMinuteException(String mes) {super(mes);}
}

class InvalidSecondException extends TimeException{
	private static final long serialVersionUID = 1L;
	public InvalidSecondException() {super();}
	public InvalidSecondException(String mes) {super(mes);
	}
	}