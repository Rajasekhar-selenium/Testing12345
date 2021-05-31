package selbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators3 
{
	public static void main(String[] args) 
	{
		
		try {
	   System.setProperty("webdriver.chrome.driver", "D:\\Sekhar_classes\\sravanthi_fst\\dump\\chromedriver_win32\\chromedriver.exe");
	
	   WebDriver d = new ChromeDriver();
	
 	   d.get("https://www.amazon.in/");
 	   
 	   d.findElement(By.xpath("//*[text()='Mobiles']/following-sibling::a")).click();
 	   
 	   Thread.sleep(2000);
 	   
 	   d.navigate().back();
 	   
 	   Thread.sleep(2000);
 	   
 	  d.findElement(By.xpath("//*[text()='Mobiles']/preceding-sibling::a")).click();
 	  
 	  Thread.sleep(2000);
 	  
 	  d.close();
 	  
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 	   
 	
 	
 	
	}

}
