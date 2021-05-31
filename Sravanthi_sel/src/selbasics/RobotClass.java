package selbasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotClass 

{
	public static void main(String[] args) throws InterruptedException, AWTException 
	{ 
		System.setProperty("webdriver.chrome.driver", "D:\\Sekhar_classes\\sravanthi_fst\\dump\\chromedriver_win32\\chromedriver.exe");
	
	    WebDriver d = new ChromeDriver();
	
	    d.manage().window().maximize();
	    
		d.get("https://www.selenium.dev/");
		
		Thread.sleep(3000);
		
		WebElement ele = d.findElement(By.linkText("Downloads"));
		
		Actions a = new Actions(d);
		
		a.contextClick(ele).build().perform();
		
		Thread.sleep(3000);
		
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_DOWN);
		
		r.keyRelease(KeyEvent.VK_DOWN);
		
		Thread.sleep(2000);
		
        r.keyPress(KeyEvent.VK_DOWN);
		
		r.keyRelease(KeyEvent.VK_DOWN);
		
		Thread.sleep(2000);
		
        r.keyPress(KeyEvent.VK_ENTER);
		
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		Thread.sleep(2000);
		
		//d.close();
		
		d.quit();
		
		
		
		
	}

}
