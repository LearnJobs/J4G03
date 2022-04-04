package Day05;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class filecopy {
	
	
	
	
	
	
	
	public String destinationFile = "C:\\Users\\Nasir kamal\\Desktop\\textfilecopy.txt" ;

	public filecopy(String file) {
		try {
			File inFile = new File(file);
			long size = inFile.length();
			double fivePC = .02*size;
			int count = 0;

			InputStream in = new FileInputStream(file);
			OutputStream out = new FileOutputStream(destinationFile);

			int i = 0;
			while( (i=in.read()) != -1 ) {
				out.write(i);
				count++;
				if(count>=fivePC) {
					System.out.print(".");
					count = 0;
				}
			}
			System.out.println();

			out.close();
			in.close();
			System.out.println("Copy completed");
			System.out.println();
			System.out.println("Your File have been Copied to : "+"\n"+destinationFile);
			
		} catch(FileNotFoundException e) {
			System.out.println(e);
		} catch(IOException e) {
			System.out.println(e);
		} catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.err.println("Please enter Path in the format as--"
				+ "\nC:\\\\Users\\\\AMIT SINGH\\\\Desktop\\\\textfilecopy.txt");
		System.out.println("Enter File Name, Path with Extension : ");
		String source = scanner.nextLine(); 
		new File(source);
	
	}

}
