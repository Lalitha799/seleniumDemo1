package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class TestngDemo {
	
	WebDriver driver;
	@BeforeMethod
	public void before()
	{
		    driver=new ChromeDriver();
			driver.manage().window().maximize();
	}
  @Test(priority = 2)
  public void seleniumSearch() {
	  
	   
		driver.get("https://www.google.com/");
		WebElement element = driver.findElement(By.className("gLFyf"));
		Actions ac=new Actions(driver);
		ac.moveToElement(element).sendKeys("selenium").sendKeys(Keys.ENTER).build().perform();
	    Assert.assertEquals(driver.getTitle(), "seleniu - Google Search");
  }
  
  @Test(alwaysRun = true, dependsOnMethods = "seleniumSearch")
  public void javaSearch() {
	  
	   
		driver.get("https://www.google.com/");
		WebElement element = driver.findElement(By.className("gLFyf"));
		Actions ac=new Actions(driver);
		ac.moveToElement(element).sendKeys("java").sendKeys(Keys.ENTER).build().perform();
	   // Assert.assertEquals(driver.getTitle(), "selenium - Google Search");
  }
  
  @Test(enabled = false)
  public void testngSearch() {
	  
	   
		driver.get("https://www.google.com/");
		WebElement element = driver.findElement(By.className("gLFyf"));
		Actions ac=new Actions(driver);
		ac.moveToElement(element).sendKeys("TestNg").sendKeys(Keys.ENTER).build().perform();
	   // Assert.assertEquals(driver.getTitle(), "selenium - Google Search");
  }
  
  @AfterMethod
  public void after()
  {
	  driver.close();
  }
}
