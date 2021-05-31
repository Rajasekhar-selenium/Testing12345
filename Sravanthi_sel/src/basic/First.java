package basic;

public class First 
{
	public  String name = "testing";
	
	 public int a = 10;
	
	public void one()
	{
		System.out.println("Automation testing");
	}
	
	public void two()
	{
		System.out.println("selenium testing");
	}
	
	
	public static void main(String[] args) 
	{
		// System.out.println(name);
		
	 //  System.out.println(First.name);
	   
	  First obj = new First();
	  
	  System.out.println(obj.name);
	  
	  System.out.println(obj.a);
	  
	  obj.one();
		
	}

}
