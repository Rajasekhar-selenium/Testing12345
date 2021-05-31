package selbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Sekhar_classes\\sravanthi_fst\\dump\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver d = new ChromeDriver();
		
	 	d.get("https://www.google.com/");
		
	 /*	d.findElement(By.name("q")).sendKeys("selenium");
	 	
	 	Thread.sleep(3000);
	 	
	 	d.findElement(By.name("q")).sendKeys(Keys.ENTER);
	 	
	 	int i = 10;
	 	
	 List<WebElement>	links = d.findElements(By.tagName("a"));
	 
	 System.out.println(links.size());
	 	
	  //	d.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).click();
	 	
	 	d.get("https://www.amazon.in/");
	 	
	 	d.findElement(By.id("twotabsearchtextbox")).sendKeys("watches");
	 	
	 	d.findElement(By.id("nav-search-submit-button")).click();
	 	
	 	*/
	 	
	 	//d.findElement(By.linkText("Gmail")).click();
	 	
	 	d.findElement(By.partialLinkText("Gma")).click();
	 	
	 	Thread.sleep(3000);
	 	
	 	d.close();
	 	
	 	
	 	
	 	
		 
		
	}

}
