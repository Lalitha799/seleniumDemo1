package testScripts;

import org.testng.annotations.Test;

public class SampleTwo {
  @Test(groups = "feature1")
 public void sample21() {
	  
	  long id = Thread.currentThread().getId();
	  System.out.println("sample21 thread"+id);
  }
  
  @Test(groups = "feature2")
public void sample22() {
	  
	  long id = Thread.currentThread().getId();
	  System.out.println("sample22 thread"+id);
  }
  
  @Test(groups = "feature3")

public void sample23() {
	  
	  long id = Thread.currentThread().getId();
	  System.out.println("sample23 thread"+id);
}

@Test(groups = "feature4")
public void sample24() {
	  
	  long id = Thread.currentThread().getId();
	  System.out.println("sample24 thread"+id);
}
}
