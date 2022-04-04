package j4g03.day06;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListObjects {
	List<String> nameList;
	String[] countries = {"India","Srilanka","Bangladesh","Pakistan","Nepal","Bhutan","China","Indonesia","Denmark"};

	public ListObjects() {
		countries[3] = "Holland";
		System.out.println("Array:");
		for(String x:countries) {
			System.out.println(x);
		}

		nameList = new ArrayList<String>();
		nameList.add("Elephant");
		nameList.add("Tiger");
		nameList.add("Bull");
		nameList.add("Deer");
		nameList.add("Snake");
		nameList.add("Owl");
		nameList.add("Parrot");
		nameList.set(3, "Crocodile");    // Deer was replaced with Crocodile
		nameList.add(3,"Dog");           // Dog is inserted in the 3rd position and all 
		                                 // other subsequent data is shifted to the next index
		nameList.add(3,"Cat");
		nameList.remove(2);

		System.out.println("\r\nList1:");
		for(String x:nameList) {
			System.out.println(x);
		}
System.out.println("------------------------");
		String animal1 = nameList.get(2);
		String animal2 = nameList.get(5);
		nameList.set(2, animal2);
		nameList.set(5, animal1);
		System.out.println("\r\nList2:");
		for(String x:nameList) {
			System.out.println(x);
		}

		System.out.println("\r\nIterator:");
		Iterator<String> nameList2 = nameList.iterator();
		while(nameList2.hasNext()) {
			System.out.println(nameList2.next());
		}

		System.out.println("------------------------");
		// Declaration of an array
		String[][] students = { {"Narendra Modi","PM"},
								{"Narasima Rao","PM"},
								{"Naveen Patnaik","CM"},
								{"Milan Das","Faculty"}
							  };

		// Conversion of array to List
		List<List<String>> deligateList = new ArrayList<List<String>>();
		List<String> oneList;
		String[] oneDeligate;
		for(int i=0; i<students.length; i++) {
			oneList = new ArrayList<String>();
			oneDeligate = students[i];
			for(String x : oneDeligate) {
				oneList.add(x);
			}
			deligateList.add(oneList);
		}

		// Printing the List
		for(List<String> l : deligateList) {
			for(String x : l) {
				System.out.print(x+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new ListObjects();
	}

}
