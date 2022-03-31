package com.razz1.Day3;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		Date today=new Date();
		System.out.println(today);
  SimpleDateFormat dateFormat =new SimpleDateFormat("E,dd-mm-yyyy (HH:MM) a");
  System.out.println(dateFormat.format(today));
  
  LocalDate lDate= LocalDate.now();
  lDate=lDate.plusDays(2);
  System.out.println(lDate);
	}

}
