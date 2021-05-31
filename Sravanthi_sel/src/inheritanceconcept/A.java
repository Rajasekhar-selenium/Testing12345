package inheritanceconcept;

public class A 
{
	public static void main(String[] args) 
	{
		A a = new A();
		
		a.car();
		
		a.land();
		
		a.house();
	}
	
	public void land()
	{
		System.out.println("land");
	}
	
	public void house()
	{
		System.out.println("house");
	}
	
	public void car()
	{
		System.out.println("car");
	}
	

}
