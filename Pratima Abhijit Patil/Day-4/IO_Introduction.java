import java.io.File;
public class IO_Introduction {

	public static void main(String[] args) {
		File file=new File("C:\\Users\\91888\\eclipse-workspace\\myproject\\src\\myproject\\Reverse_string.java");
		System.out.println(file.length());
		System.out.println(file.getName());
		System.out.println(file.getPath());
		System.out.println(file.exists());
		System.out.println();
		

	}

}