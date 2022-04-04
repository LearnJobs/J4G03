package Day_04;

public class Take_3_Numbers {
	
	
	int hours = 27;
	int minutes = 62;
	int second = 65;
	

		
	public Take_3_Numbers(){
	 for(int i=0; i<3; i++) {
	  try {				
					
	  if(hours>24 || hours<1)throw new InvalidHourException("Entered value is not in the range 1 to 24,  ["+hours+"]");
	  
	  else if(minutes>60 || minutes<1)throw new InvalidMinuteException("Entered value is not in the range 1 to 60,  ["+minutes+"]");
	  
	  else if(second>60 || second<1)throw new InvalidSecondException ("Entered value is not in the range 1 to 60,  ["+second+"]");
		 System.out.println( hours + " is correct.");
		 
		 System.out.println( minutes + " is correct.");
		 
		 System.out.println( second + " is correct.");
		    }catch(InvalidHourException e) {System.out.println(hours+" is invalid. " + e.getMessage());
		    }catch(InvalidMinuteException e) {System.out.println(minutes+" is invalid. " + e.getMessage());
		    }catch(InvalidSecondException e) {System.out.println(second+" is invalid. " + e.getMessage());
				}
			}
		}
		public static void main(String[] args) {
			new Take_3_Numbers();
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
		public InvalidSecondException(String mes) {super(mes);}
	}