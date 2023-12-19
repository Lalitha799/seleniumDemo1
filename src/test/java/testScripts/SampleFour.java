package testScripts;

import org.testng.annotations.Test;

public class SampleFour {
  
	//@Test(groups = "feature1")
	@Test
	 public void sample41() {
	 	  
	 	  long id = Thread.currentThread().getId();
	 	  System.out.println("sample41 thread"+id);
	   }
	
	
  //@Test(groups = "feature2")
	@Test
  public void sample42() {
  	  
  	  long id = Thread.currentThread().getId();
  	  System.out.println("sample42 thread"+id);
    }

    //@Test(groups = "feature3")
	@Test
  public void sample43() {
  	  
  	  long id = Thread.currentThread().getId();
  	  System.out.println("sample43 thread"+id);
  }
    
    //@Test(groups = "feature4")
    @Test
  public void sample44() {
  	  
  	  long id = Thread.currentThread().getId();
  	  System.out.println("sample44 thread"+id);
  }
}
