package day06;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort {
	List<String> arrayList;
	
	public Sort(){
		
		arrayList = new ArrayList<String>();
		arrayList.add("10");//0
		arrayList.add("20");//1
		arrayList.add("30");//2
		arrayList.add("40");//3
		arrayList.add("50");//4
		arrayList.add("60");//5
		arrayList.add("70");//6
		arrayList.add("80");//7
		arrayList.add("90");//8
		arrayList.add("100");//9
		
		System.out.println("\r\n Original List");
		for(String x: arrayList) {
			System.out.println(x);
		}
		System.out.println("________________________________________________________________________");
		
		System.out.println("\r\n Swapped List");
		
		for(int i=0;i<5;i++) {		
			Collections.swap(arrayList, i, i+5);			
		}
		for(String x: arrayList) {
			System.out.println(x);
		}
	}

	public static void main(String[] args) {		
		new Sort();
	}

}