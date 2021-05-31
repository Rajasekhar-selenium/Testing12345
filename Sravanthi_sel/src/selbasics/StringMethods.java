package selbasics;

public class StringMethods 
{
	public static void main(String[] args) 
	{
		String s = "seleniumtesting";
		
		System.out.println(s.length());		
		
		System.out.println(s.charAt(5));
		
		if(s.contains("tests"))
		{
			System.out.println("test is available in string");
		}
		else
		{
			System.out.println("NO test available in string");
		}

	
	
	
	}
	

}
