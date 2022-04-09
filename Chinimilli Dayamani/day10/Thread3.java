package day10;

public class Thread3 extends Thread {
    public Thread3() {
  	  Thread t = new Thread(this);
  	  t.start();
  	  for(int i=90; i>=65; i--) {
  		  System.out.println("Loop-1: "+ (char)i +" ");
  	  }
    }
    
	public static void main(String[] args) {
		new Thread3();
}

public void run() {
	  for(int i=122; i>=97; i--) {
		  System.out.println("Loop-2: "+ (char)i +" ");
	  }
}


}
