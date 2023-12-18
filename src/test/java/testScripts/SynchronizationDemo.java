package testScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class SynchronizationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HTML tooltip
//		final String name="Mail";
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://demo.guru99.com/test/social-icon.html");
//		WebElement tooltip = driver.findElement(By.xpath("//a[@class='fa fa-lg fa-envelope']"));
//		String toolText = tooltip.getAttribute("title");
//		Assert.assertEquals(toolText, name);
//		System.out.println(toolText);
		
		
      // Jquery tooltip
		
		//javascriptExecutor
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement element=(WebElement)js.executeScript("return document.getElementsByClassName('gLFyf')[0]");
	    element.sendKeys("javatutorial");
	    element.submit();
	    js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
	}

}
