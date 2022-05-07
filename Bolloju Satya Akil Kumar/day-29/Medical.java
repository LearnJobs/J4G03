package com.pharma.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Medical {

	public static void main(String[] args) {
		
		//SunPharma sp = new SunPharma();
	      // sp.product();
      	   //sp.salesperson();
      	   
	   //ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    	//SunPharma sp = (SunPharma)context.getBean("sp");
    	// sp.product();
    	  // sp.salesperson();

		//Cipla ca = new Cipla();
	     //ca.product();
    	 //ca.salesperson();
    	   
	     //ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
  	     //Cipla ca = (Cipla)context.getBean("ca");
  	       //ca.product();
  	        //ca.salesperson();
		
		//Mankind ma = new Mankind();
	    // ma.product();
   	   //ma.salesperson();
   	   
	     //ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	     //Mankind ma = (Mankind)context.getBean("ma");
 	       //ma.product();
 	        //ma.salesperson();
		
		
		//DrReddy dr = new DrReddy();
	    // dr.product();
   	   //dr.salesperson();
   	   
	     //ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	     //DrReddy  dr = (DrReddy)context.getBean("dr");
 	       //dr.product();
 	        //dr.salesperson();
		
		

		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		PharmaCompany pc = (PharmaCompany)context.getBean("pc",PharmaCompany.class);
		PharmaCompany cs = (PharmaCompany)context.getBean("cs",PharmaCompany.class);
		PharmaCompany ab = (PharmaCompany)context.getBean("ab",PharmaCompany.class);
		PharmaCompany cd = (PharmaCompany)context.getBean("cd",PharmaCompany.class);
		
		pc.product();
		pc.salesperson();
    	cs.product();
	    cs.salesperson();
    	ab.product();
	    ab.salesperson();
	   cd.product();
	   cd.salesperson();

	}

}



