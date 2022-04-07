package j4g03.day06;



/*
 * ASSIGNMENT-06:
    1   Write a program to assign 10 items to an ArrayList. Swap values from the 1 with 6, 2 with 7, 3 with 8,
        4 with 9 and 5 with 10.

        Before          After
        10              60
        20              70
        30              80
        40              90
        50             100
        60              10
        70              20
        80              30
        90              40
       100              50
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SwapValues {
	List<String> numberList;
	
	public SwapValues(){
		
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
		
		
		System.out.println("\r\t		 BEFORE VALUES: ");
		for(String x: numberList) {
			System.out.println(padLeft(x,40)); //right shifting this output line
		}
		
		System.out.println("\r\t 	  AFTER SWAP THIS VALUES:");
		
		for(int i=0;i<5;i++) {		
			Collections.swap(numberList, i, i+5);		
		}
		for(String x: numberList) {
			System.out.println(padLeft(x,40)); //Right shifting output line
		}
	}
	public String padLeft(String data, int length) //padLeft command
	{
		StringBuffer buf = new StringBuffer(data);
		for(int i=buf.length(); i<length; i++) {
			buf.insert(0," ");    
		}
		return buf.toString();
	}												//to this
	
	public static void main(String[] args) {		
		new SwapValues();
	}

}