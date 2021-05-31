package selbasics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page_Screenshot 
{
	public static void main(String[] args) throws IOException 
	{
        System.setProperty("webdriver.chrome.driver", "D:\\Sekhar_classes\\sravanthi_fst\\dump\\chromedriver_win32\\chromedriver.exe");
		
	    WebDriver d = new ChromeDriver();
	
	    d.manage().window().maximize();
	    
		d.get("https://www.selenium.dev/");
		
		TakesScreenshot ss = ((TakesScreenshot)d);
		
	    File pic = ss.getScreenshotAs(OutputType.FILE);
	    
	    //D:\Sekhar_classes\sravanthi_fst\dump\images
	    
	    FileUtils.copyFile(pic, new File("D:\\Sekhar_classes\\sravanthi_fst\\dump\\images\\test.png"));
		
		
	}

}
