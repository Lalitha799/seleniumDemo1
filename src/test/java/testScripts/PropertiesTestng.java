package testScripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PropertiesTestng {
	WebDriver driver;
	Properties prop;
	@BeforeMethod
	public void setUp() throws IOException
	{
		String path=System.getProperty("user.dir")+"//src//test//resources//configFiles//config.properties";
		FileInputStream fin=new FileInputStream(path);
		prop=new Properties();
		prop.load(fin);
		String strBrowser=prop.getProperty("browser");
		if(strBrowser.equalsIgnoreCase("chrome"))
			driver=new ChromeDriver();
		else if(strBrowser.equalsIgnoreCase("edge"))
			driver=new EdgeDriver();
		
		
		driver.manage().window().maximize();
	}
  @Test
  public void LoginPage() {
	  
	 driver.get(prop.getProperty("url"));
	 driver.findElement(By.xpath("//input[@id='username']")).sendKeys("tomsmith");
	 driver.findElement(By.xpath("//input[@id='password']")).sendKeys("SuperSecretPassword!");
	 driver.findElement(By.cssSelector("button.radius")).click();
	 boolean isDisp=driver.findElement(By.cssSelector("div#flash")).isDisplayed();
	 Assert.assertTrue(isDisp);
  }
  
  @AfterMethod
  public void tearDown()
  {
	  driver.close();
  }
}
