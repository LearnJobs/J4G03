package begin5;



import java.io.File;
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

public class CopyFile2 {
	public String sourceFile = "JavaGrammer.pdf";
	public String destinationFile = "NextJavaGrammer.pdf";

	public CopyFile2() {
		try {
			File inFile = new File(sourceFile);
			long size = inFile.length();
			double fivePC = .05*size;
			int count = 0;

			InputStream in = new FileInputStream(sourceFile);
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
			System.out.println("Copy complete");
		} catch(FileNotFoundException e) {
			System.out.println(e);
		} catch(IOException e) {
			System.out.println(e);
		} catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		new CopyFile2();
	}

}