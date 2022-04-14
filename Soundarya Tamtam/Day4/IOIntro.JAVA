import java.io.File;

public class IOIntro {
	public static void main(String[] args) {
		File file = new File("C:\\Users\\Soundarya\\Downloads\\docs\\images");
		System.out.println(file.length());
		System.out.println(file.getName());
		System.out.println(file.getPath());
		System.out.println(file.exists());
		System.out.println();
	}
}
