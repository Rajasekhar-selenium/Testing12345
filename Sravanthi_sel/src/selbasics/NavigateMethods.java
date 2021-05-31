package selbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethods 
{
	public static void main(String[] args) throws InterruptedException 
	{
        System.setProperty("webdriver.chrome.driver", "D:\\Sekhar_classes\\sravanthi_fst\\dump\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver d = new ChromeDriver();
		
		d.manage().window().maximize();
		
		d.get("http://google.com");
		
		Thread.sleep(3000);
		
	 	d.navigate().to("http://demo.guru99.com/test/newtours/");
	
	 	Thread.sleep(3000);
	 	
	 	d.navigate().refresh();
	 	
	 	Thread.sleep(3000);
	 	
	 	d.navigate().back();
	 	
	 	Thread.sleep(3000);
	 	
	 	d.navigate().forward();
	 	
	 	Thread.sleep(3000);
	 	
	 	d.close();
	 	
	 	
		
	}

}
