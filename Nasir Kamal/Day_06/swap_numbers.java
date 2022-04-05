package Day_06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class swap_numbers {
	
	 List<String> numberList;

	 public swap_numbers() {

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

        System.out.println("Before Swap the ArrayList ");


        for(String x: numberList) {
        	   System.out.println(x); 	   
        }
        System.out.print("  ");

        System.out.println(" After Swap the ArrayList");

        for(int i=0;i<5;i++) {

			Collections.swap(numberList, i, i+5);		
		}
		for(String x: numberList) {
			System.out.println(x);
		}
	}

	public static void main(String[] args) {		
		swap_numbers swap_numbers = new swap_numbers();
	}




 }

	
	
	
	
	
	
	
	


