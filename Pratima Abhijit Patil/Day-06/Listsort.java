import java.util.ArrayList;
	import java.util.Collections;
public class Listsort {
		public static void main(String[] args) {
			ArrayList<Movie> list = new ArrayList<Movie>();
			list.add(new Movie(9.0, "Captain America", 2009));
			list.add(new Movie(7.3, "Star War", 2014));
			list.add(new Movie(8.2, "Empire Strikes Back", 1996));
			list.add(new Movie(9.0, "Universal Soldier", 2021));
			list.add(new Movie(10.0, "Jeena Nahi Dunga", 2011));

			System.out.println("BEFORE SORTING:");
			for(Movie m : list) {
				System.out.println(m.getRating()+"   "+m.getName()+"    "+m.getYear());
			}

			Collections.sort(list);

			System.out.println();
			System.out.println("AFTER SORTING:");
			for(Movie m : list) {
				System.out.println(padLeft(String.valueOf(m.getRating()),5)+"   "+padRight(m.getName(),25)+"    "+m.getYear());
			}
		}

		public static String padRight(String data, int length) {
			StringBuffer buf = new StringBuffer(data);
			for(int i=buf.length(); i<length; i++) buf.append(" ");
			return buf.toString();
		}

		public static String padLeft(String data, int length) {
			StringBuffer buf = new StringBuffer(data);
			for(int i=buf.length(); i<length; i++) buf.insert(0," ");
			return buf.toString();
		}
	}
