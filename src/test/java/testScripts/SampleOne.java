package testScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleOne {
  //@Test(groups = "feature1")
	
	@Test
  public void sample11() {
	  
	  long id = Thread.currentThread().getId();
	  System.out.println("sample11 thread"+id);
  }
  
  //@Test(groups = "feature2")
	@Test
public void sample12() {
	  
	  long id = Thread.currentThread().getId();
	  System.out.println("sample12 thread"+id);
  }

  //@Test(groups = "feature3")
	@Test
public void sample13() {
	  
	  long id = Thread.currentThread().getId();
	  System.out.println("sample13 thread"+id);
}
  
 // @Test(groups = "feature4")
	@Test(invocationCount = 5, threadPoolSize = 3,timeOut = 10000)
public void sample14() {
	  WebDriver driver=new ChromeDriver();
	  long id = Thread.currentThread().getId();
	  System.out.println("sample14 thread"+id);
}
}
