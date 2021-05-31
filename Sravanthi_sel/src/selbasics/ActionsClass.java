package selbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass 
{
	
	public static void main(String[] args) throws InterruptedException
	{
		
	System.setProperty("webdriver.chrome.driver", "D:\\Sekhar_classes\\sravanthi_fst\\dump\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver d = new ChromeDriver();
	
	d.manage().window().maximize();
	
	/*d.get("https://www.selenium.dev/");
	
	Thread.sleep(3000);
	
	WebElement ele = d.findElement(By.linkText("Downloads"));
	
	Actions a = new Actions(d);
	
	a.contextClick(ele).build().perform();
	*/
	
    d.get("https://jqueryui.com/droppable/");
	
	Thread.sleep(3000);
	
	d.switchTo().frame(0);
	
	WebElement src = d.findElement(By.id("draggable"));
	
	WebElement tar = d.findElement(By.id("droppable"));
	
	Actions a = new Actions(d);
	
	a.dragAndDrop(src, tar).build().perform();
	
	Thread.sleep(3000);
	
	d.switchTo().defaultContent();
		
	}

}
