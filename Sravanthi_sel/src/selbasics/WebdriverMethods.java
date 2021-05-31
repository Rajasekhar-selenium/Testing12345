package selbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverMethods 
{
	public static void main(String[] args) throws InterruptedException 
	{
        System.setProperty("webdriver.chrome.driver", "D:\\Sekhar_classes\\sravanthi_fst\\dump\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver d = new ChromeDriver();
		
		d.manage().window().maximize();
		
		d.get("https://www.amazon.in/");
		
		Thread.sleep(5000);
		
		d.findElement(By.xpath("(//*[text()='All'])[2]")).click();
		
		Thread.sleep(5000);
		
	//	d.findElement(By.xpath("(//*[@id='hmenu-content']//parent::ul)[1]/li[19]/a[1]")).click();
		
	//	d.findElement(By.xpath("(//*[@id='hmenu-content']//child::ul)[1]/li[2]/a")).click();
		
		d.findElement(By.xpath("//*[@class='hmenu hmenu-visible']/li[4]/a//preceding::li[1]/a")).click();
		
		Thread.sleep(5000);
		
	//	d.findElement(By.xpath("//*[text()=' All Gift Cards']")).click();
		
	//	Thread.sleep(3000);
		
		d.close();
		
		
		
		
		//System.out.println(d.getCurrentUrl());
		
		//System.out.println(d.getTitle());
		
		//System.out.println(d.getPageSource());
		
		
		
		
		
		
		
		
		
		
	}

}
