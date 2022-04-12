public class Javathread3 implements Runnable{
public Javathread3() {
	Thread t =new Thread(this);
	t.start();
	for(int i=90;i>=65;i--) {
		System.out.print("loop-1:" + (char)i+" ");
	}
}
	public static void main(String[] args) {
		new Javathread3();
	}
	public void run() {
		for(int i=122;i>=97;i--) {
			System.out.print("loop-2:"+ (char)i+" ");
		}
	}

}
