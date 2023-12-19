package testScripts;

import org.testng.annotations.Test;

public class SampleThree {
	
	@Test(groups = "feature1")
	 public void sample31() {
	 	  
	 	  long id = Thread.currentThread().getId();
	 	  System.out.println("sample31 thread"+id);
	   }
	
	
	 @Test(groups = "feature2")
	 public void sample32() {
	 	  
	 	  long id = Thread.currentThread().getId();
	 	  System.out.println("sample32 thread"+id);
	   }

	   @Test(groups = "feature3")
	 public void sample33() {
	 	  
	 	  long id = Thread.currentThread().getId();
	 	  System.out.println("sample33 thread"+id);
	 }
	   
	   @Test(groups = "feature4")
	 public void sample34() {
	 	  
	 	  long id = Thread.currentThread().getId();
	 	  System.out.println("sample34 thread"+id);
	 }
}
