    import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.io.InputStream;
	import java.io.OutputStream;

public class Copyfile {

	public class CopyFile {
		public String sourceFile = "textfile2.txt";
		public String destinationFile = "Copytextfiles.txt";

		public CopyFile() {
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
	public static void main(String[] args) {

	}

}
