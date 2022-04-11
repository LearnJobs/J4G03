package day10;

public class Thread4 {
	
	      public static void main(String[] args) {
		    Runnable r = new Runnable1();
		    Thread t1 = new Thread(r);
		    Runnable r2 = new Runnable2();
		    Thread t2 = new Thread(r2);
		    t1.start();
		    t2.start();
		  }
		}

		class Runnable2 implements Runnable{
		  public void run(){
		    for(char i='A';i<='Z';i++) {
		        System.out.print(i+",");
		    }
		  }
		}

		 class Runnable1 implements Runnable{
		  public void run(){
		    for(int i=1;i<=25;i++) {
		       System.out.print(i+",");
		    }
		 }
		}
		 
}
