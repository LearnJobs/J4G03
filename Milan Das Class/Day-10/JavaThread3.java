package j4g03.day10;

public class JavaThread3 implements Runnable {
	public JavaThread3() {
		Thread t = new Thread(this);
		t.start();  // This will wrap the run() method as another Thread
		for(int i=90; i>=65; i--) {
			System.out.println("Loop-1: " + (char)i + "  ");
		}
	}

	public static void main(String[] args) {
		new JavaThread3();
	}

	public void run() {
		for(int i=122; i>=97; i--) {
			System.out.println("Loop-2: " + (char)i + "  ");
		}
	}
}

/*
 * Sample Output:
	Loop-1: Z  
	Loop-1: Y  
	Loop-1: X  
	Loop-1: W  
	Loop-2: z  
	Loop-2: y  
	Loop-2: x  
	Loop-2: w  
	Loop-2: v  
	Loop-2: u  
	Loop-2: t  
	Loop-2: s  
	Loop-2: r  
	Loop-2: q  
	Loop-2: p  
	Loop-2: o  
	Loop-2: n  
	Loop-2: m  
	Loop-1: V  
	Loop-1: U  
	Loop-1: T  
	Loop-1: S  
	Loop-1: R  
	Loop-1: Q  
	Loop-1: P  
	Loop-1: O  
	Loop-1: N  
	Loop-2: l  
	Loop-2: k  
	Loop-2: j  
	Loop-2: i  
	Loop-2: h  
	Loop-2: g  
	Loop-2: f  
	Loop-1: M  
	Loop-1: L  
	Loop-1: K  
	Loop-1: J  
	Loop-1: I  
	Loop-2: e  
	Loop-2: d  
	Loop-2: c  
	Loop-2: b  
	Loop-2: a  
	Loop-1: H  
	Loop-1: G  
	Loop-1: F  
	Loop-1: E  
	Loop-1: D  
	Loop-1: C  
	Loop-1: B  
	Loop-1: A  
*/

