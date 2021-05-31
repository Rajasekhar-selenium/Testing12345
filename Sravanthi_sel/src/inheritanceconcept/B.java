package inheritanceconcept;

public class B extends A
{
	public static void main(String[] args) 
	{
		B b = new B();
		
		b.bronze();
		
		b.gold();
		
		b.silver();
		
        b.car();
		
		b.land();
		
		b.house();
		
	}
	
	public void gold()
	{
		System.out.println("gold");
	}
	
	public void silver()
	{
		System.out.println("silver");
	}
	
	public void bronze()
	{
		System.out.println("bronze");
	}
	

}
