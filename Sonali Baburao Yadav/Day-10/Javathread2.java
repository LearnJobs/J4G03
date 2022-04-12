public class Javathread2 extends Thread{
public  Javathread2 (){
	this.start();
	for(int i=65;i<=90;i++) {
		System.out.print("loop-1:" +(char)i+" ");
	}
}
	public static void main(String[] args) {
		new Javathread2();
	}
	public void run() {
		for(int i=97;i<=122;i++) {
			System.out.print("loop-2:"+ (char)i+" ");
		}
	}

}
