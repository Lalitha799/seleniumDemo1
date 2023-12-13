package testScripts;

import java.util.Base64;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;

import org.apache.commons.collections.map.HashedMap;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v117.network.model.Headers;
import org.openqa.selenium.devtools.v117.network.model.RequestWillBeSent;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.devtools.v117.network.Network;


public class ChromeDevTools {
	
	ChromiumDriver driver;
	DevTools devTools;
	
	@BeforeMethod
	public void setUp()
	{
		driver=new ChromeDriver();
		devTools=driver.getDevTools();
		devTools.createSession();
	}
 // @Test
  public void deviceModeTest() {
	  
	  Map deviceMetrics=new HashedMap() {{
		  put("width",500);
		  put("height",800);
		  put("deviceScaleFactor",50);
		  put("mobile",true);
	  }};
	  driver.executeCdpCommand("Emulation.setDeviceMetricsOverride", deviceMetrics);
	  driver.get("https://www.selenium.dev/");
  }
  
  //@Test
  public void geoLocationTest()
  {
	  Map deviceMetrics=new HashedMap() {{
		  put("latitude",41.331989);
		  put("longitude",-74.356819);
		  put("accuracy",100);
	  }};
	  
	  driver.executeCdpCommand("Emulation.setGeolocationOverride", deviceMetrics);
	  driver.get("https://oldnavy.gap.com/stores");
  }
//@Test  
  public void captureNWTrafficTest()
  {
	  Map deviceMetrics=new HashedMap() {{
		  put("maxTotalBufferSize",1000);
		  put("maxResourceBufferSize",1000);
		  put("maxPostDataSize",1000);
	  }};
	  
	  devTools.send(Network.enable(Optional.empty(),Optional.empty(),Optional.empty()));
	  //driver.executeCdpCommand("Network.enable", deviceMetrics);
	  devTools.addListener(Network.requestWillBeSent(),new Consumer<RequestWillBeSent>() {
		          public void accept(RequestWillBeSent entry)
		          {
		        	  System.out.println("Request URI: "+entry.getRequest().getUrl()+"\n"
		             +"With method: "+entry.getRequest().getMethod()+"\n");
		        	  entry.getRequest().getMethod();
		          }
			});
	  
	  driver.get("https://www.selenium.dev/");
	  devTools.send(Network.disable());
  }
  
  @Test
  public void basicAuthTest()
  {
//	  devTools.send(Network.enable(Optional.empty(),Optional.empty(),Optional.empty()));
//	  Map<String,Object> headers=new HashedMap();
//	  String strUser="admin";
//	  String strPwd="admin";
//	  
//	  String basicAuth="Basic "+new String(new Base64().encode(String.format("%s : %s", 
//			  strUser,strPwd).getBytes()));
//	  System.out.println("Auth ....+ "+basicAuth);
//	  headers.put("Authorization", basicAuth);
//	  devTools.send(Network.setExtraHTTPHeaders(new Headers(headers)));
//	  
//	  driver.get("http://the-internet.herokuapp.com/basic_auth");
//	  String strMsg=driver.findElement(By.cssSelector("div.example p")).getText();
	 // Assert.assertEquals(strMsg, "Congratulations! You must have the proper credentials");
  }
}
