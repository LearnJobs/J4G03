
public class tables {
	
	

		public tables(int start, int end) {
			for(int i=1; i<=10; i++) {
				for(int j=start; j<=end; j++) {
					System.out.print(padLeft(j,2) + " x " + padLeft(i,2) + " = " + padLeft((i*j),3) + "   ");
					
				}
				System.out.println();
			}
			System.out.println();
		}

		public String padLeft(int number, int length) {
			StringBuffer buf = new StringBuffer(String.valueOf(number));
			for(int i=buf.length(); i<length; i++) {
				buf.insert(0," ");     
			}
			return buf.toString();
		}
		
		public static void main(String[] args) {
			new tables(2,6);
			new tables(7,10);

		
	}
	
	
	

}
