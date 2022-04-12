
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Assignment6 {
	List<String> numberList;
	
	public Assignment6(){
		
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
		
		
		System.out.println("\r\tBEFORE:");
		for(String x: numberList) {
			System.out.println(padLeft(x,40)); 
		}
		
		System.out.println("\r\tAFTER:");
		
		for(int i=0;i<5;i++) {		
			Collections.swap(numberList, i, i+5);		
		}
		for(String x: numberList) {
			System.out.println(padLeft(x,40)); 
		}
	}
	public String padLeft(String data, int length) 
	{
		StringBuffer buf = new StringBuffer(data);
		for(int i=buf.length(); i<length; i++) {
			buf.insert(0," ");    
		}
		return buf.toString();
	}										
	public static void main(String[] args) {		
		new Assignment6();
	}

}