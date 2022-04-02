
public class figure_h {

		public static void main(String[] args) {
			int spaces =0;
			for(int i=9;i>0;i--) {
				for(int j=1;j<=i;j++)System.out.print(j);
				for(int j=1;j<spaces;j++)System.out.print(" ");
				for(int j=i;j>0;j--) {
					if(j!=9) {
					System.out.print(j);
				}
					else if(j==9) {
						j=8;
						System.out.print(j);
					}}
				System.out.println();
				spaces+=2;
			}
		}
	
	
	
	
	
	
	
	
	

}
