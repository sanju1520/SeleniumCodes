package com.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

//import junit.framework.Assert;

public class PriorityDemo {
	//invocationCount=3=for executing method n number of times
	//invocationCount=8,threadPoolSize=2
	@Test(priority=0)
	  public void log() {
		  System.out.println("Log method");
		  System.out.println("Thread Id: "+Thread.currentThread().getId());
		  Assert.assertEquals(false, true);
	  }
	  
	  @Test(priority=1)
	  public void search() {
		  System.out.println("Search method");
		  Assert.assertEquals(false, true);
	  }
	  
	  @Test(priority=2)
	  public void addtocart() {
		  System.out.println("add to cart method");
	  }
	  
	  @Test(priority=3)
	  public void checkout() {
		  System.out.println("checkout method");
	  }
}
//  @Test(groups="sanity")
//  public void log() {
//	  System.out.println("Log method");
//  }
//  
//  @Test(groups="Regression")
//  public void search() {
//	  System.out.println("Search method");
//  }
// 
//  @Test(groups={"sanity","Regression"})
//  public void addtocart() {
//	  System.out.println("add to cart method");
//  }
//  
//  @Test(groups="Regression")
//  public void checkout() {
//	  System.out.println("checkout method");
//  }

