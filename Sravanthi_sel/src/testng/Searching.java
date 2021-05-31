package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Searching 
{
	@Test
	public void one()
	{
		WebDriver d = new ChromeDriver();
		
		d.get("http://google.com");
		
		d.findElement(By.name("q")).sendKeys("Facebook", Keys.ENTER);
	
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		d.close();
	}

	
	@Test
	public void two()
	{
		WebDriver d = new ChromeDriver();
		
		d.get("http://google.com");
		
		d.findElement(By.name("q")).sendKeys("selenium", Keys.ENTER);
	
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		d.close();
	}
}
