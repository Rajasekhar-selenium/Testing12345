package testng;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataProviderConcept 
{
	
	@DataProvider
	  public Object[][] dp() 
	{
		
	    return new Object[][] 
	   {
	    	
	      new Object[] { 1, "a" },
	      new Object[] { 2, "b" },
	      new Object[] { 3, "c" },
	      new Object[] { 4, "d" },
	    };
	  }
	
	
  @Test(dataProvider = "dp")
  public void values(Integer n, String s) 
  {
	  System.out.println("Value of n and s is "+n+" "+s);
  }

  
}
