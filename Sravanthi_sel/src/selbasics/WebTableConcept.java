package selbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableConcept 
{
	public void tableconcept(String reqvalue)
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Sekhar_classes\\sravanthi_fst\\dump\\chromedriver_win32\\chromedriver.exe");
		
		   WebDriver d = new ChromeDriver();
		
	 	   d.get("https://www.apsrtconline.in/oprs-web/");
	 	   
	 	   d.manage().window().maximize();
	 	   
	 	   d.findElement(By.id("txtJourneyDate")).click();
	 	   
	 	  
		List<WebElement> rows = d.findElements(By.xpath("(//*[@class='ui-datepicker-calendar'])[1]/tbody/tr"));
		
		//System.out.println(rows.size());
		
		for(int i=1; i<=rows.size(); i++)
		{
			List<WebElement> cols = d.findElements(By.xpath("(//*[@class='ui-datepicker-calendar'])[1]/tbody/tr["+i+"]/td"));
			
		//	System.out.println(cols.size());
			
			for(int j=1; j<=cols.size(); j++)
			{
			    WebElement dvalue =	d.findElement(By.xpath("(//*[@class='ui-datepicker-calendar'])[1]/tbody/tr["+i+"]/td["+j+"]"));
			    
			    String datevlaue = dvalue.getText();
			    
			    
			    if (datevlaue.equalsIgnoreCase(reqvalue))
			    {
			    	dvalue.click();
			    	
			    	break;
			    }
			    else
			    {
			    	System.out.println("Required value not found");
			    }
			}
			
			
		}
	
		
	}
	
	public static void main(String[] args) 
	{
		WebTableConcept a = new WebTableConcept();
		
		a.tableconcept("21");
		
	}

}
