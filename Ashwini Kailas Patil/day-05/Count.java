package begin5;

import java.io.*;



public class Count 
{

	public static void main(String[] args) throws IOException
	{
         int l=0,w=0,c=0;		
       
         @SuppressWarnings("resource")
		BufferedReader br = new BufferedReader(new FileReader("INPUT.txt"));
         
         String currLine = br.readLine();
         
         while(currLine != null)
         {
        	 l++;
        	 
        	 String words[] = currLine.split("");
        	 w = w + words.length;
        	
        	 for(String word : words)
        	 {
        		 c = c + word.length();
        		 c = c + (words.length - 1);
        		 
        		 currLine = br.readLine();
        	 }
        	 
         }
         System.out.println("No of Lines: " + l);
         System.out.println("No of Words: " + w);
         System.out.println("No of Characters: " + c);
      }

}
