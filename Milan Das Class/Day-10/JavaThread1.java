package j4g03.day10;

public class JavaThread1 extends Thread {
	public JavaThread1() {
		this.start();
		for(int i=65; i<=90; i++) {
			System.out.print((char)i + "  ");
		}
	}
	
	public static void main(String[] args) {
		new JavaThread1();
	}

	public void run() {
		for(int i=97; i<=122; i++) {
			System.out.print((char)i + "  ");
		}
	}
}

// Sample Output:
// A  B  C  D  a  b  c  d  e  E  F  G  H  I  f  g  h  i  J  K  L  M  N  O  P  Q  j  k  l  m  n  o  R  S  T  U  V  W  X  Y  Z  p  q  r  s  t  u  v  w  x  y  z
