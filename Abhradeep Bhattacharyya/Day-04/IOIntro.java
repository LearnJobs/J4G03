package j4g03.day04;

import java.io.File;

public class IOIntro {
	public static void main(String[] args) {
		File file = new File("C:\\Users\\abhra\\Downloads\\docs\\images");
		System.out.println(file.length());
		System.out.println(file.getName());
		System.out.println(file.getPath());
		System.out.println(file.exists());
		System.out.println();
	}
}

