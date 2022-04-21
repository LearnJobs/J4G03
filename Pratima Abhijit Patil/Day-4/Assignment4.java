public class Assignment4 {
	public Assignment4(int h, int m, int s) {
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
		new Assignment4(13,45,50);
		new Assignment4(24,52,66);
	}
}