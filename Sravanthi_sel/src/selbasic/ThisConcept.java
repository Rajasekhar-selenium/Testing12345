package selbasic;

public class ThisConcept 
{
	String name; String id; int salary;
	
	public void testing(String name, String id, int salary)
	{
		this.name = name; 
		
		this.id = id; 
		
		this.salary = salary;
	}
	
	public static void main(String[] args) 
	{
		ThisConcept a = new ThisConcept();
		
		a.testing("hyd", "abc123", 1000);
		
		System.out.println(a.name);
		
		System.out.println(a.id);
		
		System.out.println(a.salary);
		
	}

}
