package begin10;



import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

public class ListThread {
	
	
		List<String> numberList;
		
		public ListThread(){
			ExecutorImp eimp1 = new ExecutorImp();
			try {
					eimp1.execute(new NewThread1());
					eimp1.execute(new NewThread2());
		         }
			  catch(RejectedExecutionException e) {
				}
			  catch(NullPointerException e) { 
                }
		}
			public static void main(String[] args) {
				// TODO Auto-generated method stub
		       new ListThread();
			}
		
			
		 class ExecutorImp implements Executor{
			    
				@Override
				public void execute(Runnable command) {
		
					 Thread t = new Thread(command);
					   t.start();
				}
				
			}
		 class NewThread1 implements Runnable{

				@Override
				public void run() {
		
					System.out.println("class-1");
					numberList = new ArrayList<String>();
					numberList.add("Afghanistan");
					numberList.add("Australia");
					numberList.add("Austria");
					numberList.add("Bangladesh");
					numberList.add("Belgium");
					numberList.add("Belarus");
					numberList.add("Brazil");
					numberList.add("Cambodia");
					numberList.add("Canada");
					numberList.add("China");
					numberList.add("Cuba");
					numberList.add("Denmark");
					numberList.add("Egypt");
					numberList.add("Estonia");
					numberList.add("Ethiopia");
					numberList.add("Georgia");
					numberList.add("Germany");
					numberList.add("Greece");
					numberList.add("Hong Kong");
					numberList.add("India");
					numberList.add("Iceland");
					numberList.add("Indonesia");
					numberList.add("Italy");
					numberList.add("Kazakhstan");
					numberList.add("Kuwait");
					
			System.out.println("\r\n ARRAY LIST");
			  System.out.println();
					for(String x: numberList) {
						 System.out.println(x);
					   }
					System.out.println();
				             }
				}
			class NewThread2 implements Runnable{

				@Override
				public void run() {
					// TODO Auto-generated method stub
					System.out.println("class-2");
					numberList = new ArrayList<String>();
					numberList.add("Daisy");
					numberList.add("Rose");
					numberList.add("Iris");
					numberList.add("Narcissus");
					numberList.add("Sunflower");
					numberList.add("Cyclamen");
					numberList.add("Hibiscus");
					numberList.add("Jasmine");
					numberList.add("Lavender");
					numberList.add("Honeysuckle");
					numberList.add("Lotus");
					numberList.add("Morning-glory");
					numberList.add("Mimosa");
					numberList.add("Daffodil");
					numberList.add("Lilly");
					numberList.add("Bluebell");
					numberList.add("Camellia");
					numberList.add("Buttercap");
					numberList.add("Lilac");
					numberList.add("Snowdrop");
					numberList.add("Snapdragon");
					numberList.add("primrose");
					numberList.add("Foxglove");
					numberList.add("Geranium");
					numberList.add("Cactus flower");
					
					System.out.println("\r\n ARRAY LIST");
					  System.out.println();
							for(String x: numberList) {
								 System.out.println(x);
							   }
							System.out.println();
				
		}
				}	
		}