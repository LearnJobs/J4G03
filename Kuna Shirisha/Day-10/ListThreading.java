
package DAY10;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

public class ListThreading {
	
	     public List<String> country = new ArrayList<String>();
	     public List<String> flowers = new ArrayList<String>();
		
		public ListThreading() {
			fillCountries();
			fillFlowers();
			ExecutorImp eimp1 = new ExecutorImp();
			try {
					eimp1.execute(new CountryThread(country));
					eimp1.execute(new FlowerThread(flowers));
		         }
			  catch(RejectedExecutionException e) {
				}
			  catch(NullPointerException e) { 
                }
		   }
			public static void main(String[] args) {
				// TODO Auto-generated method stub
		       new ListThreading();
			}
		
			
		 public void fillCountries() {
		
					country = new ArrayList<String>();
					country.add("Afghanistan");
					country.add("Australia");
					country.add("Austria");
					country.add("Bangladesh");
					country.add("Belgium");
					country.add("Belarus");
					country.add("Brazil");
					country.add("Cambodia");
					country.add("Canada");
					country.add("China");
					country.add("Cuba");
					country.add("Denmark");
					country.add("Egypt");
					country.add("Estonia");
					country.add("Ethiopia");
					country.add("Georgia");
					country.add("Germany");
					country.add("Greece");
					country.add("Hong Kong");
					country.add("India");
					country.add("Iceland");
					country.add("Indonesia");
					country.add("Italy");
					country.add("Kazakhstan");
					country.add("Kuwait");
					
				}	
			
				public void fillFlowers() {
					
					flowers = new ArrayList<String>();
					flowers.add("Daisy");
					flowers.add("Rose");
					flowers.add("Iris");
					flowers.add("Narcissus");
					flowers.add("Sunflower");
					flowers.add("Cyclamen");
					flowers.add("Hibiscus");
					flowers.add("Jasmine");
					flowers.add("Lavender");
					flowers.add("Honeysuckle");
					flowers.add("Lotus");
					flowers.add("Morning-glory");
					flowers.add("Mimosa");
					flowers.add("Daffodil");
					flowers.add("Lilly");
					flowers.add("Bluebell");
					flowers.add("Camellia");
					flowers.add("Buttercap");
					flowers.add("Lilac");
					flowers.add("Snowdrop");
					flowers.add("Snapdragon");
					flowers.add("primrose");
					flowers.add("Foxglove");
					flowers.add("Geranium");
					flowers.add("Cactus flower");
					
			}
				class ExecutorImp implements Executor{
					    @Override
				 public void execute(Runnable command) {
				     Thread t = new Thread(command);
							   t.start();
						}
				}
				class CountryThread implements Runnable{
					 List<String> country;
					 
			     public CountryThread(List<String>country) {
						 this.country = country;
			      }
		           @Override
					public void run() {
						// TODO Auto-generated method stub
		        	   for(String X :country) {
		        		    System.out.println("Country Thread--"+X+" ");
		        		   }
		        	   System.out.println();
		        	   }
				   }
				  class FlowerThread implements Runnable{
						 List<String> flowers;
						 
						 public FlowerThread(List<String>flowers) {
							 this.flowers =  flowers;
						 }
			           @Override
						public void run() {
							// TODO Auto-generated method stub
			        	   for(String X :flowers) {
			        		    System.out.println("Flowers Thread--"+X+" ");
			        		   }
			        	   System.out.println();
			        	   }
				       }


           }
					   
					
				

			