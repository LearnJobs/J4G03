package begin3;


import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/*
 * Reason:
 * 		To view the content of a class
 * 
 * For this you have to take help of a class named Class
 * 
 */

public class Reflection {
	public Reflection() throws ClassNotFoundException {
		//Class o = Class.forName("j4g02.day02.MultiplicationTables");
		Class<?> o = Class.forName("java.lang.Class");
		Field f[] = o.getDeclaredFields();
		Constructor<?> c[] = o.getDeclaredConstructors(); 
		Method m[] = o.getDeclaredMethods();

		if(f.length>0) {
			System.out.println("FIELDS: ");
			for(int i=0; i<f.length; i++) {
				System.out.println((i+1)+": "+f[i]);
			}
		}

		if(c.length>0) {
			System.out.println("CONSTRUCTORS: ");
			for(int i=0; i<c.length; i++) {
				System.out.println((i+1)+": "+c[i]);
			}
		}

		if(m.length>0) {
			System.out.println("METHODS: ");
			for(int i=0; i<m.length; i++) {
				System.out.println((i+1)+": "+m[i]);
			}
		}
	}

	public static void main(String[] args) throws ClassNotFoundException {
		new Reflection();
	}

}
