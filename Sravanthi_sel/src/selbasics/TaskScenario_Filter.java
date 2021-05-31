package selbasics;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TaskScenario_Filter 
{
	public static void main(String[] args) 
	{
		WebDriver d = new ChromeDriver();
		
		d.get("http://demo.guru99.com/test/newtours/register.php");
		
		WebElement a = d.findElement(By.name("country"));
		
		Select s = new Select(a);
		
		List<WebElement> ldata = s.getOptions();
		
		Set<String> sdata = new HashSet<String>(ldata.size());
		
		for(WebElement web : ldata) {
			sdata.add(web.getText().trim());
	    }
		if(ldata.size()== sdata.size())
		{
			System.out.println("No duplicates");
		}
		else
		{
			System.out.println("Duplicates are available");
		}
		
	}

}
