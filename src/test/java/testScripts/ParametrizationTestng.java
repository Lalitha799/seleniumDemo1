package testScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametrizationTestng {
	
	  
	WebDriver driver;
	@Parameters("browser")

  @Test
  public void googleSearch(String strBrowser) {
	  
	  if(strBrowser.equalsIgnoreCase("chrome"))
		  driver=new ChromeDriver();
	  else if(strBrowser.equalsIgnoreCase("edge"))
		  driver=new EdgeDriver();
  }
}
