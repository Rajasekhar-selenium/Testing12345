package selbasics;

public class ConstructorConcept 
{
	
	
	String n; int j;
	 public void test()
	 {
		 System.out.println("Constructor  Concept");
	 }
	 
	 ConstructorConcept(String m, int i)
	 {
		 System.out.println("testing");
		 
		  n = m;  j = i;
		 
		 
	 }
	 
	 public static void main(String[] args) 
	 {
		 ConstructorConcept a = new ConstructorConcept("hyd", 100);
		 
		 a.test();
		 
		 System.out.println(a.n);
		 
		 System.out.println(a.j);
			
		
	}
	 

}
