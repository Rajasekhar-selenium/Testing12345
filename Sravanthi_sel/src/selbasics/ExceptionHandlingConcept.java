package selbasics;

import java.io.IOException;

public class ExceptionHandlingConcept 
{
	public static void main(String[] args) 
	{
		System.out.println("exceptions");
		
		try 
		{
			Thread.sleep(3000);
		}
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
	
		
		try {
			
		
		for(int i = 1; i<1; i ++)
		{
			System.out.println("testing");
		}
		}
		 catch (Exception e) 
		 {
				System.out.println(e.getMessage());
			}
			
		
	}
	
	
	
	

}
