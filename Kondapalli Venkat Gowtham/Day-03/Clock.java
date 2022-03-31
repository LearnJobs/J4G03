package j4g03.day03;

public class Clock {
	public Clock(int h, int m, int s) {
		if(h<=24 && m<60 && s<60) {
			if(h>=0 && h<12) System.out.println(h+":"+m+":"+s+" AM");
			else if(h==24 || h==0) System.out.println("12"+":"+m+":"+s+" AM");
			else if(h<24 && h>=12) {
				h= h-12;
				System.out.println(h+":"+m+":"+s+" PM");
			}
		}
		else System.out.println("Invalid input");
	}

	public static void main(String[] args) {
		new Clock(13,45,50);
		new Clock(24,52,66);
	}

}
