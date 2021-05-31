package polyconcept;

public class OL 
{
	public void one()
	{
		System.out.println("OverLoading");
	}
	
	public void one(String m)
	{
		System.out.println("value of string is "+m);
	}
	
	public void one(int i)
	{
		System.out.println("value of string is "+i);
	}
	
	public void one(int i, int j)
	{
		System.out.println("value of string is "+i+j);
		
		//System.out.println("value of string is "+j);
	}
	public static void main(String[] args) 
	{
		OL a = new OL();
		
		a.one(100, 200);
		
	}
	

}
