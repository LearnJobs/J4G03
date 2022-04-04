package day_06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Swap_values {
	
	 List<String> numberList;
	         
	 public Swap_values() {
	        	 
	 numberList = new ArrayList<String>();
 
        
        numberList.add("10");
        numberList.add("20");
        numberList.add("30");
        numberList.add("40");
        numberList.add("50");
        numberList.add("60");
        numberList.add("70");
        numberList.add("80");
        numberList.add("90");
        numberList.add("100");
      
        System.out.println("\r\n Before Swap the ArrayList ");
        
        
        for(String x: numberList) {
        	   System.out.println(x); 	   
        }
        System.out.print("  ");
        
        System.out.println("\r\n After Swap the ArrayList");
        
        for(int i=0;i<5;i++) {
        	
			Collections.swap(numberList, i, i+5);		
		}
		for(String x: numberList) {
			System.out.println(x);
		}
	}

	public static void main(String[] args) {		
		new Swap_values();
	}


        
 
 }

	


