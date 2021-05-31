package selbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitConditions 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Sekhar_classes\\sravanthi_fst\\dump\\chromedriver_win32\\chromedriver.exe");
		
		   WebDriver d = new ChromeDriver();
		   
		   d.manage().window().maximize();
		   
		   d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	 	   d.get("http://www.indianrail.gov.in/enquiry/StaticPages/StaticEnquiry.jsp?StaticPage=index.html");
	 	   
	 	   
	 	   
	 	   d.findElement(By.linkText("Services")).click();
	 	   
	 	//  d.findElement(By.linkText("National Train Enquiry System")).click();
	 	   
	 	   JavascriptExecutor js = ((JavascriptExecutor)d);
	 	   
	 	   js.executeScript("window.scrollBy(0,500)");
	 	   
	 	   
	 	   
	 	  WebDriverWait wait = new WebDriverWait(d, 20);
	 	  
		 	WebElement ele =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("National Train Enquiry System")));
		 	
		 	ele.click();
	 	   
	 	   d.findElement(By.xpath("//*[contains(text(),'Train Schedule')]")).click();
		
	 	   
	 	  
	}

}
