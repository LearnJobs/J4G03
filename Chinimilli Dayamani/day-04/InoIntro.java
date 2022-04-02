package day04;

import java.io.File;

public class InoIntro {
	public static void main(String[] args) {
		File file = new File("https://github.com/LearnJobs/J4G03/tree/main/Chinimilli%20Dayamani");
		System.out.println(file.length());
		System.out.println(file.getName());
		System.out.println(file.getPath());
		System.out.println(file.exists());
		System.out.println();
	
	}

}
