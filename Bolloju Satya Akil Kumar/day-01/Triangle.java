package begin;

public class Triangle {
	public static void main(String[] args) {
		int spaces =17;
		int star = 1;
	 for(int i=0;i<17;i++){
		 System.out.print(" ");
		 for(int j =0;j<spaces;j++)
			 System.out.print(" ");		 
		 for(int j =0;j<star;j++) 
			 System.out.print("*"); 
		 System.out.println(); 
		 spaces -=1;
		 star+=2;
	 } 
	}
}	