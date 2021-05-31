package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionsConcept {
 // @Test
  public void testing() 
  {
	  WebDriver d = new ChromeDriver();
		
		d.get("http://google.com");
		
		Assert.assertEquals(d.getTitle(), "Google", "Required browser is not found");
		
		System.out.println("test pass");
		
		/*String Actualtitle = d.getTitle();
		
		String exptitle = "Ggle";
		
		if(Actualtitle.equalsIgnoreCase(exptitle))
		{
			System.out.println("Required browser is launched");
		}
		else
		{
			System.out.println("Required browser is NOT launched");
		}*/
		
		
  }
  
  @Test
  public void testing1() 
  {
	  WebDriver d = new ChromeDriver();
		
		d.get("http://google.com");
		
		//Hard assert
		
	//	Assert.assertEquals(d.getTitle(), "Gogle", "Required browser is not found");
		
		SoftAssert a = new SoftAssert();
		
		a.assertEquals(d.getTitle(), "Gogle");
		
		System.out.println("test pass");
		a.assertAll();
  }
}
