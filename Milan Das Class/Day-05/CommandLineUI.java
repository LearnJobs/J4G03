package j4g03.day05;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * Take the following info from the keyboard
 * and write in a CSV file.
 * CSV stands for Comma Separated Values
 */

public class CommandLineUI {
	String name;
	String father;
	String gender;
	String qualification;
	String country;

	BufferedReader br;
	BufferedWriter bw;

	public CommandLineUI() {
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("personl-data.csv")));
			String more = "y";
			StringBuffer buf;

			while(more.equalsIgnoreCase("y")) {
				buf = new StringBuffer();

				System.out.print(padLeft("Your Name: ",25));
				String name = br.readLine();
				buf.append(name+", ");
	
				System.out.print(padLeft("Father's Name: ",25));
				String father = br.readLine();
				buf.append(father+", ");
	
				System.out.print(padLeft("Gender: ",25));
				String gender = br.readLine();
				buf.append(gender+", ");
	
				System.out.print(padLeft("Qualification: ",25));
				String qualif = br.readLine();
				buf.append(qualif+", ");


				System.out.print(padLeft("Country: ",25));
				String country = br.readLine();
				buf.append(country);

				bw.write(buf.toString()+"\r\n");

				System.out.println();
				System.out.print("More [y/n]: ");
				more = br.readLine();
			}
		} catch(IOException e) {
		} catch(Exception e) {
		} finally {
			try {
				bw.close();
				br.close();
			} catch(IOException f) {
			}
		}
	}
	
	public String padLeft(String text, int length) {
		StringBuffer buf = new StringBuffer(text);
		for(int i=buf.length(); i<length; i++) buf.append(" ");
		return buf.toString();
	}

	public static void main(String[] args) {
		new CommandLineUI();
	}

}
