package selbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookiesHandling 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Sekhar_classes\\sravanthi_fst\\dump\\chromedriver_win32\\chromedriver.exe");
		
		   WebDriver d = new ChromeDriver();
		
	 	   d.get("https://www.apsrtconline.in/oprs-web/");
	 	   
	 	   d.manage().window().maximize();
	 	   
	 	   d.manage().deleteAllCookies();
		
	       
	 		  
	 		
	 	   
	 	   
	}

}
