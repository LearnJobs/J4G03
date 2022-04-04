package begin5;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/*
 * 		To create another duplicate file.
 * 		Create an identical file in another name
 */

public class CopyFile1 {
	public String sourceFile = "akhil.txt";
	public String destinationFile = "Copytextfile.txt";

	public CopyFile1() {
		try {
			InputStream in = new FileInputStream(sourceFile);
			OutputStream out = new FileOutputStream(destinationFile);
			
			int i = 0;
			while( (i=in.read()) != -1 ) {
				out.write(i);
			}
			
			out.close();
			in.close();
		} catch(FileNotFoundException e) {
			System.out.println(e);
		} catch(IOException e) {
			System.out.println(e);
		} catch(Exception e) {
		}
	}
	
	public static void main(String[] args) {
		new CopyFile1();
	}

}
