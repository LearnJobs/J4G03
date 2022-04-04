package day05;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Copyfile {
	public String sourceFile = "daya.txt";
	public String destinationFile = "Copytextfile.txt";

	public Copyfile() {
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
		new Copyfile();
	}


}
