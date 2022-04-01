
public class triangle0to9 {

	public static void main(String[] args) {
		int spaces = 9;
		int count = 1;
		for(int i=0; i<=9;i++)
		{
			for(int j=0; j<spaces; j++) System.out.print (" ");
			
			for(int j=0; j<i; j++) System.out.print (i);
			for(int j=0; j<count; j++) System.out.print (i);
			System.out.println();
			spaces--;
			count ++;
			
		}

	}

}
