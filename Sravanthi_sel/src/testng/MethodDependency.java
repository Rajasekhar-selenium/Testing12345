package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MethodDependency {
  @Test
  public void test1() throws InterruptedException 
  {
	  WebDriver d = new ChromeDriver();
		
		d.get("http://google.com");
		
		d.findElement(By.name("q")).sendKeys("Facebook", Keys.ENTER);
		
		Thread.sleep(3000);
		
		d.close();
  }
  
  @Test(dependsOnMethods="test1")
  public void test2() throws InterruptedException 
  {
	  WebDriver d = new ChromeDriver();
		
		d.get("http://google.com");
		
		d.findElement(By.name("q")).sendKeys("selenium", Keys.ENTER);
		
		Thread.sleep(3000);
		
		d.close();
  }
}
