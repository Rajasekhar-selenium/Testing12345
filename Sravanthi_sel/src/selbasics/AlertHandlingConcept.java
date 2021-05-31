package selbasics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandlingConcept 
{
	public static void main(String[] args) throws InterruptedException 
	{
        System.setProperty("webdriver.chrome.driver", "D:\\Sekhar_classes\\sravanthi_fst\\dump\\chromedriver_win32\\chromedriver.exe");
		
	    WebDriver d = new ChromeDriver();
	
	    d.manage().window().maximize();
	    
		d.get("https://google.com");
		
		JavascriptExecutor js = ((JavascriptExecutor)d);
		
		js.executeScript("window.alert('Welcome Google')");
		
		String text = d.switchTo().alert().getText();
		
		System.out.println(text);
		
		Thread.sleep(2000);
		
		//d.switchTo().alert().accept();
		
		d.switchTo().alert().dismiss();
		
		Thread.sleep(2000);
		
		d.close();
		
		
		
		
		
		
	}

}
