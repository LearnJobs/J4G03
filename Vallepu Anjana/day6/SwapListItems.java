package day6;

import java.util.ArrayList;
import java.util.List;

public class SwapListItems {
	List<String> newList;
	public static String padRight(String data, int length) {
		StringBuffer buf = new StringBuffer(data);
		for(int i=buf.length(); i<length; i++) buf.append(" ");
		return buf.toString();
	}

	public SwapListItems() {

		newList = new ArrayList<String>();
		newList.add("10");
		newList.add("20");
		newList.add("30");
		newList.add("40");
		newList.add("50");
		newList.add("60");
		newList.add("70");
		newList.add("80"); 
		newList.add("90"); 
		newList.add("100");

		System.out.println("Un-Swapped List :\n");
		System.out.println("+-----+");
		for(String x:newList) {
			System.out.println("| "+padRight(String.valueOf(x),3)+" |");
			System.out.println("+-----+");
		}
		System.out.println("=========================================\n");
		String item1 = newList.get(5); 						
		String item2 = newList.get(0);		
		String item3 = newList.get(6);			
		String item4 = newList.get(1);				// this can be done by using Loop Iteration
		String item5 = newList.get(7);
		String item6 = newList.get(2);
		String item7 = newList.get(8);
		String item8 = newList.get(3);
		String item9 = newList.get(9);
		String item10 = newList.get(4);
		newList.set(0, item1);
		newList.set(5, item2);
		newList.set(1, item3);
		newList.set(6, item4);
		newList.set(2, item5);
		newList.set(7, item6);						// this can be done by using Loop Iteration
		newList.set(3, item7);
		newList.set(8, item8);
		newList.set(4, item9);
		newList.set(9, item10);		

		System.out.println("Swapped List :\n");
		System.out.println("+-----+");
		for(String x:newList) {
			System.out.println("| "+padRight(String.valueOf(x),3)+" |");
			System.out.println("+-----+");
		}
	}

	public static void main(String[] args) {
		new SwapListItems();
	}
} 