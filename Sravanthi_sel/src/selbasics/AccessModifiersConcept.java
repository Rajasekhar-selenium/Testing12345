package selbasics;

public class AccessModifiersConcept 
{
	 void a()
	{
		System.out.println("Default modifier");
	}
	 
	 protected void c()
		{
			System.out.println("Protected modifier");
		}
	
	protected void b()
	{
		System.out.println("Private modifier");
	}

	
	public static void main(String[] args)
	{
		AccessModifiersConcept  s = new AccessModifiersConcept();
		
		s.c();
		
	}
	

}
