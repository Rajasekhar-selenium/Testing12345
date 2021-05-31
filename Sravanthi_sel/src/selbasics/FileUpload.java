package selbasics;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload 
{
	
	public static void main(String[] args) 
	{
		try
		{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Sekhar_classes\\sravanthi_fst\\dump\\chromedriver_win32\\chromedriver.exe");
		
	    WebDriver d = new ChromeDriver();
	
	    d.manage().window().maximize();
	    
		d.get("https://smallpdf.com/pdf-to-word");
		
		d.findElement(By.xpath("//*[text()='Choose Files']")).click();
		
		String s = "D:\\raj study\\Jmeter.pdf";  

		StringSelection ss = new StringSelection(s);
		                                           
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		Thread.sleep(5000);
		
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_CONTROL);
		
		r.keyPress(KeyEvent.VK_V);
		
		r.keyRelease(KeyEvent.VK_V);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		
		Thread.sleep(3000);
		
		r.keyPress(KeyEvent.VK_ENTER);
		
		r.keyRelease(KeyEvent.VK_ENTER);
		
		}
		
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		
		
		
		
	}
	

}
