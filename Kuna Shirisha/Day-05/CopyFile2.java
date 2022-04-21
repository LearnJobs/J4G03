package DAY5;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

/*
 * 		To create another duplicate file.
 * 		Create an identical file in another name
 */
public class CopyFile2 {
	public String sourceFile = "textfile.txt";
	public String destinationFile = "copytextfile.txt";

	public CopyFile2(String file) {
		try {
			File inFile = new File(file);
			long size = inFile.length();
			double fivePC = .05*size;
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
			

			out.close();
			in.close();
			System.out.println("Copying completed");
			
			
		} catch(FileNotFoundException e) {
			System.out.println(e);
		} catch(IOException e) {
			System.out.println(e);
		} catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the source file name :");
		System.out.println("Enter the destination file name :");
		String source = scanner.nextLine(); 
		new CopyFile2(source);
	
	}
}
