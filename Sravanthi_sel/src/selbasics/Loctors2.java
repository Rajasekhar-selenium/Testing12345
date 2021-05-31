package selbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loctors2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Sekhar_classes\\sravanthi_fst\\dump\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver d = new ChromeDriver();
		
	 	d.get("https://www.facebook.com/");
	 	
	 	
	 	
	 	d.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).sendKeys("123456");
	 	
	 	d.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
	 	
	 	Thread.sleep(3000);
	 	
	 	d.findElement(By.xpath("//button[@type='submit']")).click();
	 	
	 	Thread.sleep(10000);
	 	
	 	
	 	//d.close();
	 	
	 	
	 	
	 	
	}

}
