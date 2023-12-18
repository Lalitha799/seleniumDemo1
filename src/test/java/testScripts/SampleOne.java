package testScripts;

import org.testng.annotations.Test;

public class SampleOne {
  @Test(groups = "feature1")
  public void sample11() {
	  
	  long id = Thread.currentThread().getId();
	  System.out.println("sample11 thread"+id);
  }
  
  @Test(groups = "feature2")
public void sample12() {
	  
	  long id = Thread.currentThread().getId();
	  System.out.println("sample12 thread"+id);
  }

  @Test(groups = "feature2")
public void sample13() {
	  
	  long id = Thread.currentThread().getId();
	  System.out.println("sample13 thread"+id);
}
  
  @Test
public void sample14() {
	  
	  long id = Thread.currentThread().getId();
	  System.out.println("sample14 thread"+id);
}
}
