package begin10;

//Implementing runnable interface by extending Thread class  
public class ThreadExample1 extends Thread {  
     // run() method to perform action for thread.   
     public void run()  
     {    
        int a= 10;  
        int b=12;  
        int result = a+b;  
        System.out.println("Thread started running..");  
        System.out.println("Sum of two numbers is: "+ result);  
     }  
     public static void main( String args[] )  
     {  
      // Creating instance of the class extend Thread class  
        ThreadExample1 t1 = new  ThreadExample1();  
        //calling start method to execute the run() method of the Thread class  
        t1.start();  
     }  
}  