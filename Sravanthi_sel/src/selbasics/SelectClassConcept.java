package selbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassConcept 
{
	public static void main(String[] args) throws InterruptedException 
	{
       System.setProperty("webdriver.chrome.driver", "D:\\Sekhar_classes\\sravanthi_fst\\dump\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver d = new ChromeDriver();
		
		d.manage().window().maximize();
		
	 	d.get("http://demo.guru99.com/test/newtours/");
	 	
	 	d.findElement(By.linkText("REGISTER")).click();
	 	
	    WebElement	ele = d.findElement(By.name("country"));
	    
	    Select ss = new Select(ele);
	    
	    ss.selectByIndex(4);
	    
	    Thread.sleep(3000);
	    
	    ss.selectByValue("ICELAND");
	    
	    Thread.sleep(3000);
	    
	    ss.selectByVisibleText("INDIA");
	    
	    Thread.sleep(3000);
	    
	    d.close();
	    
	    
	 
	 
	 
		
	}

}
