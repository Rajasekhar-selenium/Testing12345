package testng;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(testng.ListenersConcept.class)

public class ListenerExample 
{
	
	
  @Test
  public void sample() throws InterruptedException 
  {
	  WebDriver d = new ChromeDriver();
		
	    d.manage().window().maximize();
	    
		d.get("https://google.com");
		
		JavascriptExecutor js = ((JavascriptExecutor)d);
		
		js.executeScript("window.alert=('Welcome Google')");
		
		String text = d.switchTo().alert().getText();
		
		System.out.println(text);
		
		Thread.sleep(2000);
		
		//d.switchTo().alert().accept();
		
		d.switchTo().alert().dismiss();
	  
  }
}
