public class Figure_G {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				int spaces = 14;
				
				for(int i=1;i<=9;i++) {
					for(int j=1;j<=i;j++)System.out.print(j);
					for(int j=0;j<=spaces;j++)System.out.print(" ");
					for(int j=i;j>0;j--) {
						if(j!=9) {
							System.out.print(j);
						}
						else if(j==9) {
							j=8;
							System.out.print(j);
						}
					}
					spaces-=2;
					System.out.println();
				}
					

			}

		}
	

	
