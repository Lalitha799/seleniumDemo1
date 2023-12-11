package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngDemo2 {
 
 
	  

		WebDriver driver;
		//@BeforeMethod
		@BeforeTest
		public void before()
		{
			    driver=new ChromeDriver();
				driver.manage().window().maximize();
		}
	  @Test
	  public void cucumberSearch() {
		  
		   
		  driver.get("https://www.google.com/");
			WebElement element = driver.findElement(By.className("gLFyf"));
			Actions ac=new Actions(driver);
			ac.moveToElement(element).sendKeys("cucumber").sendKeys(Keys.ENTER).build().perform();
	  }
	  
	  @Test
	  public void mavenSearch() {
		  
		   
		  driver.get("https://www.google.com/");
			WebElement element = driver.findElement(By.className("gLFyf"));
			Actions ac=new Actions(driver);
			ac.moveToElement(element).sendKeys("Maven").sendKeys(Keys.ENTER).build().perform();
	  }
	  
	  @AfterTest
	  public void after()
	  {
		  driver.close();
	  }
  }

