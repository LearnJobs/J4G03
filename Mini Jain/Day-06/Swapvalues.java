package begin6.java;

import java.util.ArrayList;
import java.util.List;

public class Swapvalues {
public static void main(String[] args) {
	List<Integer> values = new ArrayList<Integer>();
	System.out.println("PREVIOUS VALUES:");
	for(int i=10; i<=100; i+=10) {
	values.add(i);
	System.out.println(i);
	}
	int buf;
	for(int i=0; i<9; i++) {
		if(i<=5) {
			buf = values.get(i);
			// System.out.Println(values.get(i)+ " " +values.get9i=4));
			values.set(i, values.get(i+4));
			values.set(i+4, buf);
			}
	
	}
	System.out.println("AFTER VALUES");
	for(int i=0; i<9; i++) {
		System.out.println(values.get(i));
		
	}
}
}
