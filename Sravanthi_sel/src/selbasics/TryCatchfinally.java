package selbasics;

public class TryCatchfinally 
{
	public static void main(String[] args) 
	{
		try {
			
		
		 int[]	j = {10, 9, 11, 8, 20};
		
		for(int a = 0; a <= j.length; a++)
		{
			System.out.println("value of index is "+j[a]);
		}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
		   System.out.println(e.getMessage());
		   
		
		}
		finally
		{
			System.out.println("finally block execution");
		}
		
		System.out.println("Try catch Finally concept");
		
	}

}
