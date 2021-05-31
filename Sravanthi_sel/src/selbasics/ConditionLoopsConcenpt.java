package selbasics;

public class ConditionLoopsConcenpt 
{
	public static void main(String[] args) 
	{	
		
		/*double i = 10.0; 
		
		if(i == 100)
		{
			System.out.println("I value is 10");
		}
		
		else if(i == 10)
		{
			System.out.println("I value is matching with second condition");
		}
		else 
		{
			System.out.println("I value is not matching with 10");
		}
		*/
		
		//FOr loop:
		
	    
	   /* for(int i = 1; i<=5; i++)
	    {
	    	System.out.println("testing");
	    }*/
/*		 int i = 1; int x= 0;
		
		while (i<=10)
		{
			System.out.println("selelnium");
			
			i++;
		}
		*/
		
		
		/* int i = 1; int x= 0;
			
			while (i<=10)
			{
				x = x + i;
				
				i++;
			}
			
			System.out.println(x);
	    
	    */
		/*
		int i = 1; 
		
		do 
		{
			System.out.println("do while loop conditions");
			
			i++;
		}
		while (i<=5);
		*/
		
		// Switch case conditions: 
		
		
		int i = 20;
		
		String test;
			 
			switch (i) 
			{
			    case 5:
				
				test = "I Value is 5";
				
				break;
				
               case 4:
				
				test = "I Value is 4";
				
				break;
				
               case 3:
   				
   				test = "I Value is 3";
   				
   				break;
               case 2:
   				
   				test = "I Value is 2";
   				
   				break;
               case 1:
   				
   				test = "I Value is 1";
   				
   				break;
             
			default:
				
				test = "I Value is not matching with cases";
   
				break;
			}
			 
			 
		System.out.println(test);
		
		
	}

}
