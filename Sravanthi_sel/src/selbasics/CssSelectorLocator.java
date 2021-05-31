package selbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorLocator 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Sekhar_classes\\sravanthi_fst\\dump\\chromedriver_win32\\chromedriver.exe");
		
		   WebDriver d = new ChromeDriver();
		
	 	   d.get("https://www.facebook.com/");
	 	  /* 
	 	   d.findElement(By.cssSelector("input#email")).sendKeys("123456");
	 	   
	 	  d.findElement(By.cssSelector("input[class='inputtext _55r1 _6luy _9npi']")).sendKeys("123456");
	 	  
	 	 d.findElement(By.cssSelector(" button[name='login'][type='submit']")).click();*/
	 	   
	 	  d.findElement(By.cssSelector("input[id^='ema']")).sendKeys("123456");
	 	   
	 	  d.findElement(By.cssSelector("input[name$='ss']")).sendKeys("123456");
	 	  
	 	 d.findElement(By.cssSelector("button[type*='bmi']")).click();
	 	   
	 	 
	 	 
	 	 
	 	
	 	
	}

}
