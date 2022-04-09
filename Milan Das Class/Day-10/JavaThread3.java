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
